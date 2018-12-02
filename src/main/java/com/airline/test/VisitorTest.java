package com.airline.test;

import com.airline.deals.RunDealsVisit;

import com.airline.services.IDealService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.airline.bean.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations= {"classpath:applicationContext.xml"})

public class VisitorTest {

    @Autowired
    IDealService dealService;

    @Test
    public void test(){
        List<Deal> listofDeals=dealService.getAllDealsAndType();
        Passenger newpassenger = new Passenger();
        try {
            newpassenger.setDob(new SimpleDateFormat("yyyy-MM-dd").parse("2000-12-20"));
        } catch (ParseException e) {}
        RunDealsVisit runDealsVisit= new RunDealsVisit();
        runDealsVisit.setData(newpassenger, listofDeals);

        System.out.println("Discount: " + runDealsVisit.calculatePostage());

    }
}
