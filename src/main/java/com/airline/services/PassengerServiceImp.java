package com.airline.services;

import com.airline.bean.Passenger;
import com.airline.bean.PassengerExample;
import com.airline.bean.PassengerExample.Criteria;
import com.airline.bean.User;
import com.airline.dao.PassengerMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PassengerServiceImp implements IPassengerService {


    @Autowired
    IUserService userService;

    @Autowired
    IUserActivationService userActivationService;

    @Autowired
    PassengerMapper passengerMapper;

    PassengerExample passengerExample = new PassengerExample();


    @Override
    public int register(User user){
        //do register
        createPassengerAccount(user);
        savePassengerInfo((Passenger) user);
        return 0;
    }

    public void createPassengerAccount(User user){

        userService.addUser(user);
        userActivationService.sendUserActivationCode(user.getEmail());

    }

    public void savePassengerInfo(Passenger passenger) {
        passengerMapper.insertVisitor(passenger);
    }

    @Override
    public Passenger getPassengerByUserID(int userID) {
        Criteria criteria = passengerExample.createCriteria();
        criteria.andUseridEqualTo(userID);

        List<Passenger> passengers = passengerMapper.selectByExample(passengerExample);
        if (passengers.size()>0){
            return passengers.get(0);
        } else {
            return null;
        }

    }

}

