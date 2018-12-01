package com.airline.security;

import com.airline.bean.Login;
import com.airline.bean.User;
import com.airline.utils.Msg;

import java.util.List;

public class AccountValidation implements ILogin {


    public Login login;
    public Msg result;
    public User user;
    protected List<User> users;

    public void setLogin(Login login) {
        this.login = login;
    }

    public void setResult(Msg result) {
        this.result = result;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public AccountValidation(Login login, List<User> users) {
        this.login=login;
        this.users=users;
        result = validate();
    }


    @Override
    public Msg validate() {
        //check that account exists
        Msg val_result = new Msg();

        try {
            setUser(users.get(0)); //userService.getUsers(login.email).get(0);
            val_result.setSuccessful(true);
            val_result.setMsg("User exists!");
        } catch (IndexOutOfBoundsException ex){
            val_result.setSuccessful(false);
            val_result.setMsg("User does not exist!");

        }

        return val_result;
    }

}
