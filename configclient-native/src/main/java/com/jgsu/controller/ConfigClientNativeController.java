package com.jgsu.controller;

import org.springframework.beans.factory.annotation.Value;
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
@RequestMapping("/native")
public class ConfigClientNativeController {

    @Value("${server.port}")
    private String port;
    @Value("${foo}")
    private String foo;

    @GetMapping(value = "/index")
    public String index(){
        return this.port+"-"+this.foo;
    }
}
