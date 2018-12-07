package com.airline.services;
import com.airline.bean.Passenger;
import com.airline.bean.User;
import com.airline.enums.*;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.test.context.ContextConfiguration;

@Component
@ContextConfiguration(locations= {"classpath:applicationContext.xml"})
public class UserFactory {

    @Autowired
    IPassengerService passengerService;

    public User produce(User user){
        int role = user.getRole(); //change to role
        int userID = user.getUserid();
        switch (UserType.GetValue(role)) {
            case PASSENGER:
                //get Passenger details
                Passenger passenger = passengerService.getPassengerByUserID(userID);
                BeanUtils.copyProperties(user, passenger);
                //security: do not return password in user session
                passenger.setPassword(null);

                return passenger;
            case AIRLINE:
                //get Airline details
                ;
                return user;
        }
        return null;
    }
}
