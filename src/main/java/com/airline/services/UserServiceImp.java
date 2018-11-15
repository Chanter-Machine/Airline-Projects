package com.airline.services;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.object.UpdatableSqlQuery;
import org.springframework.stereotype.Service;

import com.airline.bean.User;
import com.airline.bean.UserExample;
import com.airline.dao.UserMapper;
import com.airline.bean.UserExample.Criteria;

@Service
public class UserServiceImp implements IUserService {

	@Autowired
	UserMapper userMapper;
	
	UserExample userExample;
	
	public User queryUser(String email, String password) {
		userExample = new UserExample();
		Criteria criteria = userExample.createCriteria();
		criteria.andEmailEqualTo(email);
		criteria.andPasswordEqualTo(password);
		
		List<User> userList = userMapper.selectByExample(userExample);
		
		return userList.size()==1?userList.get(0):null;
	
	}

	public User createUser(User user) {
		userMapper.insertUserAndGetId(user);
		System.out.println("get user id here"+ user.getUserid());
		return null;
	}

	public User createUser() {
		User user = new User();
		user.setEmail("test2@Ul.com");
		user.setPassword("123456");
		user.setRole("Passenger");
		userMapper.insertUserAndGetId(user);
		System.out.println("get user id here "+ user.getUserid());
		return null;
	}
}
