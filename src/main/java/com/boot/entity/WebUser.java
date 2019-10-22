package com.boot.entity;

import java.io.Serializable;
import java.util.Date;

public class WebUser implements Serializable {
	private static final long serialVersionUID = -8366929034564774130L;
	/**
	 * id
	 */
	private Integer id;
	/**
	 * 用户名
	 */
	private String userName;
	/**
	 * 密码
	 */
	private String password;
	/**
	 * 注册日期
	 */
	private Date registered_Date;
	/**
	 * 地区
	 */
	private String area;
	/**
	 * 密码盐
	 */
	private String salt;
	/**
	 * 头像
	 */
	private String head;
	/**
	 * 昵称
	 */
	private String nicoName;
	/**
	 * 邮箱
	 */
	private String eMail;

	public String getHead() {
		return head;
	}

	public void setHead(String head) {
		this.head = head;
	}

	public String getNicoName() {
		return nicoName;
	}

	public void setNicoName(String nicoName) {
		this.nicoName = nicoName;
	}

	public String geteMail() {
		return eMail;
	}

	public void seteMail(String eMail) {
		this.eMail = eMail;
	}

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
