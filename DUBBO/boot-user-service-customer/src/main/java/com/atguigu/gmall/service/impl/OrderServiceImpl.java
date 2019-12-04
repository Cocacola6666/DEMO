package com.atguigu.gmall.service.impl;

import com.alibaba.dubbo.config.annotation.Reference;
import com.atguigu.gmall.bean.UserAddress;
import com.atguigu.gmall.service.OrderService;
import com.atguigu.gmall.service.UserService;
import com.fasterxml.jackson.datatype.jsr310.ser.YearSerializer;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.security.SecurityProperties;
import org.springframework.stereotype.Service;

import java.time.Year;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {
    /*
     * 1.让服务提供者去注册中心注册（暴露服务）
     *    -导入dubbo依赖/操作zookeeper的客户端（curator）
     *    -配置服务提供者
     * 2.让服务消费者去注册中心订阅服务提供者的服务地址
     * */
 @Reference//远程引用userService服务
    UserService userService;
@HystrixCommand(fallbackMethod = "hello")
    @Override
    public List<UserAddress> initOrder(String userId){
        //查询用户的收获地址
        System.out.println("用户id" + userId);
        List<UserAddress> userAddressList = userService.getUserAddressList(userId);
        return  userAddressList;
    }
    public List<UserAddress> hello(String userId){
      return Arrays.asList(new UserAddress(10,"测试地址","1","测试","测试","Yes"));
    }
}
