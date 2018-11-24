<%--
  Created by IntelliJ IDEA.
  User: Arthur.Chen
  Date: 11/15/2018
  Time: 21:50
  To change this template use File | Settings | File Templates.
--%>
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
        .modal {
            color: black;
            font-size: medium;
        }
    </style>
</head>

<body>

<div class="super_container">

    <!-- Header -->

    <header class="header">

        <!-- Top Bar -->

        <div class="top_bar">
            <div class="container">
                <div class="row">
                    <div class="col d-flex flex-row">
                        <div class="social">
                            <ul class="social_list">
                                <li class="social_list_item"><a href="#"><i class="fa fa-pinterest"
                                                                            aria-hidden="true"></i></a></li>
                                <li class="social_list_item"><a href="#"><i class="fa fa-facebook"
                                                                            aria-hidden="true"></i></a></li>
                                <li class="social_list_item"><a href="#"><i class="fa fa-twitter"
                                                                            aria-hidden="true"></i></a></li>
                                <li class="social_list_item"><a href="#"><i class="fa fa-dribbble"
                                                                            aria-hidden="true"></i></a></li>
                                <li class="social_list_item"><a href="#"><i class="fa fa-behance"
                                                                            aria-hidden="true"></i></a></li>
                                <li class="social_list_item"><a href="#"><i class="fa fa-linkedin"
                                                                            aria-hidden="true"></i></a></li>
                            </ul>
                        </div>
                        <div class="user_box ml-auto">
                            <div class="user_box_login user_box_link nav_slider_link"><a href="#">login</a></div>
                            <div class="user_box_register user_box_link nav_slider_link"><a href="#">register</a></div>
                        </div>
                    </div>
                </div>
            </div>
        </div>

        <!-- Main Navigation -->

        <nav class="main_nav">
            <div class="container">
                <div class="row">
                    <div class="col main_nav_col d-flex flex-row align-items-center justify-content-start">
                        <div class="logo_container">
                            <div class="logo"><a href="#"><img src="static/images/logo.png" alt="">Agile Air</a></div>
                        </div>

                        <div class="hamburger">
                            <i class="fa fa-bars trans_200"></i>
                        </div>
                    </div>
                </div>
            </div>
        </nav>

    </header>

    <!-- Home -->

    <div class="home">
        <div class="home_background parallax-window" data-parallax="scroll"
             data-image-src="static/images/elements_background.jpg"></div>
        <div class="home_content">
            <div class="home_title">Review Order and Pay</div>
        </div>
    </div>
    <!-- Body -->

    <div class="body">
        <div class="container">
            <p>&nbsp;</p>
            <div class="row">
                <div class="col-md-12">
                    <div class="row">
                        <div class="col-md-4 order-md-2 mb-4">
                            <h4 class="d-flex justify-content-between align-items-center mb-3">
                                <span class="text-muted">Your Order</span>
                                <span class="badge badge-secondary badge-pill">2</span>
                            </h4>
                            <ul class="list-group mb-3">
                                <li class="list-group-item d-flex justify-content-between lh-condensed">
                                    <div>
                                        <h6 class="my-0">Limerick to Dublin</h6>
                                        <small class="text-muted">Multiple stops</small>
                                    </div>
                                    <span class="text-muted">&euro;12</span>
                                </li>
                                <li class="list-group-item d-flex justify-content-between lh-condensed">
                                    <div>
                                        <h6 class="my-0">Dublin to Limerick</h6>
                                        <small class="text-muted">Single stop</small>
                                    </div>
                                    <span class="text-muted">&euro;13</span>
                                </li>
                                <li class="list-group-item d-flex justify-content-between bg-light">
                                    <div class="text-success">
                                        <h6 class="my-0">Discount</h6>
                                        <small>FFLYER (5%)</small>
                                    </div>
                                    <span class="text-success">- &euro;1.25</span>
                                </li>
                                <li class="list-group-item d-flex justify-content-between">
                                    <strong class="text-dark">Total (EUR)</strong>
                                    <strong class="text-dark">&euro;23.75</strong>
                                </li>
                            </ul>
                        </div>
                        <div class="col-md-8 order-md-1">
                            <h4 class="mb-3">Personal Information</h4>
                            <form class="needs-validation" novalidate="">
                                <div class="row">
                                    <div class="col-md-6 mb-3">
                                        <label for="firstName">First name</label>
                                        <input type="text" class="form-control" id="firstName" readonly="readonly"
                                               placeholder="Customer" value="" required="">
                                        <div class="invalid-feedback">
                                            Valid first name is required.
                                        </div>
                                    </div>
                                    <div class="col-md-6 mb-3">
                                        <label for="lastName">Last name</label>
                                        <input type="text" class="form-control" id="lastName" placeholder="" readonly
                                               value="" placeholder="ABC" required="">
                                        <div class="invalid-feedback">
                                            Valid last name is required.
                                        </div>
                                    </div>
                                </div>
                                <div class="row">
                                    <div class="col-md-6 mb-3">
                                        <label for="email">Email</label>
                                        <input type="email" class="form-control" id="email" readonly
                                               placeholder="you@example.com">
                                        <div class="invalid-feedback">
                                            Please enter a valid email address for flight updates.
                                        </div>
                                    </div>

                                    <div class="col-md-6 mb-3">
                                        <label for="address2">Mobile Number</label>
                                        <input type="text" class="form-control" id="address2" readonly
                                               placeholder="+353 (899) 00000000">
                                    </div>
                                </div>
                                <div class="mb-3">
                                    <label for="address">Contact Address</label>
                                    <input type="text" class="form-control" id="address" readonly
                                           placeholder="1234 Main St" required="">
                                    <div class="invalid-feedback">
                                        Please enter your shipping address.
                                    </div>
                                </div>

                                <div class="row">
                                    <div class="col-md-5 mb-3">
                                        <label for="country">Country</label>
                                        <select class="custom-select d-block w-100" id="country" required="">
                                            <option value="">Choose...</option>
                                            <option>United States</option>
                                        </select>
                                        <div class="invalid-feedback">
                                            Please select a valid country.
                                        </div>
                                    </div>
                                    <div class="col-md-4 mb-3">
                                        <label for="state">State</label>
                                        <select class="custom-select d-block w-100" id="state" required="">
                                            <option value="">Choose...</option>
                                            <option>California</option>
                                        </select>
                                        <div class="invalid-feedback">
                                            Please provide a valid state.
                                        </div>
                                    </div>
                                    <div class="col-md-3 mb-3">
                                        <label for="zip">Zip</label>
                                        <input type="text" class="form-control" id="zip" placeholder="" required="">
                                        <div class="invalid-feedback">
                                            Zip code required.
                                        </div>
                                    </div>
                                </div>
                                <hr class="mb-4">

                                <h4 class="mb-3">Payment</h4>
                                <div class="row align-items-center mb-4">
                                    <div class="col-4 ">
                                        <div class="row justify-content-center">
                                            <div class="col-9">
                                                <div id="PayPal"></div>
                                            </div>
                                        </div>
                                    </div>
                                    <div class="col-4 ">
                                        <div class="row justify-content-center">
                                            <div class="col-8">
                                                <div id="Alipay"><a href="#"><img
                                                        style="width:126px; height: 54px; "
                                                        src="/static/images/alipay.png"
                                                        alt=""></a></div>
                                            </div>
                                        </div>

                                    </div>
                                    <div class="col-4 ">
                                        <div class="row justify-content-center">
                                            <div class="col-8">
                                                <div id="CurrencyFair"><a href="#"><img
                                                        style="width:126px; height: 54px; "
                                                        src="/static/images/currencyfair.png"
                                                        alt=""></a></div>
                                            </div>
                                        </div>

                                    </div>
                                </div>
                                <!-- modal for comformation -->
                                <div class="modal fade" id="conform_dialog">
                                    <div class="modal-dialog modal-lg  modal-dialog-centered ">
                                        <div class="modal-content">
                                            <div class="modal-header">
                                                <h3 class="modal-title">Review Order and Proceed to Pay</h3>
                                                <button type="button" class="close" data-dismiss="modal">&times;
                                                </button>
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
                                                                    <td><span id="recipient_name"></span></td>
                                                                </tr>
                                                                <tr>
                                                                    <td>Address :</td>
                                                                    <td><span id="line1"</span><span id="line2"></span>
                                                                    </td>
                                                                </tr>
                                                                <tr>
                                                                    <td>City :</td>
                                                                    <td><span id="city"></span></td>
                                                                </tr>
                                                                <tr>
                                                                    <td>State :</td>
                                                                    <td><span id="state_in_modal"></span></td>
                                                                </tr>
                                                                <tr>
                                                                    <td>Postal Code :</td>
                                                                    <td><span id="postal_code"></span></td>
                                                                </tr>
                                                                <tr>
                                                                    <td>Country Code :</td>
                                                                    <td><span id="country_code"></span></td>
                                                                </tr>
                                                                <tr>
                                                                    <td>Amount :</td>
                                                                    <td><span id="amount"></span></td>
                                                                </tr>
                                                                <tr>
                                                                    <td>Currency :</td>
                                                                    <td><span id="currency"></span></td>
                                                                </tr>
                                                                </tbody>
                                                            </table>
                                                        </div>
                                                    </div>
                                                </div>
                                                <div class="modal-footer">
                                                    <input type="button" style="margin-top:10px" id="payNowButton"
                                                           alt="Proceed to Checkout"
                                                           class="btn btn-primary btn-large" value="Pay Now"
                                                           name="checkout" data-dismiss="modal">
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </form>
                            <p>&nbsp;</p>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
    <!-- Copyright -->

    <div class="copyright">
        <div class="container">
            <div class="row">
                <div class="col-lg-9 order-lg-1 order-2  ">
                    <div class="copyright_content d-flex flex-row align-items-center">
                        <div><!-- Link back to Colorlib can't be removed. Template is licensed under CC BY 3.0. -->
                            Copyright &copy;<script>document.write(new Date().getFullYear());</script>
                            All rights reserved | This template is made with <i class="fa fa-heart-o"
                                                                                aria-hidden="true"></i> by <a
                                    href="https://colorlib.com" target="_blank">Colorlib</a>
                            <!-- Link back to Colorlib can't be removed. Template is licensed under CC BY 3.0. --></div>
                    </div>
                </div>
            </div>
        </div>
    </div>

</div>

<script src="static/js/jquery-3.2.1.min.js"></script>
<script src="static/styles/bootstrap4/popper.js"></script>
<script src="static/styles/bootstrap4/bootstrap.min.js"></script>
<script src="static/plugins/greensock/TweenMax.min.js"></script>
<script src="static/plugins/greensock/TimelineMax.min.js"></script>
<script src="static/plugins/scrollmagic/ScrollMagic.min.js"></script>
<script src="static/plugins/greensock/animation.gsap.min.js"></script>
<script src="static/plugins/greensock/ScrollToPlugin.min.js"></script>
<script src="static/plugins/progressbar/progressbar.min.js"></script>
<script src="static/plugins/jquery-circle-progress-1.2.2/circle-progress.js"></script>
<script src="static/plugins/parallax-js-master/parallax.min.js"></script>
<script src="static/js/elements_custom.js"></script>
<script src="http://www.paypalobjects.com/api/checkout.js"></script>
<script type="text/javascript">
    paypal.Button.render({

        env: 'sandbox', // Or 'production',

        commit: false, // Show a 'Pay Now' button

        payment: function () {

            // Set up the payment here
            // 1. call your server side method or api to intiate the paymnets
            var data = {
                "description": "test",
                "shipping": "0",
                "tax": "0",
                "shipping_discount": "0",
                "total": "10",
                "currency": "USD",
                "intent": "sale",
                "subtotal": "10",
                "name": "test_product",
                "price": "10",
                "quantity": "1",
                "handling_fee": "0",
                "insurance": "0",
                "customFlag": "false"
            }
            //return paypal.request.post('/api/create-payments')
            return paypal.request({
                method: 'post',
                url: '${APP_PATH}/pay.do?payment_type=paypal&step_of_payment=create_payment',
                json: data
            })
                .then(function (res) {
                    console.log(res)
                    console.log(res.id);
                    return res.id;
                });
        },

        onAuthorize: function (data, actions) {

            // Set up a url on your server to execute the payment
            var EXECUTE_URL = '${APP_PATH}/pay.do?payment_type=paypal&step_of_payment=execute_payment';
            var data = {
                paymentID: data.paymentID,
                payerID: data.payerID

            };

            return actions.payment.get().then(function (paymentDetails) {
                // show the confirmation popup dialog
                //show payment details
                console.log(paymentDetails);
                $("#recipient_name").text(paymentDetails.payer.payer_info.shipping_address.recipient_name)
                $("#line1").text(paymentDetails.payer.payer_info.shipping_address.line1)
                $("#line2").text(paymentDetails.payer.payer_info.shipping_address.line2)
                $("#city").text(paymentDetails.payer.payer_info.shipping_address.city)
                $("#state_in_modal").text(paymentDetails.payer.payer_info.shipping_address.state)
                $("#postal_code").text(paymentDetails.payer.payer_info.shipping_address.postal_code)
                $("#country_code").text(paymentDetails.payer.payer_info.shipping_address.country_code)
                $("#amount").text(paymentDetails.transactions[0].amount.total)
                $("#currency").text(paymentDetails.transactions[0].amount.currency)
                $("#conform_dialog").modal() //show modal

                // Click Listener
                document.querySelector('#payNowButton').addEventListener('click', function () {

                    return paypal.request({
                        method: 'post',
                        url: EXECUTE_URL,
                        json: data
                    }).then(function (res) {
                        console.log(res)
                        window.location.href = "${APP_PATH}/"
                    }).catch(function (err) {
                        alert(err);
                    });
                })
            });
        },
        onCancel: function (data, actions) {
            return actions.redirect();
        }


    }, '#PayPal');


</script>
</body>

</html>
