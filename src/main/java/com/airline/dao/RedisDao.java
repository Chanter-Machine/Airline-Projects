package com.airline.dao;

import org.springframework.stereotype.Component;

import redis.clients.jedis.Jedis;
@Component
public class RedisDao {
	
	public Jedis test() {
		String key = "rs_test";
		Jedis jedis = null;
		
		try {
			return new Jedis("host", 6379);

		} catch (Exception e) {
		}
		return null;
	}

}
