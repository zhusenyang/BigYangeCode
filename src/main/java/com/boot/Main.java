package com.boot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

/** 
* @author 作者 竺森洋: 
* @version 创建时间：2019年3月13日 下午7:20:39 
* 类说明 :
*/
@EnableAutoConfiguration
@MapperScan(basePackages="com.boot.dao")
@ComponentScan("com.boot")
public class Main {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SpringApplication.run(Main.class,args);
		
	}
	
}
 