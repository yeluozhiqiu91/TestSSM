package com.wang.service;

import com.wang.model.Student;

import java.util.List;

/**
 * Created by wang on 2017/8/18.
 */
public interface UserService {
    void addStudent(Student student);
    List<Student> findAllStudent();
}
