package com.airline.aop.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface IRequestInterceptor {
	public boolean intercept(HttpServletRequest request, HttpServletResponse response);
}
