package com.airline.handlers;

import com.airline.bean.Order;
import com.airline.bean.Passenger;
import com.airline.bean.Paymentrecord;
import com.airline.dao.FlightandorderMapper;
import com.airline.services.order.IOrderService;
import com.airline.services.payment.IPaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.Date;

@Controller
public class OrderController {

    @Autowired
    private IOrderService orderService;

    @Autowired
    private IPaymentService paymentService;
    @Autowired
    private FlightandorderMapper flightandorderMapper;

    @RequestMapping("/create_order.do")
    public ModelAndView createOrder(HttpServletRequest request, HttpSession session, Double amount, Date takeoffDate, @RequestParam(value = "flights_id") int[] flights_id) {
        //get the necessary data
        Passenger passenger = (Passenger) session.getAttribute("passenger");
        Order order = new Order();

        Paymentrecord payment = (Paymentrecord) session.getAttribute("payment");
//todo        List<Flight> flightList = (List<Flight>) session.getAttribute("flights");

        //start to process
        Order orderCreated = orderService.createOrder(order, passenger, payment);
        //todo flightdandorder table insert
//        Flightandorder flightandorder = new Flightandorder();
//        flightandorder.setOrderid(orderCreated.getOrderid());
//        for (Flight f :
//                flightList) {
//            //todo seatnum and seat type
//            flightandorder.setFlightid(f.getFlightid());
////            flightandorder.setSeatnum();
////            flightandorder.setSeattype();
////            flightandorder.setFlightid();
////            flightandorder.setTakeoffdate();
//            flightandorderMapper.insert(flightandorder);
//        }
        //todo seat table insert
        ModelAndView modelAndView = new ModelAndView();
        if (request != null) {
            modelAndView.addObject("order", orderCreated);
//            modelAndView.addObject("flights", flightList);
            modelAndView.setViewName("checkOrder.jsp");
            //todo get flights of the order and add them to modelandview ,then forward to a checkOrder page

        } else {
            //todo fail to create order and forward to orderCreationFailed page
        }
        return modelAndView;
    }

    @RequestMapping("/pay_order.do")
    public ModelAndView payOrder(Order order) {
        ModelAndView modelAndView = new ModelAndView();
        Paymentrecord paymentrecord = paymentService.queryPayment(order.getPaymentid());
        modelAndView.addObject("order", order);
        modelAndView.addObject("payment", paymentrecord);
        modelAndView.setViewName("payOrder.jsp"); //todo code payOrder.jsp
        return modelAndView;
    }

    @RequestMapping("/order_is_paid.do")
    public ModelAndView orderIsPaid(Order order) {
        ModelAndView modelAndView = new ModelAndView();
        orderService.orderIsPaid(order);
        Paymentrecord paymentrecord = paymentService.queryPayment(order.getPaymentid());
        modelAndView.addObject("order", order);
        modelAndView.addObject("payment", paymentrecord);
        modelAndView.setViewName("/WEB-INF/view/payment_success.jsp"); //todo code payment_success.jsp
        return modelAndView;
    }

    @RequestMapping("/cancel_order.do")
    public ModelAndView cancelOrder(Order order) {
        boolean result = orderService.cancelOrder(order);
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("order", order);
        if (result) {

            modelAndView.setViewName("/WEB-INF/view/cancel_order_success.jsp");
            //todo success-> cancel success page
        } else {
            modelAndView.setViewName("/WEB-INF/view/cancel_order_failed.jsp");
            //todo success-> cancel success page
        }
        return modelAndView;
    }

}
