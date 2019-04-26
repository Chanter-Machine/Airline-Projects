package com.airline.aop.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Pointcut;

public class RequestAspect {

	RequestInterceptorDispatcher dispather;
	
	HttpServletRequest request;
	
	HttpServletResponse response;
	
	@Pointcut(value ="execution(* com.airline.handlers..(..))")
	public void checkRequests(){
		
	}
	
	
	@Around(value="checkRequests()")
	public void doSend(ProceedingJoinPoint joinPoint) throws Throwable{
		
		dispather = new RequestInterceptorDispatcher();
				
		dispather.getPreHandlerList().add(new PreHandlerOne());
		
		
		Object[] args = joinPoint.getArgs();
		if(args[0]!=null) {
			request = (HttpServletRequest)args[0];
			response = (HttpServletResponse)args[1];
		}
		
		int count;
		for(count=0; count<dispather.getPreHandlerList().size();count++) {
			if(dispather.getPreHandlerList().get(count).intercept(request, response))
				continue;
			else
				break;
		}
		
		if(count==dispather.getPreHandlerList().size()) {
			joinPoint.proceed();
		}
		
	}
	
}
