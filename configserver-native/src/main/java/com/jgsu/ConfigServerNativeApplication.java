package com.jgsu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * @program: springcloud
 * @description:
 * @author: Mr.zuo
 * @create: 2020-02-12 12:36
 * @EnableConfigServer: 声明配置中心
 **/
@SpringBootApplication
@EnableConfigServer
public class ConfigServerNativeApplication {
    public static void main(String[] args) {
        SpringApplication.run(ConfigServerNativeApplication.class,args);
    }
}
