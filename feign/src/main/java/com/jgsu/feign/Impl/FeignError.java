package com.jgsu.feign.Impl;

import com.jgsu.entity.Student;
import com.jgsu.feign.FeignProviderClient;
import org.springframework.stereotype.Component;

import java.util.Collection;

/**
 * @program: springcloud
 * @description: 定义容错处理逻辑, 通过@Component注解将其注入IOC容器中
 * @author: Mr.zuo
 * @create: 2020-02-12 10:36
 **/

@Component
public class FeignError implements FeignProviderClient {
    @Override
    public Collection<Student> findAll() {
        return null;
    }

    @Override
    public String index() {
        return "服务器正在抢修中,请5分钟后再重试...";
    }
}
