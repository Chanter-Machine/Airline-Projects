package com.airline.test;

import com.airline.bean.Passenger;
import com.airline.bean.User;
import com.airline.security.Validator;
import com.airline.services.IPassengerService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.text.ParseException;
import java.text.SimpleDateFormat;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations= {"classpath:applicationContext.xml"})
public class PassengerTest {

    @Autowired
    IPassengerService passengerService;

    @Test
    public void addPassenger() {
        Passenger p = new Passenger();
        User u = new User();


        //visitor.setUserInfo(u);
        //visitor.setPassengerInfo(p);

        u.setEmail("meeeee@got.com");
        u.setPassword("Time");
        u.setRole(1);

        //passengerService.createPassengerAccount(u);


        /*if (u.getUserid()!=null){
            p.setUserid(u.getUserid());
            System.out.println("got id");
        }*/

        p.setAddress("Voids");
        try {
            p.setDob(new SimpleDateFormat("yyyy-MM-dd").parse("2015-12-06"));
        } catch (ParseException ex) { }
        p.setPassengername("Winter@Bottom");
        p.setPhone("89912312345");

        Validator validator = new Validator(p);
        System.out.println("Is invalid: " + validator.validate());

        //passengerService.savePassengerInfo(p);
/*
        if(visitor.getPassengerInfo().getPassengerid()!=null) {
            System.out.println("Passenger (" + visitor.getUserInfo().getEmail() + ") has been registered");
        }
        else {
            System.out.println("Unable to register the passenger: " + visitor.getUserInfo().getUserid());
        }
        */
    }



}
