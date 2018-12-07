<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    pageContext.setAttribute("APP_PATH",request.getContextPath());
%>
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
                                <li class="social_list_item"><a href="#"><i class="fa fa-pinterest" aria-hidden="true"></i></a></li>
                                <li class="social_list_item"><a href="#"><i class="fa fa-facebook" aria-hidden="true"></i></a></li>
                                <li class="social_list_item"><a href="#"><i class="fa fa-twitter" aria-hidden="true"></i></a></li>
                                <li class="social_list_item"><a href="#"><i class="fa fa-dribbble" aria-hidden="true"></i></a></li>
                                <li class="social_list_item"><a href="#"><i class="fa fa-behance" aria-hidden="true"></i></a></li>
                                <li class="social_list_item"><a href="#"><i class="fa fa-linkedin" aria-hidden="true"></i></a></li>
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
        <div class="home_background parallax-window" data-parallax="scroll" data-image-src="static/images/elements_background.jpg"></div>
        <div class="home_content">
            <div class="home_title">Account Registration</div>
        </div>
    </div>
    <!-- Body -->

    <div class="body">
        <div class="container">
            <div class="text-center">
                <p>&nbsp;</p>
                <p style="font-size:20px;color:#5C5C5C;">${result.msg}</p>
                <div class="contact_form_container" style="opacity:0.8; width: 500px; height: 450px; margin:0 auto;">
                    <div>
                        <div class="contact_title">activate my account</div>
                        <p style="font-size:10pt; color: #fff;">Use the form below to activate your account</p>
                        <form action="${APP_PATH}/validate.do" method="POST" id="contact_form" class="contact_form">
                            <input style="text-align: center; font-size: 20pt;" type="number" name="code" id="code" class="contact_form_subject input_field" placeholder="Activation Code" required="required" maxlength="4" data-error="Code is required.">
                            <button type="button" id="form_submit_button" class="form_submit_button button">Submit<span></span><span></span><span></span></button>
                        </form>
                    </div>
                </div>
                <p>&nbsp;</p>
                <p>&nbsp;</p>
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
                            Copyright &copy;<script>document.write(new Date().getFullYear());</script> All rights reserved | This template is made with <i class="fa fa-heart-o" aria-hidden="true"></i> by <a href="https://colorlib.com" target="_blank">Colorlib</a>
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
    console.log('Code: ${result.code}');

    $('#form_submit_button').click(function(){
        $.ajax({
            url:"${APP_PATH}/validate.do?code="+$('#code').val(),
            type:"GET",
            dataType: "json",
            contentType: 'application/json',
            mimeType: 'application/json',
            success:function(data, textStatus, jQxhr){
                if(data.successful){
                    alert("Your account has now been activated! You will be redirected to begin your flight search.");
                    location.href="${APP_PATH}/loggedOn.do";
                }
                else{
                    alert("Validation failed: "+data.msg+".\nPlease check your code and try again!");
                }
            },
            fail:function(){
                alert("Unable to proceed!");
            }
        });
    });
</script>
</body>

</html>
