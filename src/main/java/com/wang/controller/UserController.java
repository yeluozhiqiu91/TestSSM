package com.wang.controller;

import com.wang.model.Student;
import com.wang.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by wang on 2017/8/18.
 */
@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserService userService;
    @RequestMapping("/register")
    public String register(){
        return "/user/register";
    }
    @RequestMapping("/addStudent")
    public String addStudent(Student student){
        userService.addStudent(student);
        return "/user/studentList";
    }
}
