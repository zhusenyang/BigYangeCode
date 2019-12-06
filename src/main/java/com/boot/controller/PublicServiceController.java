package com.boot.controller;

import java.util.Date;
import java.util.List;

import com.boot.entity.VisitorHistory;
import com.boot.service.VisitorService;
import com.boot.service.UserService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.boot.dao.ArticleMapper;
import com.boot.dao.ArticleTypeMapper;
import com.boot.dao.UserDao;
import com.boot.entity.ArticleType;
import com.boot.entity.Message;
import com.boot.entity.WebUser;
import com.boot.utile.MD5;

import javax.servlet.http.HttpServletRequest;

/** 
* @author 作者 竺森洋: 
* @version 创建时间：2019年3月19日 上午11:28:52 
* 类说明 :
*/
@Controller
public class PublicServiceController {
	Logger logger= LogManager.getLogger(PublicServiceController.class);

	/**
	 * 用户dao层
	 */
	@Autowired
	UserDao userDao;
	/**
	 * 用户服务层
	 */
	@Autowired
	UserService userService;

	@Autowired
	ArticleMapper articleMapper;
	@Autowired
	ArticleTypeMapper articleTypeMapper;
	@Autowired
	VisitorService visitorService;

	@RequestMapping("/getMenu")
	@ResponseBody
	public List<ArticleType> getMenuList(){
		List<ArticleType> allType=articleTypeMapper.getAllType();
		ArticleType.analyzeListType(allType);
		return allType;
	}

	@PostMapping("/login")
	@ResponseBody
	public Message login( String userName, String password, HttpServletRequest request){
		Message msg =Message.createMessage();
		WebUser wb = userDao.findUserByName(userName);
		logger.info("查询用户是否存在");
		if (wb==null){
			msg.setContent("帐号或密码错误");
			msg.setStateNum(500);
			return msg;
		}
		String real_salt=wb.getSalt();
		String realPassword=MD5.MD5EncodeByUTF8(password+real_salt);
		try {
			UsernamePasswordToken token = new UsernamePasswordToken(userName, realPassword);
			token.setRememberMe(true);
			logger.info("开始验证用户信息");
			Subject currentUser = SecurityUtils.getSubject();
			logger.info("当前用户信息:{}"+currentUser.getPrincipal());
			currentUser.login(token);
	        WebUser webUser = (WebUser) currentUser.getPrincipal();
			logger.info("当前用户信息:{}"+currentUser.getPrincipal());
			userService.addLoginHistory(request,webUser);

	        msg.setContent("登入成功");
	        msg.setStateNum(200);
		}catch(Exception e ) {
			msg.setContent(e.toString());
			logger.error(e.getMessage());
			msg.setStateNum(Message.ERROR_NUM);
	        msg.setStateNum(500);
		}
		return msg;
	}
	
	public Message registeredUser() {
		Message msg=Message.createMessage();
		if (true) {//TODO 判断用户是否登入
			//对已登入用户拒绝开放注册服务
		}else {
			//开放注册
		}
		return msg;
	}

	/**
	 * 验证用户是否已经登入
	 * @return
	 */
	@RequestMapping("/checkUserLogin")
	@ResponseBody
	public  Message checkUserLogin(){
		Message msg = Message.createMessage();
		msg.setStateNum(Message.SUCCESS_NUM);
		logger.info("验证用户是否登入..");
		Subject currentUser = SecurityUtils.getSubject();

		logger.info("当前用户信息:{}"+currentUser.getPrincipal());
		msg.setData(currentUser.getPrincipal());
		if (!currentUser.isAuthenticated()){// 若用户登入验证正确则返回
			msg.setStateNum(Message.USER_NO_LOGIN);
		}
		return msg;
	}

	/**
	 * 用户登出
	 * @return
	 */
	@RequestMapping("/logout")
	@ResponseBody
	public Message logOut(){
		logger.info("用户注销.");
		Message msg = new Message();
		Subject currentUser = SecurityUtils.getSubject();
		if (currentUser!=null){
			currentUser.logout();
			msg.setStateNum(Message.SUCCESS_NUM);
		}else{
			msg.setStateNum(Message.USER_NO_LOGIN);
			msg.setContent("用户并未登入.");
		}
		return msg;
	}

	/** 生成访问记录
	 * @param page 访问页面
	 * @return
	 */
	@RequestMapping("/visitor")
	@ResponseBody
	public Message visitorHistory(String page,HttpServletRequest request){
		Message msg = new Message();
		Subject currentUser = SecurityUtils.getSubject();
		VisitorHistory visitorHistory = new VisitorHistory();
		Date date = new Date();
		visitorHistory.setVisitor_date(date);
		visitorHistory.setVisitor_time(date);
		visitorHistory.setVisitor_page(page);
		if (currentUser.isAuthenticated()){
			WebUser webUser = (WebUser) currentUser.getPrincipal();
			visitorHistory.setUser_id(webUser.getId());
		}
		boolean flag = visitorService.addVisitorHistory(visitorHistory,request);
		if (flag){
			msg.setStateNum(Message.SUCCESS_NUM);
		}
		return msg;
	}
}
 