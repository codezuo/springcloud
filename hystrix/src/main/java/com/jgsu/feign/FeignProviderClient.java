package com.jgsu.feign;

import com.jgsu.entity.Student;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Collection;

/**
 * @program: springcloud
 * @description: feign的声明式接口,通过注解方式对服务提供者进行映射
 * @author: Mr.zuo
 * @create: 2020-02-12 10:14
 * @FeignClient(value = "provider"): 表示，从注册到Eureka注册中心中名字为provider
 *                                  (即application.yml文件中spring.application.name: provider
 *                                  (这里是指eureka-client包中))中调用下面的接口
 *  @GetMapping(value = "/student/findAll"): 为provider中方法的具体接口的路径
 *  fallback = FeignError.class: 表示当遇到错误时(如：provider服务断了)，返回FeignError类中的信息，而不会直接报500的错误
 **/
@FeignClient(value = "provider")
public interface FeignProviderClient {

    @GetMapping(value = "/student/findAll")
    public Collection<Student> findAll();
    @GetMapping(value = "/student/index")
    public String index();
}
