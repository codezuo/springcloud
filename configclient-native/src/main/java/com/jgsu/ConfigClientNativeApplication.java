package com.jgsu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @program: springcloud
 * @description: config客户端启动类
 * @author: Mr.zuo
 * @create: 2020-02-12 13:05
 **/
@SpringBootApplication
public class ConfigClientNativeApplication {
    public static void main(String[] args) {
        SpringApplication.run(ConfigClientNativeApplication.class,args);
    }
}
