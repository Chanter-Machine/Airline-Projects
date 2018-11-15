<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
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
<script src="static/js/jquery-3.2.1.min.js"></script>
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
			<div class="home_title">search result</div>
		</div>
	</div>
	<!-- Body -->
	
	<div class="body">
	    <div class="container">
           <p>&nbsp;</p>
           <div class="row">
           <div class="col-md-12">
               <div class="card">
  <div class="card-body">
   <table>
       <tr><td valign="baseline">
    <select class="custom-control custom-select custom-select-lg">
        <option>Show me based on lowest cost</option>
        <option>Show me based on shortest flight duration</option>
        <option>Show me based on shortest wait time</option>
    </select></td><td><button class="btn btn-agile">Suggest Flights</button></td></tr>
   </table>
  </div>
</div>
               <p>&nbsp;</p>
            <!-- Accordions -->
								<div class="elements_accordions" data-multitabs="true">

									<div class="accordion_container">
										<div class="accordion accordion-lg d-flex flex-row align-items-center active">
                                            <div class="col-md-5">
                                                <h3 class="my-0">Limerick to Dublin</h3>
                                                <small class="text-muted">Multiple stops [click to see breakdown]</small>
                                              </div>
                                              <div class="col-md-2">
                                                  <span class="h3 text-muted text-success">4hrs 30mins</span>
                                              </div>
                                              <div class="col-md-2">
                                                  <span class="text-muted pull-right h3">&euro;12</span>
                                              </div>
                                              <div class="col-md-2">
                                                  <a href="reviewPay.html" class="btn btn-warning">Choose Flight</a>
                                              </div>
                                        </div>
										<div class="accordion_panel">
                                            <div class="table-responsive">
                                            <table class="table table-striped table-sm">
                                              <thead>
                                                <tr>
                                                  <th></th>
                                                  <th>Depart From</th>
                                                  <th>Arrive At</th>
                                                  <th>Flight Time</th>
                                                  <th>Waiting Time</th>
                                                </tr>
                                              </thead>
                                              <tbody>
                                                <tr>
                                                  <td><i class="fa fa-plane"></i></td>
                                                  <td>Limerkick</td>
                                                  <td>Cork</td>
                                                  <td>11:00 - 12:30</td>
                                                  <td>--</td>
                                                </tr>
                                                <tr>
                                                  <td><i class="fa fa-plane"></i></td>
                                                  <td>Cork</td>
                                                  <td>Galway</td>
                                                  <td>13:30 - 14:00</td>
                                                  <td>1 hr</td>
                                                </tr>
                                                <tr>
                                                  <td><i class="fa fa-plane"></i></td>
                                                  <td>Galway</td>
                                                  <td>Dublin</td>
                                                  <td>14:30 - 15:30</td>
                                                  <td>30 mins</td>
                                                </tr>
                                              </tbody>
                                            </table>
                                          </div>
										</div>
									</div>

									<div class="accordion_container">
										<div class="accordion accordion-lg d-flex flex-row align-items-center"><div>Dublin to Galway (October 10, 2018)</div></div>
										<div class="accordion_panel">
                                            <div class="table-responsive">
                                            <table class="table table-striped table-sm">
                                              <thead>
                                                <tr>
                                                  <th>#</th>
                                                  <th>Header</th>
                                                  <th>Header</th>
                                                  <th>Header</th>
                                                  <th>Header</th>
                                                </tr>
                                              </thead>
                                              <tbody>
                                                <tr>
                                                  <td>1,001</td>
                                                  <td>Lorem</td>
                                                  <td>ipsum</td>
                                                  <td>dolor</td>
                                                  <td>sit</td>
                                                </tr>
                                                <tr>
                                                  <td>1,002</td>
                                                  <td>amet</td>
                                                  <td>consectetur</td>
                                                  <td>adipiscing</td>
                                                  <td>elit</td>
                                                </tr>
                                              </tbody>
                                            </table>
                                          </div>
										</div>
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
Copyright &copy;<script>document.write(new Date().getFullYear());</script> All rights reserved | This template is made with <i class="fa fa-heart-o" aria-hidden="true"></i> by <a href="https://colorlib.com" target="_blank">Colorlib</a>
<!-- Link back to Colorlib can't be removed. Template is licensed under CC BY 3.0. --></div>
					</div>
				</div>
			</div>
		</div>
	</div>

</div>

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
</body>
</html>