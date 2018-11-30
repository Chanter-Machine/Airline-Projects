package com.airline.services.order;

import com.airline.bean.Order;
import com.airline.bean.OrderExample;
import com.airline.bean.Passenger;
import com.airline.bean.Paymentrecord;
import com.airline.dao.OrderMapper;
import com.airline.dao.PaymentrecordMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class OrderServiceImp implements IOrderService {

    @Autowired
    OrderMapper orderMapper;
    @Autowired
    PaymentrecordMapper paymentrecordMapper;

    @Override
    public boolean addOrderAndGetId(Order o) {
        int i = orderMapper.insertAndGetId(o);
        if (i == 1) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean updateOrder(Order o) {
        int i = orderMapper.updateByPrimaryKeySelective(o);
        if (i == 1) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public List<Order> QueryOrders(OrderExample example) {
        List<Order> orderList = orderMapper.selectByExample(example);
        return orderList;
    }

    @Override
    public List<Order> QueryOrdersByPassenger(Integer passengerId) {
        OrderExample orderExample = new OrderExample();
        orderExample.or().andPassageridEqualTo(passengerId);
        List<Order> orderList = orderMapper.selectByExample(orderExample);
        return orderList;
    }

    @Override
    public Order QueryOrder(Integer id) {
        Order order = orderMapper.selectByPrimaryKey(id);
        return order;
    }


    public Order createOrder(Order order, Passenger passenger, Paymentrecord paymentrecord) {
        order.setStatus(Order.PendingStatus);
        order.setDate(new Date());
        order.setPassagerid(passenger.getPassengerid());
        paymentrecord.setStatus(Paymentrecord.PendingStatus);
        paymentrecordMapper.insertAndGetId(paymentrecord);
        order.setPaymentid(paymentrecord.getPaymentid());
        orderMapper.insertAndGetId(order);
        return order;
    }

    public Order orderIsPaid(Order order) {
        order.setStatus(Order.PaidStatus);
        orderMapper.updateByPrimaryKey(order);
        return order;
    }


    public boolean cancelOrder(Order order) {
        order.setStatus(Order.CancelledByPassengerStatus);
        int affectedRow = orderMapper.updateByPrimaryKey(order);
        if (affectedRow == 1) {
            return true;
        } else {
            return false;
        }
    }

    public boolean orderCompleted(Order order) {
        order.setStatus(Order.CompletedStatus);
        int affectedRow = orderMapper.updateByPrimaryKey(order);
        if (affectedRow == 1) {
            return true;
        } else {
            return false;
        }
    }
}
