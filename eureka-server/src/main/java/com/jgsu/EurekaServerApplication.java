package com.jgsu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @program: springcloud
 * @description: Eureka注册类
 * @author: Mr.zuo
 * @create: 2020-02-11 11:22
 * @EnableEurekaServer: 声明该类是一个EurekaServer微服务,提供服务注册和服务发现功能,即注册中心
 **/
@SpringBootApplication
@EnableEurekaServer
public class EurekaServerApplication {
    public static void main(String[] args) {
        SpringApplication.run(EurekaServerApplication.class,args);
    }
}
