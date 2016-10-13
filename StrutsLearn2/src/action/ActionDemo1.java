package action;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.ServletResponseAware;
import org.apache.struts2.util.ServletContextAware;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Created by john on 2016/10/13.
 * 获取ServletAPI
 * 第一种方式:使用的是ServletActionContext的对象
 * 第二种方式:使用的是依赖注入的方式把想要的对象注入进来
 *           是由一个拦截器来执行的
 */
public class ActionDemo1 extends ActionSupport implements ServletRequestAware, ServletResponseAware, ServletContextAware {

    private HttpServletRequest req;
    private HttpServletResponse resp;
    private ServletContext application;

    @Override
    public String execute() throws Exception {
//        req = ServletActionContext.getRequest();
//        resp = ServletActionContext.getResponse();
//
//        application = ServletActionContext.getServletContext();
        HttpSession session = req.getSession();

        System.out.println(req);
        System.out.println(resp);
        System.out.println(application);
        System.out.println(session);
        return null;
    }

    @Override
    public void setServletRequest(HttpServletRequest httpServletRequest) {
        this.req = httpServletRequest;
    }

    @Override
    public void setServletResponse(HttpServletResponse httpServletResponse) {
        this.resp = httpServletResponse;
    }

    @Override
    public void setServletContext(ServletContext servletContext) {
        this.application = servletContext;
    }
}
