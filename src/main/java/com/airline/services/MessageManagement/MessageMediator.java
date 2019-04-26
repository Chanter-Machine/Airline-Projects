package com.airline.services.MessageManagement;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.ListOperations;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;

import com.airline.bean.Message;
import com.airline.bean.User;

public class MessageMediator extends Mediator{
	
	private List<Message> session;
	
	@Autowired
    RedisTemplate redisTemplate;
	
	ValueOperations<String, Object> valueOperations;
	
	@Override
	public void sendMessage(String sessionId, Message msg) {
		String key = sessionId;
		valueOperations = redisTemplate.opsForValue();
		session = (List<Message>) valueOperations.get(key);
		if(session==null) {
			session = new ArrayList<Message>();
		}
		else {
			session = new ArrayList<Message>();
		}
		session.add(msg);
		valueOperations.set(key, session, 900, TimeUnit.SECONDS);
	}  
}
