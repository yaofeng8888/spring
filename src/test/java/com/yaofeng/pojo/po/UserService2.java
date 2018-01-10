package com.yaofeng.pojo.po;

import org.junit.Test;

import com.yaofeng.maven.impl.UserService2Impl;
import com.yaofeng.maven.service.IUserService2;
import com.yaofeng.proxy.UserService2ProxyFactory;

public class UserService2 {
	@Test
		public void test() {
		IUserService2 us = new UserService2Impl();
		
		UserService2ProxyFactory factory = 	new UserService2ProxyFactory(us);
			
		IUserService2 usProxy = factory.getUserServiceProxy();
		
		usProxy.update();
		}
}
