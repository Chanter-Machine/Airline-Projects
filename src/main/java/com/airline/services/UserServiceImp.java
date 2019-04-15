package com.airline.services;

import com.airline.bean.User;
import com.airline.bean.UserExample;
import com.airline.bean.UserExample.Criteria;
import com.airline.dao.UserMapper;
import com.airline.security.Encryption;
import com.airline.security.Facade;
import com.airline.security.LoginValidationChain;
import com.airline.utils.Msg;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

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

	public User validateUser(User attemptingUser) {

		List<User> userList = getUsers(attemptingUser.getEmail());
		User user;

		//accountAccessValidation.begin(login);
		/*LoginValidationChain validationChain = new LoginValidationChain(attemptingUser, userList);
		User user;

		validationChain.run();
		result = validationChain.getResult();
		userList = (List<User>) result.getData().get("user");
        System.out.println(userList);*/


		Facade authentication = new Facade(attemptingUser, userList);
		authentication.completeUserAuthentication();
		result=authentication.getResult();
		userList = (List<User>) result.getData().get("user");

		System.out.println(authentication.getResult().getMsg());

		//if (userList!=null)
		if (userList.size() == 1) {
			user = userList.get(0);
			//log attempt details
			updateUser(user);

			if (result.isSuccessful()) {
				//System.out.println(user.getActivated());
				User producedUser = userFactory.produce(user);
				//System.out.println(producedUser.getClass().getName() +": "+producedUser.getActivated());
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
 		updateUser(user);

	}

	@Override
	public void updateUser(User user) {
		userMapper.updateByPrimaryKeySelective(user);
	}

	public Msg getResult() {
		return result;
	}
}
