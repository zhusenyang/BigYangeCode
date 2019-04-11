package com.boot.entity;

public class LoginAddress {
    String address;
    String province;
    String city;
    String ip;
    public LoginAddress(){}
    public LoginAddress(String province,String city){
        setAddress(province);
        setCity(city);
    }
    public void setAddress(String address) {
        this.address = address;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getAddress() {
        return address;
    }

    public String getCity() {
        return city;
    }

    public String getIp() {
        return ip;
    }

    public String getProvince() {
        return province;
    }

    @Override
    public String toString() {
        return getProvince()+"-"+getCity();
    }

    public boolean isLAN_NET(){

        if (address==null||"".equals(address)) return false;
        if (city==null||"".equals(city)) return false;
        if (province==null||"".equals(province)) return false;
        return false;
    }
}
