package com.airline.dto;

import java.util.ArrayList;

public class TransactionItemList {

    private ArrayList<TransactionItemDetailsDto> items;
    private ShippingAddress shipping_address;

    public ArrayList<TransactionItemDetailsDto> getItems() {
        return items;
    }

    public void setItems(ArrayList<TransactionItemDetailsDto> items) {
        this.items = items;
    }

    public ShippingAddress getShipping_address() {
        return shipping_address;
    }

    public void setShipping_address(ShippingAddress shipping_address) {
        this.shipping_address = shipping_address;
    }


}
