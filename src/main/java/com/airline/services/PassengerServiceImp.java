package com.airline.services;

import com.airline.bean.Passenger;
import com.airline.bean.User;
import com.airline.bean.Visitor;
import com.airline.dao.PassengerMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PassengerServiceImp implements IPassengerService {


    @Autowired
    IUserService userService;

    @Autowired
    PassengerMapper passengerMapper;


    public void addPassenger(Visitor visitor) {
        User user = visitor.getUserInfo();
        createPassengerAccount(user);

        Passenger passenger = visitor.getPassengerInfo();

        if (user.getUserid()!=null){
            passenger.setUserid(user.getUserid());
        }

        savePassengerInfo(passenger);

    }

    public void createPassengerAccount(User user){
        userService.addUser(user);
    }

    public void savePassengerInfo(Passenger passenger) {
        passengerMapper.insert(passenger);
    }

}

