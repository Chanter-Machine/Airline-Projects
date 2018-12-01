package com.airline.services;
import com.airline.bean.Passenger;
import com.airline.bean.User;

public interface IPassengerService extends IRegistrationService {
    public void createPassengerAccount(User user);
    public void savePassengerInfo(Passenger passenger);
    public Passenger getPassengerByUserID(int id);
}
