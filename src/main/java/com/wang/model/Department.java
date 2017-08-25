package com.wang.model;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by wang on 2017/8/23.
 */
public class Department implements Serializable{
    private Integer id;
    private String name;            //部门名称
    private String code;            //部门编码
    private Integer parentId;       //上级部门id
    private Integer createUser;     //创建人
    private Date createTime;        //创建时间
    private Integer status;         //状态，0启用，1停用

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    public Integer getCreateUser() {
        return createUser;
    }

    public void setCreateUser(Integer createUser) {
        this.createUser = createUser;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}
