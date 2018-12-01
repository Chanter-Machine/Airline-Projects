package com.airline.services;

import java.util.List;

import com.airline.bean.Login;
import com.airline.security.AccountAccessValidation;
import com.airline.security.Encryption;
import com.airline.utils.Msg;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.airline.bean.User;
import com.airline.bean.UserExample;
import com.airline.dao.UserMapper;
import com.airline.bean.UserExample.Criteria;

@Service
public class UserServiceImp implements IUserService {

	@Autowired
	UserMapper userMapper;


	UserExample userExample=new UserExample();

	@Autowired
	UserFactory userFactory;

	Msg result=new Msg();

	//@Autowired
	//AccountAccessValidation accountAccessValidation;

	public User validateUser(Login login) {

		List<User> userList = getUsers(login.email);

		//accountAccessValidation.begin(login);
		AccountAccessValidation accountAccessValidation = new AccountAccessValidation(login, userList);
		User user = accountAccessValidation.getUser();
		result = accountAccessValidation.getResult();

		if (user != null) {
			updateUser(user);

			if (result.isSuccessful()) {
				User producedUser = userFactory.produce(user);
				return producedUser;
			} else {
				return null;
			}
		}

		return null;
	}

	public void addUser(User user){

		//encrypt user's password
		String password = user.getPassword();
		password = new Encryption().encrypt(password);
		user.setPassword(password);

		List<User> users = getUsers(user.getEmail());
		if (users.size()==0) {

			userMapper.insert(user);
		}
	}

	@Override
	public List<User> getUsers(String email) {
		Criteria criteria = userExample.createCriteria();
		criteria.andEmailEqualTo(email);

		List<User> userList = userMapper.selectByExample(userExample);

		return userList;
	}


	@Override
	public List<User> getUserBySubscribed() {
		Criteria criteria = userExample.createCriteria();
		criteria.andSubscribedEqualTo(true);

		List<User> userList = userMapper.selectByExample(userExample);

		return userList;
	}

	@Override
	public List<User> getUsers(int userid) {
		Criteria criteria = userExample.createCriteria();
		criteria.andUseridEqualTo(userid);

		List<User> userList = userMapper.selectByExample(userExample);

		return userList;
	}

	@Override
	public void activateUser(int userid) {
		Criteria criteria = userExample.createCriteria();
		criteria.andUseridEqualTo(userid);

		User user = getUsers(userid).get(0);
		user.setActivated(true);

		userMapper.updateByExample(user, userExample);

	}

	@Override
	public void updateUser(User user) {
		userMapper.updateByPrimaryKey(user);
	}

	public Msg getResult() {
		return result;
	}
}
