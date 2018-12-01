package com.airline.services;

import com.airline.bean.Dealtype;

import java.util.List;

public interface IDealTypeService {
    public void addDealtype(Dealtype dealtype);
    public List<Dealtype> getAllDealTypes();
    public void removeDealtype(int id);
}
