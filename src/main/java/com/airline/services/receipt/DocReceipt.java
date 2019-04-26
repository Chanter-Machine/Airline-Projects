package com.airline.services.receipt;

import com.airline.bean.Order;
import com.airline.bean.User;

public class DocReceipt extends Receipt{

	@Override
	public void notifyUser(Order order, User user) {
		// TODO Auto-generated method stub
		notification.notifyUser();
	}

}
