package com.airline.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.airline.bean.User;
import com.airline.services.IUserService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations= {"classpath:applicationContext.xml"})
public class UserQueryTest {

	@Autowired
	IUserService userService;
	
	@Test
	public void queryUser() {
		User user=userService.queryUser("123@test.com", "123456");
		if(user!=null) {
			System.out.println(user.getEmail());
		}
		else {
			System.out.println("hehe");
		}
	}
}
