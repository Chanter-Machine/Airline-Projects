package com.airline.services.MessageManagement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.airline.bean.Message;
import com.airline.bean.User;
import com.airline.dao.RedisDao;
@Service
public class MessageService {
	@Autowired
	Mediator mediator;
	
	public void sendMessage(String sessionId, Message msg, User sender, User receiver) {

		mediator.setReceiver(receiver);
		mediator.setSender(sender);
		
		sender.sendMessage(sessionId, msg);
	}
	
}
