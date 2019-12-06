package com.boot.entity;

import java.util.Date;

public class VisitorHistory {
    /**
     * 访问id
     */
    Integer id;
    /**
     * 访问ip
     */
    String visitor_ip;
    /**
     * 访问日期
     */
    Date visitor_date;
    /**
     * 访问时间
     */
    Date visitor_time;
    /**
     * 访问页面
     */
    String visitor_page;
    /**
     * 访问用户id
     */
    Integer user_id;

    String area;

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getVisitor_ip() {
        return visitor_ip;
    }

    public void setVisitor_ip(String visitor_ip) {
        this.visitor_ip = visitor_ip;
    }

    public Date getVisitor_date() {
        return visitor_date;
    }

    public void setVisitor_date(Date visitor_date) {
        this.visitor_date = visitor_date;
    }

    public Date getVisitor_time() {
        return visitor_time;
    }

    public void setVisitor_time(Date visitor_time) {
        this.visitor_time = visitor_time;
    }

    public String getVisitor_page() {
        return visitor_page;
    }

    public void setVisitor_page(String visitor_page) {
        if ( visitor_page==null){
            visitor_page="";
        }
        this.visitor_page = visitor_page;
    }

    public Integer getUser_id() {
        return user_id;
    }

    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }
}
