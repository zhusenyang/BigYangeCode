package com.boot.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.boot.entity.WebUser;
import org.apache.ibatis.annotations.Update;

@Mapper
public interface UserDao {
	
	@Select("select * from WebUser where userName=#{userName} and password=#{password}")
	public WebUser findUserByNameAndPassword(@Param("userName") String userName,@Param("password")String password);
	
	@Select("select id,salt from WebUser where userName=#{userName}")
	public WebUser findUserByName(@Param("userName") String userName);
	@Select("select * from WebUser where userName=#{userName}")
	public WebUser findUserByNameForShrio(@Param("userName") String userName);

	@Update("update WebUser set niconame=#{nicoName} , area=#{area},introduction=#{introduction},head=#{head},sex=#{sex} where id=#{id}")
	public Integer updateUserCenter(WebUser user);
}
