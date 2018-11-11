package com.airline.test;

import com.airline.services.IPassengerService;
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

	@Autowired
    IPassengerService passengerService;

	
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

	@Test
	public void addUser(){
		User user = new User();
		user.setEmail("freshlypressed@email.com");
		user.setPassword("new password");
		user.setRole("passenger");
		//userService.addUser(user);

        passengerService.createPassengerAccount(user);

        if (user.getUserid()==null){
            System.out.println("Unable to insert new user.");
        } else {

            System.out.println("New user inserted with ID: " + user.getUserid());
        }
	}
}
