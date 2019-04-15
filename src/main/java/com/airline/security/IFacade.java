package com.airline.security;

public interface IFacade {
    public void validateAccountExists();
    public void checkAuthentication();
    public void checkAccess();
}
