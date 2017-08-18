package com.wang.controller;

import com.wang.model.Student;
import com.wang.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

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
    public ModelAndView addStudent(Student student){
        ModelAndView modelAndView=new ModelAndView();
        //userService.addStudent(student);
        List<Student> studentList=userService.findAllStudent();
        modelAndView.addObject("studentList",studentList);
        modelAndView.setViewName("/user/studentList");
        return modelAndView;
    }
}
