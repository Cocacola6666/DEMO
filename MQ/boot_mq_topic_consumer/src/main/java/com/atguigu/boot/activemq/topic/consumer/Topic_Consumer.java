package com.atguigu.boot.activemq.topic.consumer;

/**
 * @program: boot_mq_topic_consumer
 * @description: springboot-消费者
 * @author: cj
 * @create: 2019-11-22 15:35
 */
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

import javax.jms.JMSException;
import javax.jms.TextMessage;

@Component
public class Topic_Consumer {
    @JmsListener(destination = "${myTopic}")
    public void  receive(TextMessage textMessage)throws JMSException{
        try {
            System.out.println("消费者收到订阅的主题"+textMessage.getText());
        } catch (JMSException e) {
            e.printStackTrace();
        }
    }
}
