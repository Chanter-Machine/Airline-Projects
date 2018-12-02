package com.airline.security;

import com.airline.bean.User;
import com.airline.utils.Msg;

import java.util.List;

public interface ILoginValidation {
    public Msg validate(User attemptingUser, List<User> userCollection);
}
