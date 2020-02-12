package com.jgsu.controller;

import com.jgsu.entity.Student;
import com.jgsu.feign.FeignProviderClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

/**
 * @program: springcloud
 * @description:
 * @author: Mr.zuo
 * @create: 2020-02-12 10:21
 **/
@RestController
@RequestMapping(value = "/feign")
public class FeignController {

    @Autowired
    FeignProviderClient feignProviderClient;

    @GetMapping("/findAll")
    public Collection<Student> findAll(){
        return feignProviderClient.findAll();
    }

    @GetMapping("/index")
    public String index(){
        return feignProviderClient.index();
    }
}
