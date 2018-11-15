package com.airline.services;
import java.util.List;
import com.airline.bean.User;

public interface IUserService {
	public User queryUser(String email, String password);
	public void addUser(User user);
	public List<User> getUserByEmail(String email);


}
