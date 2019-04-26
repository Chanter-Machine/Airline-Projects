package com.airline.services.receipt;

import com.airline.bean.Order;

public class TextMessageNotificationImp implements INotify {

	@Override
	public void notifyUser() {
		// TODO Auto-generated method stub
		System.out.println("Send receipt to user's phone");
	}

}
