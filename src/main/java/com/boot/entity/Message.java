package com.boot.entity;

import org.springframework.stereotype.Component;

import java.io.Serializable;

/** 
* @author 作者 竺森洋: 
* @version 创建时间：2019年3月29日 下午4:03:12 
* 类说明 :
*/
public class Message implements Serializable {

	public static  final int SUCCESS_NUM = 200;
	public static  final int ERROR_NUM = 500;
	public static  final int USER_NO_LOGIN = 300;
	private static final long serialVersionUID = 5978811454467951173L;
	private int StateNum;
	private Object Content;
	private Object Date;

	public Object getDate() {
		return Date;
	}

	public void setDate(Object date) {
		Date = date;
	}

	public Message() {
		super();
	}
	public Message(int stateNum, String content) {
		super();
		StateNum = stateNum;
		Content = content;
	}
	public int getStateNum() {
		return StateNum;
	}
	public void setStateNum(int stateNum) {
		StateNum = stateNum;
	}
	public Object getContent() {
		return Content;
	}
	public void setContent(String content) {
		Content = content;
	}
	public static Message createMessage(){
		return new Message();
	}
	public static Message createMessage(int stateNum,String content){
		return new Message(stateNum,content);
	}
}
 