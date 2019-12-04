package com.atguigu.gmall.service.impl;

import java.util.List;

import com.atguigu.gmall.service.UserService;


import com.atguigu.gmall.bean.UserAddress;

public class UserServiceStub implements UserService {
	
	private final UserService userService;
	

	/**
	 * 传入的是userService远程的代理对象
	 * @param userService
	 */
	public UserServiceStub(UserService userService) {
		super();
		this.userService = userService;
	}


	@Override
	public List<UserAddress> getUserAddressList(String s) {
		return null;
	}
}