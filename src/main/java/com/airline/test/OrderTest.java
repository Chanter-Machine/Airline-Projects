package com.airline.test;

import com.airline.bean.UserFlight;
import com.airline.services.order.IOrderService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;
import java.util.stream.Collectors;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations= {"classpath:applicationContext.xml"})
public class OrderTest {

    @Autowired
    IOrderService orderService;

    @Test
    public void GetUserFlightOrders(){
        int passengerid=10;
        List<UserFlight> orders = orderService.orderWithFlightByPassenger(passengerid);

        for (UserFlight flightorder: orders){
            //if (!flightorder.getFlightOrigin().equals(null) && !flightorder.getFlightDestination().equals(null)) {
                System.out.println(flightorder.getOrderID() + " -> From: "+ flightorder.getFlightOrigin() + " to " + flightorder.getFlightDestination() + " on " + flightorder.getFlightDate() + " ( " + flightorder.getFlightTime() + ") ");
            //}

        }


        List<Integer> orderIDs = orders.stream().map(o->o.getOrderID()).distinct().collect(Collectors.toList());
        System.out.println(orderIDs.size());
    }
}
