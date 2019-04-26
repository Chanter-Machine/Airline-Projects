package com.airline.test;


/*import cn.smb.api.demo.dao.TestEntityMapper;
import include.base.BaseService;*/
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import org.springframework.data.redis.core.*;
import org.springframework.data.redis.serializer.RedisSerializer;
import org.springframework.data.redis.serializer.StringRedisSerializer;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations= {"classpath:applicationContext.xml"})
public class RedisTest {
	@Autowired
    StringRedisTemplate redisTemplate;

    public void selectRedis() {
        testOpsForList();
        testFirst();
        testBound();
        testValueOperation();
        testopsForList2();
        
    }

    public void testOpsForList() {
        String key = "alex";
        ListOperations<String, String> lop = redisTemplate.opsForList();
        RedisSerializer<String> serializer = new StringRedisSerializer();
        redisTemplate.setKeySerializer(serializer);
        redisTemplate.setValueSerializer(serializer);
        // rt.setDefaultSerializer(serializer);

        lop.leftPush(key, "111111111111");
        /*lop.leftPush(key, "bbb");
        long size = lop.size(key); // rt.boundListOps(key).size();
        Assert.assertEquals(2, size);*/
    }

    @Test
    public void testFirst() {
        // String读写
        redisTemplate.delete("myStr");
        redisTemplate.opsForValue().set("myStr", "vvvvvvvvvvvvvvvv");
        System.out.println(redisTemplate.opsForValue().get("myStr"));
        // set username
        redisTemplate.opsForValue().set("username", "aaaaaaaaaaaaa");
        // get username
        System.out.println(redisTemplate.opsForValue().get("username"));
    }

    @Test
    public void testBound(){
        BoundValueOperations<String, String> boundValueOps = redisTemplate.boundValueOps("username");
        System.out.println(boundValueOps.get());
        boundValueOps.set("ssssssssssssss");
        System.out.println(boundValueOps.get());
    }

    // 测试便捷对象template
    @Test
    public void testValueOperation() {
        ValueOperations<String, String> vop = redisTemplate.opsForValue();
        String key = "pig";
        String v = "big pig";
        vop.set(key, v);
        String value = vop.get(key);
//        Assert.assertEquals("failure - strings not same", v, value);
    }

    // 测试RedisTemplate,自主处理key的可读性(String序列号)
    @Test
    public void testopsForList2() {
        String key = "spring";
        ListOperations<String, String> lop = redisTemplate.opsForList();
        /*RedisSerializer<String> serializer = new StringRedisSerializer();
        redisTemplate.setKeySerializer(serializer);
        redisTemplate.setValueSerializer(serializer);*/
        // rt.setDefaultSerializer(serializer);

        lop.leftPush(key, "aaa");
        lop.leftPush(key, "bbb");
        long size = lop.size(key); // rt.boundListOps(key).size();
//        Assert.assertEquals(2, size);
    }

   



}
