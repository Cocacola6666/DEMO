package com.atguigu.gmall.config;

import com.alibaba.dubbo.config.*;
import com.atguigu.gmall.service.UserService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;

@Configuration
public class MyDubboConfig {

    //<dubbo:application name="boot-service-provider"></dubbo:application>
    @Bean
    public ApplicationConfig applicationConfig() {
        ApplicationConfig applicationConfig = new ApplicationConfig();
        applicationConfig.setName("boot-service-provider");
        return applicationConfig;
    }

    //    <dubbo:registry protocol="zookeeper" address="127.0.0.1:2181"></dubbo:registry>
    @Bean
    public RegistryConfig registryConfig() {
        RegistryConfig registryConfig = new RegistryConfig();
        registryConfig.setProtocol("zookeeper");
        registryConfig.setAddress("127.0.0.1:2181");
        return registryConfig;
    }

    //<dubbo:protocol name="dubbo" port="20880"></dubbo:protocol>
    @Bean
    public ProtocolConfig protocolConfig() {
        ProtocolConfig protocolConfig = new ProtocolConfig();
        protocolConfig.setName("dubbo");
        protocolConfig.setPort(20880);
        return protocolConfig;
    }
//<dubbo:service interface="com.atguigu.gmall.service.UserService"ref="userServiceImplll">
    //</dubbo:service>
    @Bean
    public ServiceConfig<UserService> serviceConfig(UserService userService){
        ServiceConfig<UserService> userServiceServiceConfig = new ServiceConfig<>();
        userServiceServiceConfig.setInterface(UserService.class);
        userServiceServiceConfig.setRef(userService);
        userServiceServiceConfig.setVersion("1.0.0");
       //配置每一个method的信息
        MethodConfig methodConfig = new MethodConfig();
        methodConfig.setName("getUserAddressList");
        methodConfig.setTimeout(1000);
        //将method的设置关联到service配置中
        ArrayList<MethodConfig> methods = new ArrayList<>();
        methods.add(methodConfig);
        userServiceServiceConfig.setMethods(methods);
        return userServiceServiceConfig;

    }
}
