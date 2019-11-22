package com.atguigu.boot.activemq.topic;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * @program: boot_mq_topic_produce
 * @description: 主启动类
 * @author: cj
 * @create: 2019-11-22 15:23
 */
@SpringBootApplication
@EnableScheduling
public class MainApp_TopicProduce {
    public static void main(String[] args) {
        SpringApplication.run(MainApp_TopicProduce.class,args);
    }
}
