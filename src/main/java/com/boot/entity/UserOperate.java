package com.boot.entity;

import java.util.Date;

/**
 * 用户操作记录
 */
public class UserOperate {
    /**
     * 操作记录id
     */
    Integer id;
    /**
     * 操作用户id
     */
    Integer user_id;
    /**
     * 操作类型：<0删除 0更新 >0新增
     */
    Integer operate_type;
    /**
     * 操作后的结果对象（json字符串）
     */
    String operate_result;
    /**
     * 结果对象类 集合json字符串 利用反射及jackson工具获得具体结果对象
     */
    String result_class;

    /**
     * 操作时间
     */
    Date operate_time;

    public Date getOperate_time() {
        return operate_time;
    }

    public void setOperate_time(Date operate_time) {
        this.operate_time = operate_time;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUser_id() {
        return user_id;
    }

    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }

    public Integer getOperate_type() {
        return operate_type;
    }

    public void setOperate_type(Integer operate_type) {
        this.operate_type = operate_type;
    }

    public String getOperate_result() {
        return operate_result;
    }

    public void setOperate_result(String operate_result) {
        this.operate_result = operate_result;
    }

    public String getResult_class() {
        return result_class;
    }

    public void setResult_class(String result_class) {
        this.result_class = result_class;
    }
}
