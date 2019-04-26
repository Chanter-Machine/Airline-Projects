package com.airline.services;

import java.util.List;
import com.airline.bean.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.airline.dao.placesofinterestcategoryMapper;

@Service
public class PlacesOfInterestCategoryServiceImp implements IPlacesOfInterestCategoryService {

    @Autowired
    placesofinterestcategoryMapper categoryMapper;

    PlacesOfInterestCategoryExample categoryExample = new PlacesOfInterestCategoryExample();

    @Override
    public List<PlacesOfInterestCategory> getAllCategory(){
        return categoryMapper.selectByExample(categoryExample);
    }

    @Override
    public void addCategory(PlacesOfInterestCategory category){
        categoryMapper.insert(category);
    }
    @Override
    public void removeCategory(int categoryid){
        categoryMapper.deleteByPrimaryKey(categoryid);

    }
}
