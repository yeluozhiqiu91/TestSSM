package com.wang.service.impl;

import com.wang.mapper.DepartmentMapper;
import com.wang.model.Department;
import com.wang.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by wang on 2017/8/23.
 */
@Service
public class DepartServiceImpl implements DepartmentService{
    @Autowired
    private DepartmentMapper departmentMapper;
    @Override
    public List<Department> getAllDepartments() {
        return departmentMapper.getAllDepartments();
    }
}
