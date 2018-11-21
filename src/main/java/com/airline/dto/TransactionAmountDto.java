package com.airline.dto;


public class TransactionAmountDto {

    private String total;
    private String currency;
    private TransactionDetailsDto details;

    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public TransactionDetailsDto getDetails() {
        return details;
    }

    public void setDetails(TransactionDetailsDto details) {
        this.details = details;
    }


}
