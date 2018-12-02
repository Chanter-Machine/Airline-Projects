package com.airline.interceptors;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

public class PermessionInterceptor implements HandlerInterceptor {

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		System.out.println("execute PermessionInterceptor --- preHandler() ---");
		String user = (String) request.getSession().getAttribute("user");
//		if("beijing".equals(user)) {
//			return true;
//		}
		if(user!=null) {
			System.out.println("not null");
			return true;
		}
		request.getRequestDispatcher("/airline/index.jsp").forward(request, response);
		return false;
	}

	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		System.out.println("execute PermessionInterceptor --- postHandler() ---");
	}

	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		System.out.println("execute PermessionInterceptor --- afterHandler() ---");		
	}

	
}
