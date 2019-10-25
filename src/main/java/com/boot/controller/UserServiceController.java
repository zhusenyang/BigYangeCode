package com.boot.controller;

import com.boot.dao.UserDao;
import com.boot.entity.Message;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.message.LoggerNameAwareMessage;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.boot.entity.WebUser;

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
		return "like.html";
	}

	@RequestMapping("/message")
	public String message(){
		return "message.html";
	}

	@RequestMapping("/browsHistory")
	public String browsHistory(){
		return "browsHistory.html";
	}


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
}
