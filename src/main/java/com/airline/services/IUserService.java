package com.airline.services;

import com.airline.bean.User;

public interface IUserService {
	public User queryUser(String email, String password);
}
