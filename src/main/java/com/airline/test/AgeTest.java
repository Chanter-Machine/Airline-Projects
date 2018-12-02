package com.airline.test;

import com.airline.services.IDealAgeService;
import com.airline.services.IDealDateService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.omg.CORBA.PUBLIC_MEMBER;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.airline.bean.*;
import com.airline.services.IDealService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations= {"classpath:applicationContext.xml"})

public class AgeTest {
    @Autowired
    IDealService dealService;

    @Autowired
    IDealAgeService dealAgeService;

    @Autowired
    IDealDateService dealDateService;

    @Test
    public void addNewAge(){
        DealAge newDealAge = new DealAge();
        newDealAge.setRangeid(1);
        newDealAge.setMinimumAge(0);
        newDealAge.setMaximumAge(17);
        // newDealDate.setMinimumDate(20190101);

        dealAgeService.addDealAge(newDealAge);

        if (newDealAge.getRangeid()==null){
            System.out.println("Unable to insert new age.");
        } else {

            System.out.println("New Age inserted with ID: " + newDealAge.getRangeid());
        }
    }
}
