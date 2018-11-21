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

                                <div class="d-block my-3">
                                    <div class="custom-control custom-radio">
                                        <label class="custom-control-label" for="credit"><input id="credit"
                                                                                                name="paymentMethod"
                                                                                                type="radio" checked=""
                                                                                                required="">
                                            <i class="fa fa-cc-mastercard fa-3x text-danger"></i> Master Card</label>
                                    </div>
                                    <div class="custom-control custom-radio">
                                        <label class="custom-control-label" for="debit"><input id="debit"
                                                                                               name="paymentMethod"
                                                                                               type="radio" required="">
                                            <i class="fa fa-cc-visa fa-3x text-primary"></i> Visa</label>
                                    </div>
                                    <div class="custom-control custom-radio">
                                        <label class="custom-control-label" for="paypal"><input id="paypal"
                                                                                                name="paymentMethod"
                                                                                                type="radio"
                                                                                                required="">
                                            <i class="fa fa-paypal fa-3x text-dark"></i> PayPal</label>
                                    </div>
                                </div>
                                <div class="row" id="creditcard-info1">
                                    <div class="col-md-6 mb-3">
                                        <label for="cc-name">Name on card</label>
                                        <input type="text" class="form-control" id="cc-name" placeholder="" required="">
                                        <small class="text-muted">Full name as displayed on card</small>
                                        <div class="invalid-feedback">
                                            Name on card is required
                                        </div>
                                    </div>
                                    <div class="col-md-6 mb-3">
                                        <label for="cc-number">Credit card number</label>
                                        <input type="text" class="form-control" id="cc-number" placeholder=""
                                               required="">
                                        <div class="invalid-feedback">
                                            Credit card number is required
                                        </div>
                                    </div>
                                </div>
                                <div class="row" id="creditcard-info2">
                                    <div class="col-md-3 mb-3">
                                        <label for="cc-expiration">Expiration</label>
                                        <input type="text" class="form-control" id="cc-expiration" placeholder=""
                                               required="">
                                        <div class="invalid-feedback">
                                            Expiration date required
                                        </div>
                                    </div>
                                    <div class="col-md-3 mb-3">
                                        <label for="cc-cvv">CVV</label>
                                        <input type="text" class="form-control" id="cc-cvv" placeholder="" required="">
                                        <div class="invalid-feedback">
                                            Security code required
                                        </div>
                                    </div>
                                </div>
                                <div class="row" id="jump-to-third-party-platform">
                                </div>
                                <hr class="mb-4">
                                <button class="btn btn-agile btn-lg btn-block" type="submit">Continue to checkout
                                </button>
                            </form>
                            <form action="https://www.paypal.com/cgi-bin/webscr" method="post" target="_top">
                                <input type="hidden" name="cmd" value="_s-xclick">
                                <input type="hidden" name="hosted_button_id" value="5A3NE3YMZB5WE">
                                <input type="image"
                                       src="https://www.paypalobjects.com/en_US/C2/i/btn/btn_buynowCC_LG.gif" border="0"
                                       name="submit" alt="PayPal - The safer, easier way to pay online!">
                                <img alt="" border="0" src="https://www.paypalobjects.com/en_US/i/scr/pixel.gif"
                                     width="1" height="1">
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
<script>
    $('.d-block.my-3').on("click", "label", function () {


    })

    // $("#paypal").click(function () {
    //     var divRow = $("#paypal").parent().parent().parent();
    //     var nextAll = divRow.nextAll(".row");
    //     nextAll.hide();
    //     console.log(nextAll);
    //     nextAll.each(function (index, element) {
    //         var hidden = $(this).is(":hidden");
    //         console.log(hidden);
    //     })
    //
    //
    // });

</script>

</body>

</html>
