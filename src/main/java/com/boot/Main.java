package com.boot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
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
public class Main extends SpringBootServletInitializer {
	
	public static void main(String[] args) {

		SpringApplication.run(Main.class,args);
		
	}

	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder){
		return  builder.sources(Main.class);
	}
}
 