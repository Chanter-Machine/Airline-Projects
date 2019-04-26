package com.airline.controllers;

import com.airline.bean.Flight;
import com.airline.bean.Flightandorder;
import com.airline.bean.Order;
import com.airline.bean.Paymentrecord;
import com.airline.dao.FlightMapper;
import com.airline.dao.FlightandorderMapper;
import com.airline.services.order.IOrderService;
import com.airline.services.payment.IPaymentService;
import com.airline.utils.Msg;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

@RestController
@RequestMapping("/orders")
public class Orders {

    @Autowired
    private IOrderService orderService;

    @Autowired
    private IPaymentService paymentService;
    @Autowired
    private FlightandorderMapper flightandorderMapper;

    @Autowired
    private FlightMapper flightMapper;

    @ApiOperation(value = "Create an order")
    @RequestMapping(value = "/createOrder", method=RequestMethod.GET)
    public Order createOrder(@RequestParam(value="amount") Double amount, @RequestParam(value = "passengerid") int passengerid)
    {
        Order order = new com.airline.bean.Order();
        Paymentrecord payment = new Paymentrecord();
        payment.setAmount(amount.toString());
        //start to process
        Order orderCreated = orderService.createOrder(order, passengerid, payment);
        return  orderCreated;
    }

    @ApiOperation(value = "Add a flight to an order")
    @RequestMapping(value = "/addFlightToOrder", method=RequestMethod.GET)
    public Msg addFlighttoOrder(@RequestParam(value="takeoffDate") Date takeoffDate, @RequestParam(value = "flights_id") int[] flights_id, Order orderCreated){
        // flightdandorder table insert
        Flightandorder flightandorder = new Flightandorder();
        flightandorder.setOrderid(orderCreated.getOrderid());
        Order order = new com.airline.bean.Order();

        for (int i :
                flights_id) {
            flightandorder.setFlightid(i);
            Flight flight = flightMapper.selectByPrimaryKey(i);
            takeoffDate.setHours(flight.getTakeofftime().getHours());
            takeoffDate.setMinutes(flight.getTakeofftime().getMinutes());
            takeoffDate.setSeconds(flight.getTakeofftime().getSeconds());
            flightandorder.setOrderid(order.getOrderid());
            flightandorder.setSeatnum(7);
            flightandorder.setSeattype("Economic");
            flightandorder.setTakeoffdate(takeoffDate);
            flightandorderMapper.insert(flightandorder);
        }
        return Msg.success().add("order", order);
    }

    @ApiOperation(value = "Cancel an order")
    @RequestMapping(value = "/cancelOrder", method=RequestMethod.GET)
    public boolean cancelOrder(Order order){
        boolean result = orderService.cancelOrder(order);
        return result;
    }
}
