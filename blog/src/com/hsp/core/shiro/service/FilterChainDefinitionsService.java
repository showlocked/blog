package com.hsp.core.shiro.service;

import java.util.Map;
/**
 * shiro数据库动态权限扩展接口
 * @author hsp
 *
 */
public interface FilterChainDefinitionsService {
	
	 public static final String PREMISSION_STRING = "perms[{0}]"; // 资源结构格式  
	    public static final String ROLE_STRING = "role[{0}]"; // 角色结构格式  
	  
	    /** 初始化框架权限资源配置 */  
	    public abstract void intiPermission();  
	  
	    /** 重新加载框架权限资源配置 (强制线程同步) */  
	    public abstract void updatePermission();  
	  
	    /** 初始化第三方权限资源配置 */  
	    public abstract Map<String, String> initOtherPermission();  

}
