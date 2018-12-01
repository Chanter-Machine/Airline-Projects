<%--
  Created by IntelliJ IDEA.
  User: Arthur.Chen
  Date: 11/21/2018
  Time: 22:41
  To change this template use File | Settings | File Templates.
--%>
<%
    pageContext.setAttribute("APP_PATH", request.getContextPath());
%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <title>Agile Air</title>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="description" content="Agile Air Project">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" type="text/css" href="static/styles/bootstrap4/bootstrap.min.css">
    <link href="static/plugins/font-awesome-4.7.0/css/font-awesome.min.css" rel="stylesheet" type="text/css">
    <link rel="stylesheet" type="text/css" href="static/styles/elements_styles.css">
    <link rel="stylesheet" type="text/css" href="static/styles/elements_responsive.css">
    <style>
        .modal{
            color:black;
            font-size: medium;
        }
    </style>
</head>

<body>
<div class="container">
    <button type="button" class="btn btn-primary" data-toggle="modal" data-target="#conform_dialog">open modal</button>

    <div class="modal fade" id="conform_dialog">
        <div class="modal-dialog modal-lg  modal-dialog-centered ">
            <div class="modal-content">
                <div class="modal-header">
                    <h3 class="modal-title">Review Order and Proceed to Pay</h3>
                    <button type="button" class="close" data-dismiss="modal">&times;</button>
                </div>
                <div class="modal-body">

                    <div class="row justify-content-center">
                        <div class="col-8">
                            <div>

                                <div>Shipping Address</div>
                                <table class="table" style="margin-top:10px">
                                    <tbody>
                                    <tr>
                                        <td>Name :</td>
                                        <td><span id="recipient_name">buyer test</span></td>
                                    </tr>
                                    <tr>
                                        <td>Address :</td>
                                        <td><span id="line1">NO 1 Nan Jin Road</span><span id="line2"></span></td>
                                    </tr>
                                    <tr>
                                        <td>City :</td>
                                        <td><span id="city">Shanghai</span></td>
                                    </tr>
                                    <tr>
                                        <td>State :</td>
                                        <td><span id="state">Shanghai</span></td>
                                    </tr>
                                    <tr>
                                        <td>Postal Code :</td>
                                        <td><span id="postal_code">200000</span></td>
                                    </tr>
                                    <tr>
                                        <td>Country Code :</td>
                                        <td><span id="country_code">C2</span></td>
                                    </tr>
                                    <tr>
                                        <td>Amount :</td>
                                        <td><span id="amount">17.00</span></td>
                                    </tr>
                                    <tr>
                                        <td>Currency :</td>
                                        <td><span id="currency">USD</span></td>
                                    </tr>
                                    </tbody>
                                </table>
                            </div>
                        </div>
                    </div>
                    <div class="modal-footer">
                        <input style="margin-top:10px" type="button" id="payNowButton" alt="Proceed to Checkout"
                               class="btn btn-primary btn-large" value="Pay Now" name="checkout" data-dismiss="modal">
                    </div>
                </div>
            </div>
        </div>
    </div>
    <script src="static/js/jquery-3.2.1.min.js"></script>
    <script src="static/styles/bootstrap4/popper.js"></script>
    <script src="static/styles/bootstrap4/bootstrap.min.js"></script>
</body>
</html>
