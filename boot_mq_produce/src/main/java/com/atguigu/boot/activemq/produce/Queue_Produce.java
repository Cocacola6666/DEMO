package com.atguigu.boot.activemq.produce;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsMessagingTemplate;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;


import javax.jms.Queue;
import java.util.UUID;

@Component
public class Queue_Produce {
    @Autowired
    private JmsMessagingTemplate jmsMessagingTemplate;
    @Autowired //在ConfigBean中 queue对象通过@Bean标签被容器管理  此时可以注入
    private Queue queue;
    public  void  produveMsg(){
        jmsMessagingTemplate.convertAndSend(queue,"****:"+ UUID.randomUUID().toString().substring(0,6));
    }
    //间隔时间3秒钟定投
    @Scheduled(fixedDelay = 3000)
    public void produceMsgScheduled(){
        jmsMessagingTemplate.convertAndSend(queue,"****:"+ UUID.randomUUID().toString().substring(0,6));
        System.out.println("*****produceMsgScheduled send ok");
    }

}
