package com.boot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

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
		if(salt==null) {
			WebUser webUser= userDao.findUserByName(userName);
			if (webUser==null) {
				msg.setContent("登入失败");
				return msg;
			}
			salt=webUser.getSalt();
		}
		String realPassword=MD5.MD5EncodeByUTF8(password+salt);
		System.out.println(userName+"\r"+realPassword);
		Integer id=userDao.findUserByNameAndPassword(userName, realPassword);//
		if(id!=null) {
			//登入成功
			msg.setContent("登入成功");
		}else {
			//登入失败
			msg.setContent("帐号或密码错误,登入失败");
		}
		return msg;
	}
}
 