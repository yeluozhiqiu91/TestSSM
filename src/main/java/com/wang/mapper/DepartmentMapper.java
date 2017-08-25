package com.wang.mapper;

import com.wang.model.Department;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by wang on 2017/8/23.
 */
@Repository
public interface DepartmentMapper {
    public List<Department> getAllDepartments();
}
