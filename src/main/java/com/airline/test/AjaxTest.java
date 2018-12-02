package com.airline.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Date;
import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext.xml"})
public class AjaxTest {

    @Test
    @RequestMapping("/test.do")
    public void test01(Double amount, Date takeoffDate, @RequestParam(value = "flights_id[]") List<Integer> flights_id) {
        System.out.println(amount);
        System.out.println(takeoffDate);
        for (Integer integer :
                flights_id) {
            System.out.println(integer);
        }
    }
}
