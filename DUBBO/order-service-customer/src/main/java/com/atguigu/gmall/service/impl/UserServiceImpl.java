package com.atguigu.gmall.service.impl;

import com.atguigu.gmall.bean.UserAddress;

import com.atguigu.gmall.service.UserService;
import org.springframework.util.StringUtils;

import java.util.List;

public class UserServiceImpl implements UserService {
    private  final  UserService userService;
/*
* 传入的是userservice的远程代理对象
* */
    public UserServiceImpl(UserService userService) {
        super();
        this.userService = userService;
    }

    @Override
    public List<UserAddress> getUserAddressList(String uid) {
        System.out.println("Userservice stub被調用");
        if(StringUtils.isEmpty(uid)){
           return  userService.getUserAddressList(uid);
        }
        return null;
    }
}
