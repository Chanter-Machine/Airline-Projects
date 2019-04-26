package com.airline.bean;

import java.util.Date;

import com.airline.services.MessageManagement.Mediator;

public class Passenger extends User {
    private Integer passengerid;

    private String passengername;

    private String address;

    private String phone;

    private Integer userid;

    private Date dob;

    public Integer getPassengerid() {
        return passengerid;
    }

    public void setPassengerid(Integer passengerid) {
        this.passengerid = passengerid;
    }

    public String getPassengername() {
        return passengername;
    }

    public void setPassengername(String passengername) {
        this.passengername = passengername == null ? null : passengername.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }
    
    @Override
    public void sendMessage(String sessionId, Message message) {
    	super.mediator.sendMessage(sessionId, message);
    }
    
    public void receiveMsg(Message message, User sender) {
    	System.out.println("Some send you a message");
    }
}