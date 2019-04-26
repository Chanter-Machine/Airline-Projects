package com.airline.controllers;

import com.airline.bean.Order;
import com.airline.bean.Paymentrecord;
import com.airline.bean.User;
import com.airline.services.IUserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class Users {

    @Autowired
    IUserService userService;

    @ApiOperation(value = "Get User by User ID")
    @RequestMapping(value = "/getUserByID", method=RequestMethod.GET)
    public List<User> getUserByID(@RequestParam(value="userid") int userid)
    {
        return userService.getUsers(userid);
    }

    @ApiOperation(value = "Get User by Email")
    @RequestMapping(value = "/getUserByEmail", method=RequestMethod.GET)
    public List<User> getUserByEmail(@RequestParam(value="email") String email)
    {
        return userService.getUsers(email);
    }
}
