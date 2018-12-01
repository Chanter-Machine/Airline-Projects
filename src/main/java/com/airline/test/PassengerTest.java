package com.airline.test;

import com.airline.bean.Passenger;
import com.airline.bean.User;
import com.airline.bean.Visitor;
import com.airline.services.IPassengerService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations= {"classpath:applicationContext.xml"})
public class PassengerTest {

    @Autowired
    IPassengerService passengerService;
    Visitor visitor;

    @Test
    public void addPassenger() {
        visitor = new Visitor();
        Passenger p = new Passenger();
        User u = new User();

        visitor.setUserInfo(u);
        visitor.setPassengerInfo(p);

        u.setEmail("meeeee@got.com");
        u.setPassword("Time");
        u.setRole(1);

        passengerService.createPassengerAccount(u);


        if (u.getUserid()!=null){
            p.setUserid(u.getUserid());
            System.out.println("got id");
        }

        p.setAddress("Voids");
        //p.setAge(16);
        p.setPassengername("Winter Bottom");
        p.setPhone("89912312345");

        passengerService.savePassengerInfo(p);

        if(visitor.getPassengerInfo().getPassengerid()!=null) {
            System.out.println("Passenger (" + visitor.getUserInfo().getEmail() + ") has been registered");
        }
        else {
            System.out.println("Unable to register the passenger: " + visitor.getUserInfo().getUserid());
        }
    }

}
