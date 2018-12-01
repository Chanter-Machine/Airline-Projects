<%@ page import="com.airline.bean.Passenger" %>
<%@ page import="com.airline.bean.Paymentrecord" %>
<%--
  Created by IntelliJ IDEA.
  User: Arthur.Chen
  Date: 11/29/2018
  Time: 23:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Test</title>
</head>
<body>

<%
    Passenger passenger = new Passenger();
    passenger.setPassengerid(1);
    passenger.setUserid(123);
    passenger.setAddress("sdfsdfs");
    passenger.setAge(13);
    passenger.setPassengername("test passenger");
    passenger.setPhone("4358789546");
    session.setAttribute("passenger", passenger);

    Paymentrecord payment = new Paymentrecord();
    payment.setAmount(String.valueOf(1231));
    session.setAttribute("payment", payment);

%>
<a href="/create_order.do">create_order</a>
<script href="static/js/jquery-3.2.1.min.js"></script>
<script>
</script>
</body>
</html>
