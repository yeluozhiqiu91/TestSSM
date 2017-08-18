package com.wang.mapper;

import com.wang.model.Student;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
 * Created by wang on 2017/8/18.
 */
@Repository
public interface UserMapper {
    void addStudent(Student student);
}
