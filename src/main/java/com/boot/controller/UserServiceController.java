package com.boot.controller;

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
	
	/**
	 * @param token 用户登入认证密钥
	 * @return 返回用户类
	 */
	@RequestMapping("/getUserInfo")
	@ResponseBody
	public WebUser getUsreInfo(String token) {
		return null;
	}
}
