package com.boot.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.boot.entity.WebUser;

@Mapper
public interface UserDao {
	
	@Select("select * from WebUser where userName=#{userName} and password=#{password}")
	public WebUser findUserByNameAndPassword(@Param("userName") String userName,@Param("password")String password);
	
	@Select("select id,salt from WebUser where userName=#{userName}")
	public WebUser findUserByName(@Param("userName") String userName);
}
