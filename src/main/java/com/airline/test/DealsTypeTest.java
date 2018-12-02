package com.airline.test;


import com.airline.services.IDealTypeService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.omg.CORBA.PUBLIC_MEMBER;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.airline.bean.*;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations= {"classpath:applicationContext.xml"})

public class DealsTypeTest {

    @Autowired
    IDealTypeService dealTypeService;

    @Test
    public void addNewDealType(){
        Dealtype newDealType = new Dealtype();
        newDealType.setType("Age");
        newDealType.setMinage(0);
        newDealType.setMaxage(17);
        newDealType.setMindate(null);
        newDealType.setMaxdate(null);
        newDealType.setRangetypecode(1);

        dealTypeService.addDealtype(newDealType);

        if (newDealType.getTypeid()==null){
            System.out.println("Unable to insert new dealtype.");
        } else {

            System.out.println("New Dealtype inserted with ID: " + newDealType.getTypeid());
        }
    }
}
