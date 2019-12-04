package com.atguigu.boot.activemq.topic.config;

import org.apache.activemq.command.ActiveMQTopic;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import javax.jms.Topic;

/**
 * @program: boot_mq_topic_produce
 * @description: springboot-bean
 * @author: cj
 * @create: 2019-11-22 15:08
 */
@Component
public class ConfigBean {

    @Value("${myTopic}")
 private String topicName;
    @Bean
    public Topic topic(){
        return new ActiveMQTopic(topicName);
    }
}
