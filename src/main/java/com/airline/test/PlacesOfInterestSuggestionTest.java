package com.airline.test;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.airline.bean.PlacesOfInterestSuggestion;
import com.airline.services.IPlacesOfInterestSuggestionService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations= {"classpath:applicationContext.xml"})

public class PlacesOfInterestSuggestionTest {

    @Autowired
    IPlacesOfInterestSuggestionService suggestionService;

    @Test
    public void getAllCategory() {
        List<PlacesOfInterestSuggestion>suggestion = suggestionService.getAllSuggestion();
        for(int i=0;i< suggestion.size();i++) {
            System.out.println(suggestion.get(i).getPlacesofinterestsuggestionname());
        }
    }
}
