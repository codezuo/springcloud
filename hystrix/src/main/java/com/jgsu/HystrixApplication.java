package com.jgsu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @program: springcloud
 * @description: hystrix启动类
 * @author: Mr.zuo
 * @create: 2020-02-12 11:08
 * @EnableCircuitBreaker: 声明启用数据监控
 * @EnableHystrixDashboard: 声明启用可视化的数据监控
 * 监控数据地址(不可视化): http://localhost:8060/actuator/hystrix.stream
 * 监控数据地址(可视化): http://localhost:8060/hystrix
 **/
@SpringBootApplication
@EnableFeignClients
@EnableCircuitBreaker
@EnableHystrixDashboard
public class HystrixApplication {
    public static void main(String[] args) {
        SpringApplication.run(HystrixApplication.class,args);
    }
}
