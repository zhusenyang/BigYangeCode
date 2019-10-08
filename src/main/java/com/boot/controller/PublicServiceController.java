package com.boot.controller;

import java.util.Date;
import java.util.List;

import com.boot.entity.LoginHistory;
import com.boot.service.UserService;
import com.boot.utile.AddressUtil;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
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

	@RequestMapping("/getMenu")
	@ResponseBody
	public List<ArticleType> getMenuList(){
		List<ArticleType> allType=articleTypeMapper.getAllType();
		ArticleType.analyzeListType(allType);
		return allType;
	}
	@PostMapping("/login")
	@ResponseBody
	public Message login(String userName, String password, String salt, HttpServletRequest request){
		Message msg =Message.createMessage();
		WebUser wb = userDao.findUserByName(userName);
		if (wb==null){
			msg.setContent("帐号或密码错误");
			msg.setStateNum(500);
		}
		String real_salt=wb.getSalt();
		String realPassword=MD5.MD5EncodeByUTF8(password+real_salt);
		WebUser user = userDao.findUserByName(userName);

		try {
			UsernamePasswordToken token = new UsernamePasswordToken(userName, realPassword);
			logger.info("开始验证用户信息");
	        SecurityUtils.getSubject().login(token);
	        WebUser webUser = userDao.findUserByNameAndPassword(userName,realPassword);
	        userService.addLoginHistory(request,webUser);
			msg.setDate(webUser);
	        msg.setContent("登入成功");
	        msg.setStateNum(200);
		}catch(Exception e ) {
			msg.setContent(e.toString());
			logger.error(e.getMessage());
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
	public Message checkUserLogin(){
		Message msg = Message.createMessage();
		return msg;
	}
}
 