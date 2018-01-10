package com.yaofeng.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

import com.yaofeng.maven.impl.UserService2Impl;
import com.yaofeng.maven.service.IUserService2;

public class UserService2ProxyFactory implements InvocationHandler{

	
	public UserService2ProxyFactory(IUserService2 us) {
		super();
		this.us = us;
	}

	private IUserService2 us;
	public IUserService2 getUserServiceProxy() {
		//生成动态代理对象 
		IUserService2 usProxy =(IUserService2) Proxy.newProxyInstance(UserService2ProxyFactory.class.getClassLoader(),
				UserService2Impl.class.getInterfaces(), 
				this);
		return usProxy;
		
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("打开事物");
		Object invoke = method.invoke(us, args);
		System.out.println("提交事务");
		
		return invoke;
	}
}
