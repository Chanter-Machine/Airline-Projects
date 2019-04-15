package com.airline.security;

import com.airline.bean.User;
import com.airline.utils.Msg;
import java.util.List;

public class Facade implements IFacade {

    private Msg result;
    private User user;
    private List<User> users;

    public Facade(User user, List<User> users){
        this.user=user;
        this.users=users;
        this.result=new Msg();
    }

    @Override
    public void validateAccountExists() {
        execute("validateAccountExists");
    }

    @Override
    public void checkAuthentication() {
        execute("checkAuthentication");
    }

    @Override
    public void checkAccess() {
        execute("checkAccess");
    }

    public void completeUserAuthentication(){
        LoginValidationChain loginValidations = new LoginValidationChain(user, users);
        loginValidations.run();
        result = loginValidations.getResult();
    }

    public Msg getResult() {
        return result;
    }

    private void execute(String validationType){
        ILoginValidation av = new FacadeFactory().produce(validationType);
        result = av.validate(user, users);
    }
}
