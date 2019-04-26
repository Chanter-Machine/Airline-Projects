package com.airline.services;

import com.airline.bean.Continent;

import java.util.List;

public interface IContinentService {
    public List<Continent> getAllContinents();
    public void addContinent(Continent cont);
    public void removeContinent(int contid);
}
