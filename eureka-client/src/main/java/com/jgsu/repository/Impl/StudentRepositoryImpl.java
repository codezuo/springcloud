package com.jgsu.repository.Impl;

import com.jgsu.entity.Student;
import com.jgsu.repository.StudentRepository;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * @program: springcloud
 * @description:
 * @author: Mr.zuo
 * @create: 2020-02-11 13:32
 **/
@Repository
public class StudentRepositoryImpl implements StudentRepository {
    private static Map<Long,Student> studentMap;
    static {
        studentMap = new HashMap<>();
        studentMap.put(1L,new Student(1L,"张三",22));
        studentMap.put(2L,new Student(2L,"刘备",23));
        studentMap.put(3L,new Student(3L,"李四",24));
        studentMap.put(4L,new Student(4L,"赵雷",25));
    }

    @Override
    public Collection<Student> findAll() {
        return studentMap.values();
    }

    @Override
    public Student findById(long id) {
        return studentMap.get(id);
    }

    @Override
    public void deleteById(long id) {
        studentMap.remove(id);
    }

    @Override
    public void saveOrUpdate(Student student) {
        studentMap.put(student.getId(),student);
    }
}
