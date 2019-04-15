package com.airline.security;

public class FacadeFactory {

    public ILoginValidation produce(String product){
        ILoginValidation validationType=null;
        switch (product) {
            case "validateAccountExists":
                validationType = new AccountValidation();
                break;
            case "checkAuthentication":
                validationType =  new AccountAccessValidation();
                break;
            case "checkAccess":
                validationType =  new AccountLockValidation();
                break;
        }
        return validationType;
    }

}
