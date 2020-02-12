package com.jgsu.repository;

import com.jgsu.entity.Student;
import org.springframework.stereotype.Repository;

import java.util.Collection;

/**
 * @program: springcloud
 * @description:
 * @author: Mr.zuo
 * @create: 2020-02-11 13:29
 **/
public interface StudentRepository {
    Collection<Student> findAll();
    Student findById(long id);
    void deleteById(long id);
    void saveOrUpdate(Student student);
}
