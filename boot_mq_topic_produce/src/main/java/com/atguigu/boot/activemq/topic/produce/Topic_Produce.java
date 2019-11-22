package com.atguigu.boot.activemq.topic.produce;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsMessagingTemplate;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import javax.jms.Topic;
import java.util.UUID;

/**
 * @program: boot_mq_topic_produce
 * @description: springboot-生产者
 * @author: cj
 * @create: 2019-11-22 15:14
 */
@Component
public class Topic_Produce {
    @Autowired
    private    JmsMessagingTemplate jmsMessagingTemplate;
    @Autowired
    private Topic topic;
    @Scheduled(fixedDelay = 3000)
    public  void produceTopic()
    {
        jmsMessagingTemplate.convertAndSend(topic,"主题信息："+ UUID.randomUUID().toString().substring(0,6));
    }
}
