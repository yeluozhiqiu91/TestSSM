package com.wang.util;

import java.util.List;

/**
 * Created by wang on 2017/8/23.
 */
public class DepartmentTree {
    private Integer id;
    private Integer pid;
    private String name;
    private Boolean checked;
    private List<DepartmentTree> node;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getChecked() {
        return checked;
    }

    public void setChecked(Boolean checked) {
        this.checked = checked;
    }

    public List<DepartmentTree> getNode() {
        return node;
    }

    public void setNode(List<DepartmentTree> node) {
        this.node = node;
    }
}
