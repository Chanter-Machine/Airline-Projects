package com.airline.interceptors;
import com.airline.bean.User;
import com.airline.security.Encryption;
import com.airline.security.Facade;
import com.airline.services.IUserService;
import com.airline.services.UserServiceImp;
import com.airline.utils.Msg;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.HandlerInterceptor;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.Base64;
import java.util.List;

public class SwaggerInterceptor implements HandlerInterceptor {


    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {

        if (!authHeaderValid(request.getHeader("Authorization"))) {
            response.addHeader("Access-Control-Allow-Origin", "null");
            response.addHeader("WWW-Authenticate", "Basic realm=\"\"");
            response.setStatus(HttpServletResponse.SC_UNAUTHORIZED);
            response.getWriter().println("HTTP Status " + HttpServletResponse.SC_UNAUTHORIZED);

            return false;
        }

        return true;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception { }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception { }

    private boolean authHeaderValid(String authorization) {
        if (authorization != null && authorization.startsWith("Basic ")) {
            final String[] values = new String(Base64.getDecoder().decode(authorization.substring("Basic ".length()))).split(":");

            //check against details in DB
            User user = new User();
            user.setEmail(values[0]);
            user.setPassword(values[1]);

            List<User> userList = new ArrayList<>();//get set of only authorised agents

            //new Agent temporary. Retrieve from DB through implementation
            User agent = new User();
            agent.setEmail("agent1");
            String password = new Encryption().encrypt("password");
            agent.setPassword(password);
            agent.setLocked(Boolean.FALSE);
            agent.setLoginattempts(0);
            userList.add(agent);

            Facade authentication = new Facade(user, userList);
            authentication.checkAuthentication();
            Msg result=authentication.getResult();
            return result.isSuccessful();
            //return values[0].equals("username") && values[1].equals("password");
        }

        return false;
    }


}
