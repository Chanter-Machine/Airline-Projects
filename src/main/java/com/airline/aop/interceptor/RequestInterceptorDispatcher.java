package com.airline.aop.interceptor;

import java.util.List;

public class RequestInterceptorDispatcher {
	
	List<IRequestInterceptor> preHandlerList;
	List<IRequestInterceptor> postHandlerList;
	
	public void attachPreHandler(IRequestInterceptor interceptor) {
		preHandlerList.add(interceptor);
	}
	
	public void attachPostHandler(IRequestInterceptor interceptor) {
		postHandlerList.add(interceptor);
	}

	public List<IRequestInterceptor> getPreHandlerList() {
		return preHandlerList;
	}

	public void setPreHandlerList(List<IRequestInterceptor> preHandlerList) {
		this.preHandlerList = preHandlerList;
	}

	public List<IRequestInterceptor> getPostHandlerList() {
		return postHandlerList;
	}

	public void setPostHandlerList(List<IRequestInterceptor> postHandlerList) {
		this.postHandlerList = postHandlerList;
	}
	
	
}
