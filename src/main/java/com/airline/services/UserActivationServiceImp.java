package com.airline.services;

import com.airline.bean.UserActivation;
import com.airline.bean.UserActivationExample;
import com.airline.dao.UserActivationMapper;
import com.airline.utils.Mailer;
import com.airline.utils.Randomizer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.airline.bean.UserActivationExample.Criteria;

@Service
public class UserActivationServiceImp implements IUserActivationService {

    @Autowired
    UserActivationMapper userActivationMapper;

    @Autowired
    IUserService userService;

    @Override
    public void sendUserActivationCode(String email) {

        int PIN = generateCode();
        // write details to table
        UserActivation userActivationDets = new UserActivation();
        userActivationDets.setActivationcode(PIN);

        userActivationMapper.insertByEmail(userActivationDets, email);

        //send an email containing the code to user
        Mailer mailer = new Mailer();


    }

    @Override
    public int generateCode() {
        Randomizer rnd = new Randomizer();
        int PIN = rnd.generate(1001,9999);
        return PIN;
    }

    @Override
    public boolean validateActivationCode(int userid, int activationcode) {
        UserActivationExample userActivationExample = new UserActivationExample();
        Criteria criteria = userActivationExample.createCriteria();
        criteria.andActivationcodeEqualTo(activationcode);
        criteria.andUseridEqualTo(userid);

        if (userActivationMapper.countByExample(userActivationExample)==1) {
            userService.activateUser(userid);
            return true;
        }
        else
            return false;
    }

    @Override
    public int returnActivationCode(int userid) {
        UserActivationExample userActivationExample = new UserActivationExample();
        Criteria criteria = userActivationExample.createCriteria();
        criteria.andUseridEqualTo(userid);
        UserActivation userActivation = userActivationMapper.selectByExample(userActivationExample).get(0);
        return userActivation.getActivationcode();
    }
}
