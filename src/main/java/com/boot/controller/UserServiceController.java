package com.boot.controller;

import com.boot.entity.Message;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.message.LoggerNameAwareMessage;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.boot.entity.WebUser;

/**
 * @author yang
 * @date 20192019年4月10日下午4:38:38
 * @类说明
 */
@Controller("/user")
public class UserServiceController {
	Logger logger = LogManager.getLogger(UserServiceController.class);
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
		return "index.html";
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

	@RequestMapping("/user/logout")
	@ResponseBody
	public Message logout(){
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
}
