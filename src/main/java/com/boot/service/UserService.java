package com.boot.service;

import com.boot.dao.LoginHistoryDao;
import com.boot.dao.UserDao;
import com.boot.entity.LoginHistory;
import com.boot.entity.WebUser;
import com.boot.utile.AddressUtil;
import com.boot.utile.ShiroUtil;
import org.apache.shiro.SecurityUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;
import java.util.List;

@Service
public class UserService {

    @Autowired
    UserDao userDao;

    @Autowired
    LoginHistoryDao loginHistoryDao;


    /**
     * 新增用户登入记录
     * @param request
     * @param user
     * @return
     */
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

    /**
     * 更新当前用户信息
     * @param userInfo
     */
    public void updateUserInfoFromUserCenter(WebUser userInfo){
        WebUser Cuser= ShiroUtil.getUser();
        Cuser.setHead(userInfo.getHead());
        Cuser.setArea(userInfo.getArea());
        Cuser.setIntroduction(userInfo.getIntroduction());
        Cuser.setNicoName(userInfo.getNicoName());
        Cuser.setSex(userInfo.getSex());
//        ShiroUtil.setUser(Cuser);
        WebUser webUser = (WebUser) SecurityUtils.getSubject().getPrincipal();
        webUser.upDateUserInfo(Cuser);
    }

    /**
     * 验证用户信息
     * @param user
     * @return
     */
    public boolean checkUserInfo(WebUser user){
        if (user.getUserName()==null||"".equals(user.getUserName())){
            return false;
        }
        if (user.getPassword()==null||"".equals(user.getPassword())){
            return  false;
        }
        return true;
    }

    /**
     * 验证用户信息特殊内容
     * @param user
     * @return
     */
    public boolean checkUserInfoContent(WebUser user){

        return true;
    }

    /**
     * 快速注册
     * @param webUser
     * @return
     */
    public int fastRegistered(WebUser webUser){
        return  userDao.insertUser(webUser);
    }

    /**
     * 查询用户的操作记录
     * @param userId
     * @return
     */
    public List getUserOprate(Integer userId){
       return userDao.selectUserOperrate(userId);
    }
}
