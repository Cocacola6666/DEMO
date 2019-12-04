package com.atguigu.boot.activemq.topic.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @program: boot_mq_topic_consumer
 * @description: 消费者启动类
 * @author: cj
 * @create: 2019-11-22 15:40
 */
@SpringBootApplication
public class MainAppConsumer {
    public static void main(String[] args) {
        SpringApplication.run(MainAppConsumer.class,args);
    }
}
