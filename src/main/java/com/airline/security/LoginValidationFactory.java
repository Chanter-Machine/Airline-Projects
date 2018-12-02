package com.airline.security;

import java.util.ArrayList;
import java.util.List;

public class LoginValidationFactory {
    List<ILoginValidation> validations=new ArrayList<>();

    LoginValidationFactory(){
        validations.add(new AccountValidation());
        validations.add(new AccountLockValidation());
        validations.add(new AccountAccessValidation());
    }

    public List<ILoginValidation> get() {
        return validations;
    }
}
