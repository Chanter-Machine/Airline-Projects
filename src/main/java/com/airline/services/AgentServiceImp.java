package com.airline.services;

import com.airline.bean.User;
import org.springframework.beans.factory.annotation.Autowired;

public class AgentServiceImp implements IAgentService {

    @Autowired
    IUserService userService;

    @Override
    public int register(User user) {
        user.setRole(3);
        userService.addUser(user);
        saveAgentDetails();
        return 0;
    }

    public void saveAgentDetails(){

    }
}
