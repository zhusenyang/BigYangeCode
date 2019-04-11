package com.boot.controller;

import java.util.Date;
import java.util.List;

import com.boot.dao.LoginHistoryDao;
import com.boot.entity.LoginHistory;
import com.boot.utile.AddressUtil;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
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
	@Autowired
	UserDao userDao;
	@Autowired
	ArticleMapper articleMapper;
	@Autowired
	ArticleTypeMapper articleTypeMapper;
	@Autowired
	LoginHistoryDao loginHistoryDao;

	@RequestMapping("/getMenu")
	@ResponseBody
	public List<ArticleType> getMenuList(){
		List<ArticleType> allType=articleTypeMapper.getAllType();
		ArticleType.analyzeListType(allType);
		return allType;
	}
	@PostMapping("/login")
	@ResponseBody
	public Message login(HttpServletRequest request, String userName, String password, String salt){
		String ip=AddressUtil.getRealIp(request);
		Message msg =Message.createMessage();
		if(salt==null) {
			WebUser webUser= userDao.findUserByName(userName);

			if (webUser==null) {
				msg.setContent("登入失败");
				return msg;
			}else {
				salt=webUser.getSalt();
				String realPassword=MD5.MD5EncodeByUTF8(password+salt);
				WebUser user=userDao.findUserByNameAndPassword(userName, realPassword);//
				try{
					UsernamePasswordToken usernamePasswordToken =new UsernamePasswordToken(userName,realPassword);
					SecurityUtils.getSubject().login(usernamePasswordToken);
					Date date = new Date();
					LoginHistory history =new LoginHistory();
					history.setUserId(webUser.getId());
					history.setIp(ip);
					history.setLoginDate(date);
					history.setLoginTime(date);
//					loginHistoryDao.addNewHistory(history);
					int i =loginHistoryDao.addNewHisInt(history.getIp(),history.getUserId(),history.getArea(),history.getLoginDate(),history.getLoginTime());
					int j =loginHistoryDao.addNewHistory(history);
					msg.setStateNum(200);
					msg.setContent("登入成功");

				}catch (Exception e){

					System.out.println(e);
					msg.setContent(e.toString());
					msg.setStateNum(500);
				}
			}
		}

//		if(id!=null) {
//			//登入成功
//			msg.setContent("登入成功");
//		}else {
//			//登入失败
//			msg.setContent("帐号或密码错误,登入失败");
//		}
		return msg;
	}
	
	public Message registeredUser() {
		Message msg=Message.createMessage();
		if (true) {
			//TODO 判断用户是否登入
			//对已登入用户拒绝开放注册服务
		}else {
			//开放注册
		}
		return msg;
	}
}
 