package com.airline.bean;

public class Admin extends User{
	
	@Override
	public void sendMessage(String sessionId, Message message) {
    	super.mediator.sendMessage(sessionId, message);
    }
    
    public void receiveMsg(Message message) {
    	System.out.println("Some send you a message");
    }
}
