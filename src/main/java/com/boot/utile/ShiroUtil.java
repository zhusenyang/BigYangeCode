package com.boot.utile;

import com.boot.entity.WebUser;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.subject.SimplePrincipalCollection;
import org.apache.shiro.subject.Subject;

public class ShiroUtil {
    public static Subject getSubjct(){
        return SecurityUtils.getSubject();
    }

    public static WebUser getUser(){
        return (WebUser) getSubjct().getPrincipal();
    }

    /**
     * 切换身份，登录后，动态更改subject的用户属性
     * @param userInfo
     */
    public static void setUser(WebUser userInfo) {
        Subject subject = SecurityUtils.getSubject();
        PrincipalCollection principalCollection = subject.getPrincipals();
        String realmName = principalCollection.getRealmNames().iterator().next();
        PrincipalCollection newPrincipalCollection =
                new SimplePrincipalCollection(userInfo, realmName);
        subject.runAs(newPrincipalCollection);
    }



}
