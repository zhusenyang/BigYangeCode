package com.boot.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.boot.dao.ArticleMapper;
import com.boot.dao.ArticleTypeMapper;
import com.boot.entity.Article;
import com.boot.entity.ArticleType;
import com.boot.utile.MD5;

/** 
* @author 作者 竺森洋: 
* @version 创建时间：2019年3月13日 下午7:25:43 
* 类说明 :
*/
@Controller
public class PageContrllor {
	@RequestMapping("/")
	public String home(){
		return "index.html";
	}
	@RequestMapping("/index")
	public String index(){
		return "index.html";
	}
	@RequestMapping("/demo")
	public String demo(){
		return "demo.html";
	}
	@RequestMapping("/game")
	public String game(){
		return "game.html";
	}
	@RequestMapping("/life")
	public String life(){
		return "life.html";
	}
	@RequestMapping("/time")
	public String time(){
		return "time.html";
	}
	@RequestMapping("/gbook")
	public String gbook(){
		return "gbook.html";
	}
	@RequestMapping("/info")
	public String info(){
		return "info.html";
	}
	@RequestMapping("/中文")
	public String chinesePage(){
		return"index.html";
	}
}
 