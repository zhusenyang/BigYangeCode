package com.boot.controller;

import java.util.List;

import org.apache.logging.log4j.Logger;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.boot.config.ShiroRealm;
import com.boot.dao.ArticleMapper;
import com.boot.dao.ArticleTypeMapper;
import com.boot.dao.UserDao;
import com.boot.entity.ArticleType;
import com.boot.entity.Message;
import com.boot.entity.WebUser;
import com.boot.utile.MD5;

/** 
* @author 作者 竺森洋: 
* @version 创建时间：2019年3月19日 上午11:28:52 
* 类说明 :
*/
@Controller
public class PublicServiceController {
	@Autowired
	UserDao userDao;
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
	public Message login(String userName,String password,String salt){
		Message msg =Message.createMessage();
		String realPassword=MD5.MD5EncodeByUTF8(password+salt);
		try {
			UsernamePasswordToken token = new UsernamePasswordToken(userName, realPassword);
	        SecurityUtils.getSubject().login(token);
	        msg.setContent("登入成功");
	        msg.setStateNum(400);
		}catch(Exception e ) {
			msg.setContent("登入失败");
	        msg.setStateNum(500);
		}
		
		
//		if(salt==null) {
//			WebUser webUser= userDao.findUserByName(userName);
//			if (webUser==null) {
//				msg.setContent("登入失败");
//				return msg;
//			}
//			salt=webUser.getSalt();
//		}
//		String realPassword=MD5.MD5EncodeByUTF8(password+salt);
//		Integer id=userDao.findUserByNameAndPassword(userName, realPassword);//
//		if(id!=null) {
//			//登入成功
//			msg.setContent("登入成功");
//		}else {
//			//登入失败3
//			msg.setContent("帐号或密码错误,登入失败");
//		}
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
}
 