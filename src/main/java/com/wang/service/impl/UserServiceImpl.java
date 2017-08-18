package com.wang.service.impl;

import com.wang.mapper.UserMapper;
import com.wang.model.Student;
import com.wang.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by wang on 2017/8/18.
 */
@Service
public class UserServiceImpl implements UserService{
    @Autowired
    UserMapper userMapper;
    public void addStudent(Student student) {
        userMapper.addStudent(student);
    }

    public List<Student> findAllStudent() {
        return userMapper.findAllStudent();
    }
}
