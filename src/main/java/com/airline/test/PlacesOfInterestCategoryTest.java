package com.airline.test;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.airline.bean.PlacesOfInterestCategory;
import com.airline.services.IPlacesOfInterestCategoryService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations= {"classpath:applicationContext.xml"})

public class PlacesOfInterestCategoryTest {

    @Autowired
    IPlacesOfInterestCategoryService categoryService;

    @Test
    public void getAllCategory() {
        List<PlacesOfInterestCategory>category = categoryService.getAllCategory();
        for(int i=0;i< category.size();i++) {
            System.out.println(category.get(i).getPlacesofinterestcategoryname());
        }
    }
}
