package com.airline.services.MessageManagement;

import com.airline.bean.Message;
import com.airline.bean.User;

public abstract class Mediator {
	
	public abstract void sendMessage(String sessionId, Message msg);
	private User sender;
	private User receiver;
	
	public void setSender(User sender) {
		this.sender = sender;
	}
	
	public void setReceiver(User receiver) {
		this.receiver = receiver;
	}
}
