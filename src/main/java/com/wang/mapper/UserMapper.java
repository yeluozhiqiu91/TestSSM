package com.wang.mapper;

import com.wang.model.Student;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by wang on 2017/8/18.
 */
@Repository
public interface UserMapper {
    void addStudent(Student student);

    List<Student> findAllStudent();
}
