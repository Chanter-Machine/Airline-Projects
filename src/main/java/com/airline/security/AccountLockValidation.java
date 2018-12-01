package com.airline.security;

import com.airline.bean.Login;
import com.airline.bean.User;
import com.airline.dao.UserMapper;
import com.airline.utils.Msg;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.List;

//@Component
public class AccountLockValidation extends AccountValidation {

    private final int LOCKTIMEMINS =30;

    //@Autowired
    //UserMapper userMapper;

    @Autowired
    public AccountLockValidation(Login login, List<User> users) {
        super(login, users);
        result = checkLock();
    }

    public Msg checkLock() {
        if (result.isSuccessful()){
            //check if account is locked and for how long
            //User user = (User) result.getData();
            if (user.getLocked()==null || user.getLocked()==false){

                //unlockAccount();
                result.setSuccessful(true);
                result.setMsg("");

                }
                else {

                    //time left for lock
                    long lockTimeLeft = lockTimeRemaining(user.getLastlogin());
                    if (lockTimeLeft < LOCKTIMEMINS) {
                        result.setSuccessful(false);
                        result.setMsg("Your account is locked due to multiple failed attempts. Please retry in "+(LOCKTIMEMINS - lockTimeLeft)+" mins");
                    } else {
                        unlockAccount();
                    }

            }
        }
        return result;
    }

    private long lockTimeRemaining(Date locktime){
        long timeDiff = ((new Date()).getTime() - locktime.getTime());
        long timeDiffMins = timeDiff/(60 * 1000) % 60;
        return timeDiffMins;
    }

    protected User unlockAccount(){
        //unlock account and reset attempts
        user.setLocked(false);
        user.setLastlogin(new Date());
        user.setLoginattempts(0);

        //userMapper.updateByPrimaryKey(user);
        return user;
    }

    protected void lockAccount(){

        //unlock account and reset attempts
        user.setLocked(true);
        user.setLastlogin(new Date());
        //userMapper.updateByPrimaryKey(user);

    }


}
