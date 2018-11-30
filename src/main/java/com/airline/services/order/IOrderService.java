package com.airline.services.order;

import com.airline.bean.Order;
import com.airline.bean.OrderExample;
import com.airline.bean.Passenger;
import com.airline.bean.Paymentrecord;

import java.util.List;

public interface IOrderService {

    public boolean updateOrder(Order o);

    public List<Order> QueryOrders(OrderExample example);

    public Order QueryOrder(Integer id);

    public boolean addOrderAndGetId(Order o);

    public List<Order> QueryOrdersByPassenger(Integer passengerId);

    public Order createOrder(Order order, Passenger passenger, Paymentrecord paymentrecord);

    public Order orderIsPaid(Order order);

    public boolean cancelOrder(Order order);

    public boolean orderCompleted(Order order);
}
