package com.boot.entity;

import java.io.Serializable;
import java.util.Date;

public class WebUser implements Serializable {
	private static final long serialVersionUID = -8366929034564774130L;
	private Integer id;
	private String userName;
	private String password;
	private Date registered_Date;
	private String area;
	private String salt;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Date getRegistered_Date() {
		return registered_Date;
	}
	public void setRegistered_Date(Date registered_Date) {
		this.registered_Date = registered_Date;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public String getSalt() {
		return salt;
	}
	public void setSalt(String salt) {
		this.salt = salt;
	}
	
}
