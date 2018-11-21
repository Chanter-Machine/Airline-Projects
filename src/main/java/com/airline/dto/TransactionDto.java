package com.airline.dto;

public class TransactionDto {

    private TransactionAmountDto amount;
    private TransactionItemList item_list;

    private String description;
    private String invoice_number;
    private String custom;

    public TransactionAmountDto getAmount() {
        return amount;
    }

    public void setAmount(TransactionAmountDto amount) {
        this.amount = amount;
    }

    public TransactionItemList getItem_list() {
        return item_list;
    }

    public void setItem_list(TransactionItemList item_list) {
        this.item_list = item_list;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getInvoice_number() {
        return invoice_number;
    }

    public void setInvoice_number(String invoice_number) {
        this.invoice_number = invoice_number;
    }

    public String getCustom() {
        return custom;
    }

    public void setCustom(String custom) {
        this.custom = custom;
    }


}

