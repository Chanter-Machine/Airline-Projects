package com.airline.test;

import com.airline.bean.Login;
import com.airline.bean.Passenger;
import com.airline.services.IPassengerService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.airline.bean.User;
import com.airline.services.IUserService;

import java.text.ParseException;
import java.text.SimpleDateFormat;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations= {"classpath:applicationContext.xml"})
public class UserQueryTest {

	@Autowired
	IUserService userService;

	@Autowired
    IPassengerService passengerService;


	@Test
	public void queryUser() {
		User login = new User();
		login.setEmail("newuser@got.com");
		login.setPassword("exquisite");
		User user=userService.validateUser(login);
		if(user!=null) {
			System.out.println("login was successful");
		}
		else {
			System.out.println("login just failed");
		}

		System.out.println((userService.getResult().getMsg()));
	}

	@Test
	public void addUser(){
        Passenger visitor = new Passenger();
        visitor.setEmail("ma@got.com");
        visitor.setPassword("exquisite");
        visitor.setRole(1);
        visitor.setAddress("Voids");
        try {
			visitor.setDob(new SimpleDateFormat("yyyy-MM-dd").parse("1984-12-06"));
		} catch (ParseException ex) { }
        visitor.setPassengername("November User");
        visitor.setPhone("89912312345");
		//userService.addUser(user);

        //userService.addUser(user);
        passengerService.register(visitor);
        System.out.println("User ID: "+visitor.getUserid());
        //passengerService.createPassengerAccount(user);
/*
        if (user.getUserid()==null){
            System.out.println("Unable to insert new user.");
        } else {

            System.out.println("New user inserted with ID: " + user.getUserid());
        }

        */
	}
}
