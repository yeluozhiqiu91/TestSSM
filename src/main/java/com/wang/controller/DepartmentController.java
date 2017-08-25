package com.wang.controller;

import com.wang.model.Department;
import com.wang.service.DepartmentService;
import com.wang.util.DepartmentTree;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by wang on 2017/8/23.
 */
@Controller
@RequestMapping("/department")
public class DepartmentController {
    @Autowired
    private DepartmentService departmentService;
    @RequestMapping("/showAllDepartments")
    public String showAllDepartments(){
        return "department/allDepartments";
    }

    @RequestMapping("/getTree")
    @ResponseBody
    public List<DepartmentTree> getTree(HttpServletRequest request){
        List<Department> departmentList=departmentService.getAllDepartments();
        List<DepartmentTree> departmentTrees=new ArrayList<DepartmentTree>();
        for(Department d:departmentList){
            DepartmentTree tree=new DepartmentTree();
            tree.setId(d.getId());
            tree.setName(d.getName());
            tree.setPid(d.getParentId());
            departmentTrees.add(tree);
        }
        return departmentTrees;
    }
}
