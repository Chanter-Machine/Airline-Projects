package com.airline.services.receipt;

import com.airline.bean.Order;
import com.airline.bean.User;

public abstract class Receipt {
	public INotify notification;
	
	public void setNotification(INotify notification) {
		this.notification =  notification;
	}
	
	public abstract void notifyUser(Order order, User user);
}
