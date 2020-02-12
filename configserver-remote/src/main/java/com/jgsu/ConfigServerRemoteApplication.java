package com.jgsu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * @program: springcloud
 * @description: 远程配置的启动类
 * @author: Mr.zuo
 * @create: 2020-02-12 14:03
 **/
@SpringBootApplication
@EnableConfigServer
public class ConfigServerRemoteApplication {
    public static void main(String[] args) {
        SpringApplication.run(ConfigServerRemoteApplication.class,args);
    }
}
