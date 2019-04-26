package com.airline.test;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.airline.bean.Continent;
import com.airline.services.IContinentService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations= {"classpath:applicationContext.xml"})

public class ContinentTest {

    @Autowired
    IContinentService continentService;

    @Test
    public void getAllContinents() {
        List<Continent>continents = continentService.getAllContinents();
        for(int i=0;i< continents.size();i++) {
            System.out.println(continents.get(i).getContinentname());
        }
    }
}