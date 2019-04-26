package com.airline.aop.sendReceipt;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import com.airline.bean.Order;
import com.airline.bean.User;
import com.airline.services.receipt.INotify;
import com.airline.services.receipt.MailNotificationImp;
import com.airline.services.receipt.PDFReceipt;
import com.airline.services.receipt.Receipt;


import javax.servlet.http.HttpServletRequest;

@Component
@Aspect
public class ReceiptAspect {
	private Receipt receipt;
	private INotify notification;
	
	@Pointcut(value ="execution(* com.airline.services..pay(..))")
	public void sendReceipt(){
		
	}
	
	/**
	 * After payment, user will receive a message from system
	 * @param joinPoint
	 * @throws Throwable
	 */
	@Around(value="sendReceipt()")
	public void doSend(ProceedingJoinPoint joinPoint) throws Throwable{
		
		Object[] args = joinPoint.getArgs();
		if(args[0]!=null) {
			HttpServletRequest request = (HttpServletRequest)args[0];
			User user = (User) request.getSession().getAttribute("user");
			Order order = (Order)args[2];
			receipt = new PDFReceipt();
			notification = new MailNotificationImp();
			receipt.setNotification(notification);
			if((boolean) joinPoint.proceed()) {
				receipt.notifyUser(order, user);
			}
		}
	}
}
