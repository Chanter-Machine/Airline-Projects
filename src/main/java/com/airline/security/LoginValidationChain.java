package com.airline.security;

import com.airline.bean.User;
import com.airline.utils.Msg;

import java.util.List;

public class LoginValidationChain {
    private Msg result=new Msg();
    private User user;
    private LoginValidationFactory Rules = new LoginValidationFactory();
    private List<User> userCollection;

    public LoginValidationChain(User attemptingUser, List<User> userCollection){
        result.setSuccessful(true);
        this.userCollection=userCollection;
        this.user=attemptingUser;

    }

    public void run(){
        for (ILoginValidation rule: Rules.get()){
            result = rule.validate(user, userCollection);
            //if (!result.isSuccessful()) break;
            userCollection = (List<User>) result.getData().get("user");
            System.out.println(result.getMsg() + ": " + userCollection.size());
        }

        result.add("user", userCollection);
        System.out.println(result.getMsg() + " : " + userCollection.size());
    }

    public Msg getResult() {
        return result;
    }
}
