package com.zzw.web.action;

import com.opensymphony.xwork2.ActionSupport;

/**
 * Created by john on 2016/10/12.
 */
public class UserAction extends ActionSupport {

    public String addUser() {
        System.out.println("添加用户");
        return SUCCESS;
    }

    public String deleteUser() {
        System.out.println("删除用户");
        return SUCCESS;
    }

    public String updateUser() {
        System.out.println("更新用户");
        return SUCCESS;
    }

    public String queryUser() {
        System.out.println("查询user");
        return SUCCESS;
    }
}
