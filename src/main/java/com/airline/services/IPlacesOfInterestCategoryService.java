package com.airline.services;

import com.airline.bean.PlacesOfInterestCategory;

import java.util.List;

public interface IPlacesOfInterestCategoryService {
    public List<PlacesOfInterestCategory> getAllCategory();
    public void addCategory(PlacesOfInterestCategory category);
    public void removeCategory(int categoryid);
}
