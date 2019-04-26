package com.airline.services;

import com.airline.bean.User;
import org.springframework.beans.factory.annotation.Autowired;

public class AdminServiceImp implements IAdminService {
    @Autowired
    IUserService userService;

    @Override
    public int register(User user) {
        user.setRole(2);
        userService.addUser(user);
        saveAdminInfo();
        return 0;
    }

    public void saveAdminInfo(){
        //carry out other processes required to register an admin
    }
}
