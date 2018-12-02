package com.airline.test;

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

public class DealsTest {
    @Autowired
    IDealService dealService;

    @Test
    public void getAllDeals(){
        System.out.println(dealService.getAllDealsAndType());
    }

    @Test
    public void addNewDeal(){
        Deal newDeal = new Deal();
        newDeal.setDescription("Christmas");
        newDeal.setDiscount(3.5);
        newDeal.setTypeid(1);

       // newDealDate.setMinimumDate(20190101);

        dealService.addDeal(newDeal);

        if (newDeal.getDealid()==null){
            System.out.println("Unable to insert new user.");
        } else {

            System.out.println("New Deal inserted with ID: " + newDeal.getDealid());
        }
    }
}
