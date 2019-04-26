package com.airline.interceptors;

import com.airline.bean.Passenger;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoggingInterceptor implements HandlerInterceptor {

    protected final Log logger = LogFactory.getLog(getClass());

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {

        System.out.println("Logging Interceptor ---- PreHandler--------");
        Passenger user = (Passenger) request.getSession().getAttribute("user");

        String requestUrl = request.getRequestURL().toString();//得到请求的URL地址
        String requestUri = request.getRequestURI();//得到请求的资源
        String queryString = request.getQueryString();//得到请求的URL地址中附带的参数
        String remoteAddr = request.getRemoteAddr();//得到来访者的IP地址
        String remoteHost = request.getRemoteHost();
        int remotePort = request.getRemotePort();
        String remoteUser = request.getRemoteUser();
        String method = request.getMethod();//得到请求URL地址时使用的方法
        String pathInfo = request.getPathInfo();
        String localAddr = request.getLocalAddr();//获取WEB服务器的IP地址
        String localName = request.getLocalName();//获取WEB服务器的主机名

        String log =
                "UID: " + user.getUserid() + "\n" +
                "User: " + user.getPassengername() + "\n" +
                "Email: " + user.getEmail() + "\n" +
                "Last Login: " + user.getLastlogin() + "\n" +
                "Accessing Info:\n" +
                "    Host:" + remoteHost + "\n" +
                "    IP:" + remoteAddr + "\n" +
                "    Port:" + remotePort + "\n" +
                "    User:" + remoteUser + "\n" +
                "    Method:" + method + "\n" +
                "    PathInfo:" + pathInfo + "\n" +
                "    URL:" + requestUrl + "\n" +
                "    URI:" + requestUri + "\n" +
                "    QueryString:" + queryString + "\n" +
                "Local info:\n" +
                "    Server IP:" + localAddr + "\n" +
                "    Server name:" + localName;

        System.out.println(log);
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {


    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {

    }
}
