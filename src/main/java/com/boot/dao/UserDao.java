package com.boot.dao;

import com.boot.entity.UserOperate;
import org.apache.ibatis.annotations.*;

import com.boot.entity.WebUser;

import java.util.List;

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
	@Insert("insert into user_operate(user_id,operate_type,operate_result,result_class,operate_time)  " +
			"values(#{user_id},#{operate_type},#{operate_result},#{result_class},#{operate_time})")
	public Integer insertUserOperate(UserOperate result_class);
	@Insert("insert into webuser(username,password,registered_Date,area,salt,niconame)" +
			"values(#{userName},#{password},#{registered_Date},#{area},#{salt},#{nicoName})")
	public Integer insertUser(WebUser webUser);

	@Select("select * from user_operate where user_id=#{userId} order by operate_time")
	public List<UserOperate> selectUserOperrate(Integer userId);

}
