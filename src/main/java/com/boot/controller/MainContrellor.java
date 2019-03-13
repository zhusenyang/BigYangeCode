package com.boot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/** 
* @author 作者 竺森洋: 
* @version 创建时间：2019年3月13日 下午7:25:43 
* 类说明 :
*/
@Controller
public class MainContrellor {
	@RequestMapping
	public String index(){
		return "index";
	}
}
 