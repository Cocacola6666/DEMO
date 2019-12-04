package com.atguigu.gmall;

import com.atguigu.gmall.service.OrderService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

public class MainApplication {
    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("customer.xml");
        OrderService service = classPathXmlApplicationContext.getBean(OrderService.class);
        service.initOrder("1");
        System.out.println("调用提供方完成。。");
        System.in.read();
    }
}
