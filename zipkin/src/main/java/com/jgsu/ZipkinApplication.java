package com.jgsu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import zipkin2.server.internal.EnableZipkinServer;

/**
 * @program: springcloud
 * @description: zipkin启动类
 * @author: Mr.zuo
 * @create: 2020-02-12 15:48
 * @EnableZipkinServer: 声明启动zipkin server
 **/
@SpringBootApplication
@EnableZipkinServer
public class ZipkinApplication {
    public static void main(String[] args) {
        SpringApplication.run(ZipkinApplication.class,args);
    }
}
