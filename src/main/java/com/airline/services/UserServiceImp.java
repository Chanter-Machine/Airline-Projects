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
	
	UserExample userExample = new UserExample();
	
	public User queryUser(String email, String password) {
		Criteria criteria = userExample.createCriteria();
		criteria.andEmailEqualTo(email);
		criteria.andPasswordEqualTo(password);
		
		List<User> userList = userMapper.selectByExample(userExample);

		return userList.size()==1?userList.get(0):null;
	
	}


	public void addUser(User user){

		List<User> users = getUserByEmail(user.getEmail());
		if (users.size()==0) {

			userMapper.insertAndGetId(user);
		}
	}


	public List<User> getUserByEmail(String email) {
		Criteria criteria = userExample.createCriteria();
		criteria.andEmailEqualTo(email);

		List<User> userList = userMapper.selectByExample(userExample);

		return userList;

	}
}
