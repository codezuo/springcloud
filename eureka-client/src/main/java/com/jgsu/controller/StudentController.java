package com.jgsu.controller;

import com.jgsu.entity.Student;
import com.jgsu.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

/**
 * @program: springcloud
 * @description:
 * @author: Mr.zuo
 * @create: 2020-02-11 13:36
 **/
@RestController
@RequestMapping("/student")
public class StudentController {
    @Autowired
    StudentRepository studentRepository;
    @Value("${server.port}")
    Integer port;

    @GetMapping(value = "/findAll")
    public Collection<Student> findAll(){
        return studentRepository.findAll();
    }

    @GetMapping(value = "/findById/{id}")
    public Student findById(@PathVariable(value = "id") long id){
        return studentRepository.findById(id);
    }

    @PostMapping(value = "/save")
    public void save(@RequestBody Student student){
        studentRepository.saveOrUpdate(student);
    }

    @PutMapping(value = "/update")
    public void update(@RequestBody Student student) {
        studentRepository.saveOrUpdate(student);
    }

    @DeleteMapping(value = "/deleteById/{id}")
    public void delete(@PathVariable(value = "id") long id) {
        studentRepository.deleteById(id);
    }

    @GetMapping("/index")
    public String index(){
        return "当前端口为"+this.port;
    }
}
