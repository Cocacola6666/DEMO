package com.atguigu.gmall;

import com.alibaba.dubbo.config.spring.context.annotation.DubboComponentScan;
import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.context.annotation.ImportResource;

//@EnableDubbo//开启基于注解的dubbo功能
//@ImportResource(locations = "classpath:providers.xml")
@EnableDubbo(scanBasePackages="com.atguigu.gmall")

@EnableHystrix//开启服务容错
@SpringBootApplication
public class BootUserServiceProviderApplication {
    /*
     * 导入依赖
     *   导入dubbo-starter
     *   导入dubbo其他依赖
     * */
    public static void main(String[] args) {
        SpringApplication.run(BootUserServiceProviderApplication.class, args);
    }

}
