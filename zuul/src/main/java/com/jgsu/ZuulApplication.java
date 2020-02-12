package com.jgsu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * @program: springcloud
 * @description:
 * @author: Mr.zuo
 * @create: 2020-02-11 15:18
 * @EnableZuulProxy: 包含@EnableZuulServer，设置网关的启动类
 * @EnableAutoConfiguration: 可以帮助SpringBoot应用将所有符合条件的@Configuration配置加载到当前IOC容器中
 **/
@EnableZuulProxy
@EnableAutoConfiguration
public class ZuulApplication {
    public static void main(String[] args) {
        SpringApplication.run(ZuulApplication.class,args);
    }
}
