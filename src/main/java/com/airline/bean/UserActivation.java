package com.airline.bean;

import java.util.Date;

public class UserActivation {
    private Integer id;

    private Integer userid;

    private Integer activationcode;

    private Boolean used;

    private Date timegenerated;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public Integer getActivationcode() {
        return activationcode;
    }

    public void setActivationcode(Integer activationcode) {
        this.activationcode = activationcode;
    }

    public Boolean getUsed() {
        return used;
    }

    public void setUsed(Boolean used) {
        this.used = used;
    }

    public Date getTimegenerated() {
        return timegenerated;
    }

    public void setTimegenerated(Date timegenerated) {
        this.timegenerated = timegenerated;
    }
}