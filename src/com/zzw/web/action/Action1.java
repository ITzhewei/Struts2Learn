package com.zzw.web.action;

import com.opensymphony.xwork2.Action;

/**
 * Created by john on 2016/10/12.
 */
public class Action1 implements Action {

    /**
     * Action接口中的常量:
     * SUCCESS  "success"   返回成功的视图 ,前往指定位置
     * NONE     "none"      不返回任何结果视图  和 return null ; 是一样的  ;例如下载的时候
     * ERROR    "error"      当执行动作方法,出现异常之后 前往指定的页面
     * INPUT    "input"      数据回显
     * LOGIN    "login"         一般用于返回登录页面
     */
    @Override
    public String execute() throws Exception {
        return null;
    }
}
