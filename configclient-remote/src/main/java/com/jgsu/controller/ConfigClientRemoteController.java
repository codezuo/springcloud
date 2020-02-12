package com.jgsu.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: springcloud
 * @description:
 * @author: Mr.zuo
 * @create: 2020-02-12 13:10
 **/
@RestController
@RequestMapping("/remote")
public class ConfigClientRemoteController {

    @Value("${server.port}")
    private String port;


    @GetMapping(value = "/index")
    public String index(){
        return "端口号为: "+this.port;
    }
}
