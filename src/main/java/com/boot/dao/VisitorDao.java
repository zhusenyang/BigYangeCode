package com.boot.dao;

import com.boot.entity.VisitorHistory;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;
@Mapper
public interface VisitorDao {

    @Insert("insert into Visitor_history(visitor_ip,visitor_date,Visitor_page,visitor_time,user_id,area) " +
            "values(#{visitor_ip},#{visitor_date},#{visitor_page},#{visitor_time},#{user_id},#{area}) ")
    public int insertVisitorHistory(VisitorHistory visitorHistory);

    @Select("select * from Visitor_history")
    public List<VisitorHistory> queryAllVisitorHistory();
}
