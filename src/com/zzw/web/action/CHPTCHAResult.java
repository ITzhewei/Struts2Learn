package com.zzw.web.action;

import cn.dsna.util.images.ValidateCode;
import com.opensymphony.xwork2.ActionInvocation;
import org.apache.struts2.ServletActionContext;
import org.apache.struts2.dispatcher.StrutsResultSupport;

import javax.servlet.http.HttpServletResponse;

/**
 * Created by john on 2016/10/13.
 */
public class CHPTCHAResult extends StrutsResultSupport {

    private int width;
    private int height;

    //Servlet中怎么写 现在还是怎么写
    @Override
    protected void doExecute(String s, ActionInvocation actionInvocation) throws Exception {

        /**
         * 使用第三方的jar包
         * 1.拷贝ValidateCode.jar
         * 2.创建ValidateCode的对象
         * 3.获取响应对象输入流
         * 4.输出到浏览器
         */

        //创建ValidateCode对象
        ValidateCode code = new ValidateCode(width, height, 4, 9);
        //获取响应对象
        HttpServletResponse response = ServletActionContext.getResponse();
        //输出到浏览器
        code.write(response.getOutputStream());
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}
