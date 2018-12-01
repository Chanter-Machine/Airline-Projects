package com.airline.services;

public interface IUserActivationService {
    int generateCode();
    void sendUserActivationCode(String email);
    boolean validateActivationCode(int userid, int activationcode);
}
