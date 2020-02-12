package com.jgsu.controller;

import com.jgsu.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.Collection;

/**
 * @program: springcloud
 * @description:
 * @author: Mr.zuo
 * @create: 2020-02-11 14:57
 **/
@RestController
@RequestMapping("/consumer")
public class ConsumerController {
    @Autowired
    private RestTemplate restTemplate;

    @GetMapping(value = "/findAll")
    public Collection<Student> findAll() {
        // 使用.getForEntity方法，其返回值为ResponseEntity<>类型，需要再调用.getBody方法
        // return restTemplate.getForEntity("http://localhost:8010/student/findAll",Collection.class).getBody();
        return restTemplate.getForObject("http://localhost:8010/student/findAll", Collection.class);
    }

    @GetMapping(value = "findById/{id}")
    public Student findById(@PathVariable(value = "id") long id) {
        return restTemplate.getForObject("http://localhost:8010/student/findById/{id}", Student.class, id);
    }

    @PostMapping(value = "/save")
    public void save(@RequestBody Student student) {
        restTemplate.postForObject("http://localhost:8010/student/save", student, Student.class);
    }

    @PutMapping(value = "/update")
    public void update(@RequestBody Student student) {
        restTemplate.put("http://localhost:8010/student/update", student);
    }

    @DeleteMapping(value = "/deleteById/{id}")
    public void delete(@PathVariable(value = "id") long id) {
        restTemplate.delete("http://localhost:8010/student/deleteById/{id}", id);
    }
}
