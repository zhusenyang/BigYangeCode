package com.boot.dao;

import com.boot.entity.LoginHistory;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.Date;

@Mapper
public interface LoginHistoryDao {

    @Insert("insert into loginhistory(ip,userid,area,logindate,logintime) values(#{ip},#{userId},#{area},#{loginDate},#{loginTime})")
    public int addNewHistory(LoginHistory history);

    @Insert("insert into loginhistory(ip,userid,area,logindate,logintime) values(#{ip},#{userId},#{area},#{loginDate},#{loginTime})")
    public int addNewHisInt(String ip, Integer userId, String area,  Date loginDate, Date loginTime);
}
