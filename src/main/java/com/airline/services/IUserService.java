package com.airline.services;
import java.util.List;

import com.airline.bean.Login;
import com.airline.bean.User;
import com.airline.utils.Msg;

public interface IUserService {
	public List<User> getUserBySubscribed();
	User validateUser(Login login);
	void addUser(User user);
	List<User> getUsers(String email);
	void activateUser(int userid);
	List<User> getUsers(int userid);
	void updateUser(User user);
	Msg getResult();
}
