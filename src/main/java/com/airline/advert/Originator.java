package com.airline.advert;

public interface Originator {
    public Memento save();
    public void restore(Memento memento);
    public void setAdvertid(int advertid);
}
