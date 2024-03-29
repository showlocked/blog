package com.hsp.base.utils;

import java.util.Collection;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.session.Session;
import org.apache.shiro.session.mgt.eis.SessionDAO;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.subject.Subject;
import org.apache.shiro.subject.support.DefaultSubjectContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.alibaba.druid.util.StringUtils;
public class ShiroSecurityHelper {
	      
/*	    private final static Logger log = LoggerFactory.getLogger(ShiroSecurityHelper.class);  
	  
	    private static UserService userService;  
	  
	    private static CurrentUserMemcacheService currentUserMemcacheService;  
	      
	    private static SessionDAO sessionDAO;  
	  
	    *//** 
	     * 把user放到cache中 
	     *  
	     * @param user 
	     *//*  
	    public static void setUser(User user) {  
	        currentUserMemcacheService.save(user);  
	    }  
	  
	    *//** 
	     * 清除当前用户的缓存 
	     *//*  
	    public static void clearCurrentUserCache() {  
	        if (hasAuthenticated()) {  
	            currentUserMemcacheService.remove(getCurrentUsername());  
	        }  
	    }  
	  
	    *//** 
	     * 从cache拿当前user 
	     *  
	     * @return 
	     *//*  
	    public static User getCurrentUser() {  
	        if (!hasAuthenticated()) {  
	            return null;  
	        }  
	        User user = currentUserMemcacheService.get(getCurrentUsername());  
	        try {  
	            if (null == user) {  
	                user = userService.getByUsername(getCurrentUsername());  
	                ShiroSecurityHelper.setUser(user);  
	            }  
	            return user;  
	        } catch (Exception e) {  
	            e.printStackTrace();  
	            return null;  
	        }  
	    }  
	  
	    *//** 
	     * 获得当前用户名 
	     *  
	     * @return 
	     *//*  
	    public static String getCurrentUsername() {  
	        Subject subject = getSubject();  
	        PrincipalCollection collection = subject.getPrincipals();  
	        if (null != collection && !collection.isEmpty()) {  
	            return (String) collection.iterator().next();  
	        }  
	        return null;  
	    }  
	  
	    *//** 
	     *  
	     * @return 
	     *//*  
	    public static Session getSession() {  
	        return SecurityUtils.getSubject().getSession();  
	    }  
	  
	    *//** 
	     *  
	     * @return 
	     *//*  
	    public static String getSessionId() {  
	        Session session = getSession();  
	        if (null == session) {  
	            return null;  
	        }  
	        return getSession().getId().toString();  
	    }  
	      
	    *//** 
	     * @param username 
	     * @return 
	     *//*  
	    public static Session getSessionByUsername(String username){  
	        Collection<Session> sessions = sessionDAO.getActiveSessions();  
	        for(Session session : sessions){  
	            if(null != session && StringUtils.equals(String.valueOf(session.getAttribute(DefaultSubjectContext.PRINCIPALS_SESSION_KEY)), username)){  
	                return session;  
	            }  
	        }  
	        return null;  
	    }  
	      
	    *//**踢除用户 
	     * @param username 
	     *//*  
	    public static void kickOutUser(String username){  
	        Session session = getSessionByUsername(username);  
	        if(null != session && !StringUtils.equals(String.valueOf(session.getId()), ShiroSecurityHelper.getSessionId())){  
	            ShiroAuthorizationHelper.clearAuthenticationInfo(session.getId());  
	            log.info("############## success kick out user 【{}】 ------ {} #################", username,TimeHelper.getCurrentTime());  
	        }  
	    }  
	  
	    *//** 
	     * @param userService 
	     * @param currentUserMemcacheService 
	     * @param sessionDAO 
	     *//*  
	    public static void initStaticField(UserService userService,CurrentUserMemcacheService currentUserMemcacheService,SessionDAO sessionDAO){  
	        ShiroSecurityHelper.userService = userService;  
	        ShiroSecurityHelper.currentUserMemcacheService = currentUserMemcacheService;  
	        ShiroSecurityHelper.sessionDAO = sessionDAO;  
	    }  
	      
	    *//** 
	     * 判断当前用户是否已通过认证 
	     * @return 
	     *//*  
	    public static boolean hasAuthenticated() {  
	        return getSubject().isAuthenticated();  
	    }  
	  
	    private static Subject getSubject() {  
	        return SecurityUtils.getSubject();  
	    }  
	  
	   
*/
}
