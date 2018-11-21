package com.airline.dto;

import java.util.ArrayList;
import java.util.Map;

public class CreatePaymentDto {

    private String intent;
    private String experience_profile_id;
    private Map<String, String> redirect_urls;
    private Map<String, String> payer;
    private ArrayList<TransactionDto> transactions;

    public String getIntent() {
        return intent;
    }

    public void setIntent(String intent) {
        this.intent = intent;
    }

    public String getExperience_profile_id() {
        return experience_profile_id;
    }

    public void setExperience_profile_id(String experience_profile_id) {
        this.experience_profile_id = experience_profile_id;
    }

    public Map<String, String> getRedirect_urls() {
        return redirect_urls;
    }

    public void setRedirect_urls(Map<String, String> redirect_urls) {
        this.redirect_urls = redirect_urls;
    }

    public Map<String, String> getPayer() {
        return payer;
    }

    public void setPayer(Map<String, String> payer) {
        this.payer = payer;
    }

    public ArrayList<TransactionDto> getTransactions() {
        return transactions;
    }

    public void setTransactions(ArrayList<TransactionDto> transactions) {
        this.transactions = transactions;
    }


}
