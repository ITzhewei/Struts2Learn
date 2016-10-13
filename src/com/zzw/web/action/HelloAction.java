package com.zzw.web.action;

/**
 * Created by john on 2016/10/11.
 */
public class HelloAction {//动作类

    /**
     * 在动作类中执行的动作方法
     * 书写要求: public  String返回值  必须没有参数
     *
     * @return
     */
    public String sayhello() {
        System.out.println("heelo");
        return "success";//预配置文件中result的name的取值相对应
    }

}
