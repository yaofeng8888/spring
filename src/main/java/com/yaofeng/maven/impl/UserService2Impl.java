package com.yaofeng.maven.impl;

import com.yaofeng.maven.service.IUserService2;
//使用动态代理增强这个类
public class UserService2Impl implements IUserService2 {

	@Override
	public void save() {
		// TODO Auto-generated method stub
		System.out.println("保存用户");
	}

	@Override
	public void delete() {
		// TODO Auto-generated method stub
		System.out.println("修改用户");
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		System.out.println("更新用户");
	}

	@Override
	public void find() {
		// TODO Auto-generated method stub
		System.out.println("查找用户");
	}

}
