package com.airline.services;

import com.airline.bean.Advert;

import java.util.List;

public interface IAdvertService {
    public List<Advert> getAllAdverts();
    public void addAdvert(Advert advert);
    public void removeAdvert(int advertid);

}
