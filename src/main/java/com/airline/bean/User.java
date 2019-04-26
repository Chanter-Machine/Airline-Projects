package com.airline.bean;

import com.airline.deals.DealObserver;
import com.airline.services.MessageManagement.Mediator;

import java.util.Date;

public class User implements DealObserver {
    private Integer userid;

    private String password;

    private Integer role;

    private String email;

    private Integer loginattempts;

    private Boolean activated;

    private Boolean locked;

    private Date lastlogin;

    private Boolean subscribed;
    
    public Mediator mediator;

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public Integer getRole() {
        return role;
    }

    public void setRole(Integer role) {
        this.role = role;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public Integer getLoginattempts() {
        return loginattempts;
    }

    public void setLoginattempts(Integer loginattempts) {
        this.loginattempts = loginattempts;
    }

    public Boolean getActivated() {
        return activated;
    }

    public void setActivated(Boolean activated) {
        this.activated = activated;
    }

    public Boolean getLocked() {
        return locked;
    }

    public void setLocked(Boolean locked) {
        this.locked = locked;
    }

    public Date getLastlogin() {
        return lastlogin;
    }

    public void setLastlogin(Date lastlogin) {
        this.lastlogin = lastlogin;
    }

    public Boolean getSubscribed() {
        return subscribed;
    }

    public void setSubscribed(Boolean subscribed) {
        this.subscribed = subscribed;
    }
    
    public Mediator getMediator() {
		return mediator;
	}

	public void setMediator(Mediator mediator) {
		this.mediator = mediator;
	}
	
	public void sendMessage(String sessionId, Message message) {}

	@Override
    public void update(String dealName, String passengerEmail){}
}