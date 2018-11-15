package com.airline.bean;

public class Visitor extends Passenger {


        private String email;

        private String password;

    Passenger passengerInfo;

    User userInfo;

    public Passenger getPassengerInfo() {
        return passengerInfo;
    }

    public void setPassengerInfo(Passenger passengerInfo) {
        this.passengerInfo = passengerInfo;
    }

    public User getUserInfo() {
        return userInfo;
    }

    public void setUserInfo(User userInfo) {
        this.userInfo = userInfo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
