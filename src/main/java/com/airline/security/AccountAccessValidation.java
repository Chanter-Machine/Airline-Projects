package com.airline.security;

import com.airline.bean.Login;
import com.airline.bean.User;
import com.airline.utils.Msg;

import java.util.Date;
import java.util.List;

public class AccountAccessValidation implements ILoginValidation {

    private String email;
    private String password;
    private final int MAXATTEMPTS=5;
    private int loginAttempts;
    private int latestAttemptCount;
    public Login login;
    public Msg result;
    public User user;

    //@Autowired

    AccountAccessValidation(){}


    public Msg validate(User attemptingUser, List<User> userCollection) {

        // set default error message
        result=new Msg();
        result.setSuccessful(false);
        result.setMsg("There's an error with your account or it does not exist, please contact the administrator to assist.");
        try
        {
        if (userCollection.size()==1 && (attemptingUser.getEmail().equals(userCollection.get(0).getEmail()))){
            setUser(userCollection.get(0));
            loginAttempts = user.getLoginattempts();

            //lock account if attempts exceed allowed amount
            if (loginAttempts <= MAXATTEMPTS){
                //check if the correct password was provided
                if (!encryptPassword(attemptingUser.getPassword()).equals(user.getPassword())){

                    //increase login attempts
                    result.setSuccessful (false);
                    String msg="Incorrect username or password provided, please check that you have provided the correct details. " + logFailedAttempt();
                    result.setMsg(msg);

                } else {
                    result.setSuccessful(true);
                    result.setMsg("");
                    AccountLockValidation accountLockValidation = new AccountLockValidation(user);
                    setUser(accountLockValidation.unlockAccount());

                    userCollection.clear();
                    userCollection.add(user);
                    result.add("user", userCollection);

                }
            } else {
                result.setSuccessful(false);
                result.setMsg("You have exceeded the maximum failed attempts and your account has been locked.");
                if (!(user.getLocked()==null || user.getLocked()==false)){
                    AccountLockValidation accountLockValidation = new AccountLockValidation(user);
                    accountLockValidation.lockAccount();
                }
            }

        }}
        catch(NullPointerException ex) {

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

    public void setUser(User user) {
        this.user = user;
    }
}
