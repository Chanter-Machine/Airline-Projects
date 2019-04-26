package com.airline.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.airline.aop.memento.search.CareTaker;
import com.airline.aop.memento.search.Originator;
import com.airline.bean.SearchData;

@Component
@Aspect
public class MementoAspect {
	
	@Autowired
	Originator originator;
	
	@Autowired 
	CareTaker careTaker;
	
	@Before(value ="execution(* com.airline.handlers..*(..))")
	public void log() {
//        System.out.println("Controller log");
        
	}
	
	@Pointcut(value ="execution(* com.airline.handlers..search2(..))")
	public void doBeforeSearch(){
		
	}

	/**
	 * Use around() to save searchData to Memento List.
	 * @param joinPoint
	 * @throws Throwable
	 */
	@Around(value="doBeforeSearch()")
	public void doMemento(ProceedingJoinPoint joinPoint) throws Throwable{
		
		Object[] args = joinPoint.getArgs();
		if(args[0]!=null) {
			originator.setSearchData((SearchData)args[0]);
			careTaker.add(originator.saveSearchData2Menento());
			joinPoint.proceed();
		}
	}
	
	@Before(value ="execution(* com.airline.services..*(..))")
	public void logOnService() {
	}
}
