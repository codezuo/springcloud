package com.jgsu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @program: springcloud
 * @description: 远程配置文件的启动类
 * @author: Mr.zuo
 * @create: 2020-02-12 14:23
 **/
@SpringBootApplication
public class ConfigClientRemoteApplication {
    public static void main(String[] args) {
        SpringApplication.run(ConfigClientRemoteApplication.class,args);
    }
}
