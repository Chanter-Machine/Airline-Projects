package com.airline.deals;

public class AdvertTest {
    public static void main(String args[])
    {
        AdvertCollection nc = new AdvertCollection();
        AdvertBar nb = new AdvertBar(nc);
        nb.displayAdverts();
    }
}
