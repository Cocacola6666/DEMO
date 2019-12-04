package com.atguigu.gmall.service.impl;

import com.atguigu.gmall.bean.UserAddress;
import com.atguigu.gmall.service.OrderService;
import com.atguigu.gmall.service.UserService;
import jdk.nashorn.internal.ir.annotations.Reference;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {
    /*
     * 1.让服务提供者去注册中心注册（暴露服务）
     *    -导入dubbo依赖/操作zookeeper的客户端（curator）
     *    -配置服务提供者
     * 2.让服务消费者去注册中心订阅服务提供者的服务地址
     * */
    @Autowired
    UserService userService;

    @Override
    public List<UserAddress> initOrder(String userId) {
        //查询用户的收获地址
        System.out.println("用户id" + userId);
        return userService.getUserAddressList(userId);
    }
}
