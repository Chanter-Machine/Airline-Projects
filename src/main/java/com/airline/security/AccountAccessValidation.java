package com.airline.security;

import com.airline.bean.Login;
import com.airline.bean.User;
import com.airline.utils.Msg;

import java.util.Date;
import java.util.List;

public class AccountAccessValidation extends AccountLockValidation {

    private String email;
    private String password;
    private final int MAXATTEMPTS=5;
    private int loginAttempts;
    private int latestAttemptCount;

    //@Autowired
    public AccountAccessValidation(Login login, List<User> users) {
        super(login, users);
        this.email = login.email;
        this.password = login.password;
        result = validateAccess();
    }

    public Msg validateAccess() {
        if (result.isSuccessful()){

            loginAttempts = user.getLoginattempts();

            //lock account if attempts exceed allowed amount
            if (loginAttempts <= MAXATTEMPTS){
                //check if the correct password was provided
                if (!encryptPassword(password).equals(user.getPassword())){
                    //increase login attempts
                    result.setSuccessful (false);
                    String msg="Incorrect username or password provided, please check that you have provided the correct details. " + logFailedAttempt();
                    result.setMsg(msg);

                } else {
                    super.unlockAccount();
                }
            } else {
                result.setSuccessful(false);
                result.setMsg("You have exceeded the maximum failed attempts and your account has been locked.");
                if (!(user.getLocked()==null || user.getLocked()==false)){
                    super.lockAccount();
                }
            }

        }
        return result;
    }

    public String logFailedAttempt(){

        String msg="";


        latestAttemptCount = user.getLoginattempts() + 1;
        user.setLoginattempts(latestAttemptCount);
        user.setLastlogin((new Date()));

        if (latestAttemptCount>=MAXATTEMPTS) {
            user.setLocked(true);
            msg = "Due to multiple failed login attempts, your account has been locked, it will be unlocked in 30mins.";
        }

        //userMapper.updateByPrimaryKey(user);
        return msg;
    }

    public String encryptPassword(String password) {
        Encryption security = new Encryption();
        return security.encrypt(password);
    }

    public User getUser(){
        return user;
    }

    public Msg getResult(){
        return result;
    }
}
