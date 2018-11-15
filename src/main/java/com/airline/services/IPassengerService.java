package com.airline.services;
import com.airline.bean.Passenger;
import com.airline.bean.User;
import com.airline.bean.Visitor;

public interface IPassengerService {
    public void addPassenger(Visitor visitor);
    public void createPassengerAccount(User user);
    public void savePassengerInfo(Passenger passenger);
}
