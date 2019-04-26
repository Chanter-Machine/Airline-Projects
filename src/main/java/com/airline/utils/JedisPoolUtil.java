package com.airline.utils;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

public class JedisPoolUtil {

	private static volatile JedisPool jedisPool = null;
 
	
	private JedisPoolUtil() {};
	
	//provide a get method
	public static JedisPool getJedisPoolInstance() {
		if (jedisPool == null) {
			synchronized (JedisPoolUtil.class) {
				if (jedisPool == null) {
					JedisPoolConfig poolConfig = new JedisPoolConfig();
					
					poolConfig.setMaxIdle(1000);
					poolConfig.setMaxIdle(32);
					poolConfig.setMaxWaitMillis(100 * 1000);
					poolConfig.setTestOnBorrow(true);
 
					jedisPool = new JedisPool(poolConfig, "192.168.80.131",6379);
				}
			}
		}
		return jedisPool;
	}
	
	//release a connection to the pool
	public static void release(JedisPool jedisPool,Jedis jedis){
		if(jedis != null){
			jedisPool.returnResourceObject(jedis);
		}
	}

}