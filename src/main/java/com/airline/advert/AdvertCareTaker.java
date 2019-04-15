package com.airline.advert;

public class AdvertCareTaker implements Caretaker {
    @Override
    public void addMemento(Memento m) {
        // TODO Auto-generated method stub
        stack.push(m);
    }
    @Override
    public Memento getMemento() {
        // TODO Auto-generated method stub
        return stack.pop();
    }
}
