package com.boot.service;

import com.boot.dao.LoginHistoryDao;
import com.boot.dao.UserDao;
import com.boot.entity.LoginHistory;
import com.boot.entity.WebUser;
import com.boot.utile.AddressUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;

@Service
public class UserService {

    @Autowired
    UserDao userDao;

    @Autowired
    LoginHistoryDao loginHistoryDao;

    public  int addLoginHistory(LoginHistory history){
        return loginHistoryDao.addNewHistory(history);
    }


    public  int addLoginHistory(HttpServletRequest request, WebUser user){
        LoginHistory history = new LoginHistory();
        Date loginDate = new Date();
        history.setLoginTime(loginDate);
        history.setLoginDate(loginDate);
        history.setIp(AddressUtil.getRealIp(request));
        history.setLoginAddress(AddressUtil.getAddressByIP(history.getIp()));
        history.setArea(history.getLoginAddress().getAddress());
        history.setUserId(user.getId());
        return loginHistoryDao.addNewHistory(history);
    }
}
