package com.airline.security;

import com.airline.bean.User;
import com.airline.utils.Msg;

import java.util.List;

public class AccountValidation implements ILoginValidation {


    private Msg result;
    private User user;
    private List<User> users;


    @Override
    public Msg validate(User attemptingUser, List<User> userCollection) {
        //check that account exists
        result = new Msg();
        // set default error message
        result.setSuccessful(false);
        result.setMsg("There's an error with your account, please contact the administrator to assist.");

        //check for multiple user errors

        try {
            setUser(userCollection.get(0)); //userService.getUsers(login.email).get(0);
            result.setSuccessful(true);
            result.add("user", userCollection);
            result.setMsg("User exists!");
        } catch (IndexOutOfBoundsException ex){
            result.setSuccessful(false);
            result.setMsg("User does not exist!");


        }

        return result;
    }

    public Msg getResult() {
        return result;
    }

    public void setResult(Msg result) {
        this.result = result;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }
}
