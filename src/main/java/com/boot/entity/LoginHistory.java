package com.boot.entity;
import com.boot.utile.AddressUtil;
import jdk.nashorn.internal.objects.annotations.Getter;

import java.util.Date;

public class LoginHistory {
	private Integer id;
	private String ip;
	private Integer userId;
	private String area;
	private Date loginDate;
	private Date loginTime;
	LoginAddress loginAddress;

	public void setLoginAddress(LoginAddress loginAddress) {
		this.loginAddress = loginAddress;
	}

	public LoginAddress getLoginAddress() {
		return loginAddress;
	}

	public Date getLoginTime() {
		return loginTime;
	}
	public void setLoginTime(Date loginTime) {
		this.loginTime = loginTime;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public String getIp() {
		return ip;
	}
	public void setIp(String ip) {
		this.ip = ip;
		LoginAddress addr=AddressUtil.getAddressByIP(ip);

		area=addr.toString();
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public Date getLoginDate() {
		return loginDate;
	}
	public void setLoginDate(Date loginDate) {
		this.loginDate = loginDate;
	}
	public static LoginHistory createHistory(WebUser user,String userip){
		if (user==null){
			return null;
		}else{
			LoginHistory history =new LoginHistory();
			history.setIp(userip);
			Date date = new Date();
			history.setLoginDate(date);
			history.setLoginTime(date);
			history.setUserId(user.getId());
			history.setArea("");
		}
		return new LoginHistory();
	}
	
}
