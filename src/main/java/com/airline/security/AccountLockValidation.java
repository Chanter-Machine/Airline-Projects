package com.airline.security;

import com.airline.bean.User;
import com.airline.utils.Msg;

import java.util.Date;
import java.util.List;

//@Component
public class AccountLockValidation implements ILoginValidation {

    private final int LOCKTIMEMINS =30;
    public Msg result;
    public User user;

    //@Autowired
    //UserMapper userMapper;

    AccountLockValidation(User user){
        this.user=user;
    }

    AccountLockValidation(){
    }


    public Msg validate(User attemptingUser, List<User> userCollection) {



        result=new Msg();
        // set default error message
        result.setSuccessful(false);
        result.setMsg("There's an error with your account or it does not exist, please contact the administrator to assist.");
        if ((userCollection.size()==1) && (attemptingUser.getEmail().equals(userCollection.get(0).getEmail()))){
            //check if account is locked and for how long
            setUser(userCollection.get(0));
            if (user.getLocked()==null || user.getLocked()==false){

                //unlockAccount();
                result.setSuccessful(true);
                result.setMsg("");
                userCollection.clear();
                userCollection.add(user);
                result.add("user", userCollection);

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

    public User unlockAccount(){
        //unlock account and reset attempts
        user.setLocked(false);
        user.setLastlogin(new Date());
        user.setLoginattempts(0);

        //userMapper.updateByPrimaryKey(user);
        return user;
    }

    public void lockAccount(){

        //unlock account and reset attempts
        user.setLocked(true);
        user.setLastlogin(new Date());
        //userMapper.updateByPrimaryKey(user);

    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
