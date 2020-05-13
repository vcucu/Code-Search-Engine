1
https://raw.githubusercontent.com/miaoo92/xxl-job-mongo/master/src/main/java/com/avon/rga/controller/annotation/PermissionLimit.java
package com.avon.rga.controller.annotation;


import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 权限限制
 * @author xuxueli 2015-12-12 18:29:02
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface PermissionLimit {
	
	/**
	 * 登录拦截 (默认拦截)
	 */
	boolean limit() default true;

	/**
	 * 要求管理员权限
	 *
	 * @return
	 */
	boolean adminuser() default false;

}