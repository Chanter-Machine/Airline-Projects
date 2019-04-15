package com.airline.advert;

public class AdvertMemento implements Memento {
    private int advertid;
    public AdvertMemento(int advertid) {
        super();
        this.advertid = advertid;
    }
    public int getAdvertid() {
        return advertid;
    }
    public void setAdvert(int advertid) {
        this.advertid = advertid;
    }
}
