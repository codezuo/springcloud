package com.jgsu.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: springcloud
 * @description:
 * @author: Mr.zuo
 * @create: 2020-02-12 15:59
 **/
@RestController
@RequestMapping("/zipkin")
public class ZipkinController {
    @Value("${server.port}")
    private String port;

    @GetMapping("/index")
    public String index(){
        return "端口号为："+this.port;
    }
}
