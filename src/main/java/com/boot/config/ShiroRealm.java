package com.boot.config;

import com.boot.entity.WebUser;
import com.boot.service.UserService;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;

import com.boot.dao.UserDao;

public class ShiroRealm extends AuthorizingRealm {
	// 一般这里都写的是servic，这里省略直接调用dao
    @Autowired
    private UserDao userDao;

	/**
	 * 用户服务层
	 */
	@Autowired
	UserService userService;
//    @Autowired
//    private URoleDao uRoleDao;
//    @Autowired
//    private UPermissionDao uPermissionDao;
    public AuthenticationInfo toLogin(AuthenticationToken authenticationToken) {
    	doGetAuthenticationInfo(authenticationToken);
    	return null;
    }
    
	/**
	 * 登录认证
	 * 
	 * @param authenticationToken
	 * @return
	 * @throws AuthenticationException
	 */
	@Override
	protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken)
			throws AuthenticationException {
		if (authenticationToken==null) {
			return null;
		}
		UsernamePasswordToken token = (UsernamePasswordToken) authenticationToken;
//        logger.info("验证当前Subject时获取到token为：" + token.toString());
		// 查出是否有此用户
		String username = token.getUsername();
		char[] checkPswC =token.getPassword();
		String checkPsdS=new String(checkPswC);
		WebUser user= userDao.findUserByNameAndPassword(username,checkPsdS);
		if (user!=null&&user.getId()!=null){
			AuthenticationInfo authenticationInfo = new SimpleAuthenticationInfo(user,checkPsdS,getName());
			Subject currentUser = SecurityUtils.getSubject();
			System.out.println(currentUser);
			//			userService.addLoginHistory(request,user);
			return authenticationInfo;//js
		}
//		System.out.println("username=\t"+username);
		
//        UUser hasUser = uUserDao.selectAllByName(username);
//
//        if (hasUser != null) {
//            // 若存在，将此用户存放到登录认证info中，无需自己做密码对比，Shiro会为我们进行密码对比校验
//            List<URole> rlist = uRoleDao.findRoleByUid(hasUser.getId());//获取用户角色
//            List<UPermission> plist = uPermissionDao.findPermissionByUid(hasUser.getId());//获取用户权限
//            List<String> roleStrlist=new ArrayList<String>();////用户的角色集合
//            List<String> perminsStrlist=new ArrayList<String>();//用户的权限集合
//            for (URole role : rlist) {
//                roleStrlist.add(role.getName());
//            }
//            for (UPermission uPermission : plist) {
//                perminsStrlist.add(uPermission.getName());
//            }
//            hasUser.setRoleStrlist(roleStrlist);
//            hasUser.setPerminsStrlist(perminsStrlist);
//         // 若存在，将此用户存放到登录认证info中，无需自己做密码对比，Shiro会为我们进行密码对比校验
//            return new SimpleAuthenticationInfo(hasUser, hasUser.getPswd(), getName());
//        }
		
		return null;
	}

	/**
	 * 权限认证
	 * 
	 * @param principalCollection
	 * @return
	 */
	@Override
	protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
//        logger.info("##################执行Shiro权限认证##################");
//        UUser user = (UUser) principalCollection.getPrimaryPrincipal();
//        if (user != null) {
//            //权限信息对象info,用来存放查出的用户的所有的角色（role）及权限（permission）
//            SimpleAuthorizationInfo info = new SimpleAuthorizationInfo();
//            //用户的角色集合
//            info.addRoles(user.getRoleStrlist());
//            //用户的权限集合
//            info.addStringPermissions(user.getPerminsStrlist());
//
//            return info;
//        }
//        // 返回null的话，就会导致任何用户访问被拦截的请求时，都会自动跳转到unauthorizedUrl指定的地址
		return null;
	}
}
