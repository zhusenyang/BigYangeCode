package com.boot.controller;

import com.boot.dao.UserDao;
import com.boot.entity.Message;
import com.boot.entity.UserOperate;
import com.boot.service.UserService;
import com.boot.utile.DateUtil;
import com.boot.utile.JacksonUtil;
import com.boot.utile.ShiroUtil;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.ClassUtils;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.boot.entity.WebUser;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.Random;

/**
 * @author yang
 * @date 20192019年4月10日下午4:38:38
 * @类说明
 */
@RequestMapping("/user")
@Controller
public class UserServiceController {

	Logger logger = LogManager.getLogger(UserServiceController.class);
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

	/**
	 * @param token 用户登入认证密钥
	 * @return 返回用户类
	 */
	@RequestMapping("/getUserInfo")
	@ResponseBody
	public WebUser getUsreInfo(String token) {
		return null;
	}

	@RequestMapping("/center")
	public String center(){
		Subject cuser = SecurityUtils.getSubject();
		if (cuser.isAuthenticated()){
			return "index.html";
		}
		return "login.html";
	}

	@RequestMapping("/like")
	public String like(){
		Subject cuser = SecurityUtils.getSubject();
		if (cuser.isAuthenticated()){
			return "index.html";
		}
		return "login.html";
	}

	@RequestMapping("/message")
	public String message(){
		Subject cuser = SecurityUtils.getSubject();
		if (cuser.isAuthenticated()){
			return "index.html";
		}
		return "login.html";
	}

	@RequestMapping("/history")
	public String browsHistory(){
		Subject cuser = SecurityUtils.getSubject();
		if (cuser.isAuthenticated()){
			return "index.html";
		}
		return "login.html";
	}

	/**
	 * 用户登出
	 * @return
	 */
	@RequestMapping("/logout")
	@ResponseBody
	public Message logout(){
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

	/**
	 * 获取用户信息
	 * @return
	 */
	@RequestMapping("/getInfo")
	@ResponseBody
	public Message getUserInfo(){
		Message msg = new Message();
		Subject cuser = SecurityUtils.getSubject();
		if (cuser.isAuthenticated()){
			WebUser webUser = (WebUser) SecurityUtils.getSubject().getPrincipal();
			msg.setStateNum(Message.SUCCESS_NUM);
			msg.setData(webUser);
		}
		return msg;
	}

	/**
	 * 用户信息修改
	 * @return
	 */
	@RequestMapping("/userCenterSave")
	@ResponseBody
	public Message saveUserCenter(WebUser user, MultipartFile file){
		Message msg = new Message();
		if (file!=null){
			String path = ClassUtils.getDefaultClassLoader().getResource("").getPath()+"static/head/";
			String endWith = file.getOriginalFilename().split("\\.")[1];
			Random random =  new Random(9);
			int num = random.nextInt()+random.nextInt()+random.nextInt()+random.nextInt()+random.nextInt();
			String fileName = DateUtil.getDateForDay() +num+"."+endWith;
			File newFile = new File(path+fileName);
			if(!newFile.getParentFile().exists()){
				newFile.getParentFile().mkdirs();
			}
			try {
				file.transferTo(newFile);
			} catch (IOException e) {
				e.printStackTrace();
				logger.error("上传失败....");
				msg.setStateNum(Message.ERROR_NUM);
				msg.setContent("上传失败.");
			}
			user.setHead(fileName);
		}
		logger.info(user.getHead());
		if (user.getHead()==null){
			user.setHead(ShiroUtil.getUser().getHead());
		}
		// TODO: 2019/11/9 删除原先的头像
		Integer result = userDao.updateUserCenter(user);
		if (result!=null &&result>0){
			userService.updateUserInfoFromUserCenter(user);
			String resultClass = user.getClass().getName();
			String resultJson = JacksonUtil.toJSon(user);
			UserOperate userOperate = new UserOperate();
			userOperate.setUser_id(user.getId());
			userOperate.setOperate_result(resultJson);
			userOperate.setOperate_type(0);
			userOperate.setResult_class(resultClass);
			userOperate.setOperate_time(new Date());
			userDao.insertUserOperate(userOperate);
			msg.setStateNum(Message.SUCCESS_NUM);
			msg.setContent("更新成功");
			logger.debug("更新成功.");
		}else{
			msg.setStateNum(Message.ERROR_NUM);
			msg.setContent("更新失败");
			logger.debug("更新失败.");
		}
		return msg;
	}

	/**
	 * 获取用户操作记录
	 * @param userid
	 * @return
	 */
	@RequestMapping("/operate/{userid}")
	@ResponseBody
	public List getUserOprate(@PathVariable String userid,Integer page,Integer limit){
		try{
			Integer userId = Integer.parseInt(userid);
			List result = userService.getUserOprate(userId);
			return result;
		}catch (Exception e){
			logger.error(e.getMessage());
		}
		return null;
	}
}
