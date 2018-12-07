<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%-- <jsp:forward page="/WEB-INF/view/list.jsp"></jsp:forward> --%>
<%	
	pageContext.setAttribute("APP_PATH",request.getContextPath());
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
    <script src="http://ajax.googleapis.com/ajax/libs/jquery/1.9.1/jquery.min.js">
    </script>
    <title>Agile Air</title>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="description" content="Agile Air Project">
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <link rel="stylesheet" type="text/css" href="static/styles/bootstrap4/bootstrap.min.css">
    <link href="static/plugins/font-awesome-4.7.0/css/font-awesome.min.css" rel="stylesheet" type="text/css">
    <link rel="stylesheet" type="text/css" href="static/styles/elements_styles.css">
    <link rel="stylesheet" type="text/css" href="static/styles/elements_responsive.css">
    <!-- <link rel="stylesheet" type="text/css" href="static/styles/bootstrap.min.css" media="screen"> -->
    <link rel="stylesheet" type="text/css" href="static/styles/bootstrap-datetimepicker.min.css" media="screen">
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
                <div class="home_title">welcome!</div>
            </div>
        </div>
        <!-- Body -->

        <div class="body">
            <div class="container">
                <p>&nbsp;</p>
                <div class="row">
                    <div class="col-md-6">
                        <div class="search">
                        
                            <!-- Search Contents -->
                            <div class="container fill_height">
                                <div class="row fill_height">
                                    <div class="col fill_height">
                                    
                                        <!-- Search Tabs -->
                                        <div class="search_tabs_container">
                                            <div class="search_tabs d-flex flex-lg-row flex-column align-items-lg-center align-items-start justify-content-lg-between justify-content-start">
                                                <div class="search_tab d-flex flex-row align-items-center justify-content-lg-center justify-content-start">
                                                    <h4><i class="fa fa-plane" aria-hidden="true"></i>&nbsp;Search flights</h4>
                                                </div>
                                            </div>
                                        </div>

                                        <!-- Search Panel -->
                                        <hr size=1 />
                                        <p>Please provide details of your flight and let us find the best options for you.</p>
                                        <div class="search_panel">
                                            <form id="search_form_1" class="form-group">
                                                <div class="search_item">
                                                    <div class="btn-group btn-group-toggle" data-toggle="buttons">
                                                        <label class="btn btn-agile active">
                                                            <input type="radio" name="options" id="option1" autocomplete="off" value="one-way" checked> <i class="fa fa-long-arrow-right"></i>&nbsp;One Way Ticket
                                                        </label>
                                                        <label class="btn btn-agile">
                                                            <input type="radio" name="options" id="option2" autocomplete="off" value="return"> <i class="fa fa-exchange"></i>&nbsp;Return Ticket
                                                        </label>
                                                    </div>
                                                    <br />&nbsp;
                                                </div>

                                                <div class="search_item">
                                                    <div><i class="fa fa-map-marker"></i> Origin</div>
                                                    <!--								<input type="text" class="form-control" required="required">-->

                                                    <select name="origin" id="origin_city" class="form-control custom-select custom-select-lg mb-3">
                                                        <option>Limerick</option>
                                                        <option>Dublin</option>
                                                        <option>Galway</option>
                                                    </select>
                                                </div>
                                                <div class="search_item">
                                                    <div><i class="fa fa-map-marker"></i> Destination</div>

                                                    <select name="destination" id="destination_city" class="form-control custom-select custom-select-lg mb-3">
                                                        <option>Limerick</option>
                                                        <option>Dublin</option>
                                                        <option>Galway</option>
                                                    </select>
                                                    <!--								<input type="text" class="form-control" required="required">-->
                                                </div>
                                                <div class="search_item">
                                                    <div><i class="fa fa-calendar"></i> Travel Date</div>
                                                    <input name="traveldate" class="travel_date form-control contact_form_name date form_date" size="16" type="text" value="" placeholder="yyyy/mm/dd">
                                                </div>
                                                <div class="search_item">
                                                    <div>Seat Preference</div>
                                                    <select name="seat" id="seat_preference" class="form-control custom-select custom-select-lg mb-3">
                                                        <option value="economy">Economy Class</option>
                                                        <option value="business">Business Class</option>
                                                        <option value="first">First Class</option>
                                                    </select>
                                                </div>
                                                <div class="search_item">
                                                    <div>Seat Preference</div>
	                                                <select name="sorting" class="form-control custom-select custom-select-lg mb-3">
		                                                <option value="1">Show me based on lowest cost</option>
		                                                <option value="2">Show me based on shortest flight duration</option>
		                                                <option value="3">Show me based on shortest wait time</option>
	                                           		</select>
	                                           	</div>
                                                <p>&nbsp;</p>
                                                
                                                <button id="btn_submit" type="button" class="search_btn button button_color_1 trans_200">search<span></span><span></span><span></span></a></button>
                                            </form>

                                        </div>

                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="col-md-1"></div>
                    <div class="col-md-5">
                        <h4><svg xmlns="http://www.w3.org/2000/svg" width="24" height="24" viewBox="0 0 24 24" fill="none" stroke="currentColor" stroke-width="2" stroke-linecap="round" stroke-linejoin="round" class="feather feather-file-text">
                                <path d="M14 2H6a2 2 0 0 0-2 2v16a2 2 0 0 0 2 2h12a2 2 0 0 0 2-2V8z"></path>
                                <polyline points="14 2 14 8 20 8"></polyline>
                                <line x1="16" y1="13" x2="8" y2="13"></line>
                                <line x1="16" y1="17" x2="8" y2="17"></line>
                                <polyline points="10 9 9 9 8 9"></polyline>
                            </svg>&nbsp;My Previous Bookings</h4>
                        <p>&nbsp;</p>
                        <!-- Accordions -->
                        <div class="elements_accordions">

                            <div class="accordion_container">
                                <div class="accordion d-flex flex-row align-items-center active">
                                    <div>Trip: Limerick to Dublin (October 20, 2018) </div>
                                </div>
                                <div class="accordion_panel">
                                    <p>Your itenary for this trip:</p>
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
                                                <tr>
                                                    <td>1,003</td>
                                                    <td>Integer</td>
                                                    <td>nec</td>
                                                    <td>odio</td>
                                                    <td>Praesent</td>
                                                </tr>
                                                <tr>
                                                    <td>1,003</td>
                                                    <td>libero</td>
                                                    <td>Sed</td>
                                                    <td>cursus</td>
                                                    <td>ante</td>
                                                </tr>
                                            </tbody>
                                        </table>
                                    </div>
                                </div>
                            </div>
                            <div class="accordion_container">
                                <div class="accordion d-flex flex-row align-items-center">
                                    <div>Dublin to Galway (October 10, 2018)</div>
                                </div>
                                <div class="accordion_panel">
                                    <p>Your itenary for this trip:</p>
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

                            <div class="accordion_container">
                                <div class="accordion d-flex flex-row align-items-center">
                                    <div>Other Information</div>
                                </div>
                                <div class="accordion_panel">
                                    <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nullam eu convallis tortor. Suspendisse potenti. In faucibus massa arcu, vitae cursus mi hendrerit nec. Proin bibendum, augue faucibus.</p>
                                </div>
                            </div>

                        </div>
                    </div>
                </div>
                <div class="row">
                    <div class="col-md-12 result-flight">

                    </div>
                </div>
            </div>
        </div>


        <!-- result body-->

        <div class="body">
            <div class="container">
                <div class="row">
                    <div class="col-md-12 result-flight">
<!-- ====================== result ==================================-->

                        <!-- Accordions -->

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
                            <div>
                                <!-- Link back to Colorlib can't be removed. Template is licensed under CC BY 3.0. -->
                                Copyright &copy;<script>
                                    document.write(new Date().getFullYear());
                                </script> All rights reserved | This template is made with <i class="fa fa-heart-o" aria-hidden="true"></i> by <a href="https://colorlib.com" target="_blank">Colorlib</a>
                                <!-- Link back to Colorlib can't be removed. Template is licensed under CC BY 3.0. -->
                            </div>
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
    <script src="static/js/bootstrap-datetimepicker.min.js" charset="UTF-8"></script>
    <script>
        // After page finish loading, query available city
        $(function() {
            getCities("#origin_city");
            getCities("#destination_city");
        });

        //query cities
        function getCities(ele) {
            $(ele).empty();
            $.ajax({
                url: "${APP_PATH}/getCities.do",
                type: "GET",
                success: function(result) {
                    /* console.log(result); */
                    $.each(result.data.cities, function() {
                        var optionEle = $("<option></option>").attr("value", this.cityid).append(this.cityname);
                        optionEle.appendTo(ele);
                    })
                }
            });
        }



        $('.form_date').datetimepicker({
            weekStart: 1,
            todayBtn: 1,
            autoclose: 1,
            todayHighlight: 1,
            startView: 2,
            minView: 2,
            forceParse: 0,
            format: 'yyyy/mm/dd'
        });


        $("#btn_submit").click(function() {

            $.ajax({
                url: "${APP_PATH}/search2.do",
                type: "POST",
                data: $("#search_form_1").serialize(),
                success: function(result) {
                	console.log(result);
                	build_result_body(result);
                }
            });
            /* alert($("#add_emp_form").serialize()); */
        });
        
        function timeConverter(UNIX_timestamp) {
        	  var a = new Date(UNIX_timestamp * 1000);
        	  //var months = ['Jan','Feb','Mar','Apr','May','Jun','Jul','Aug','Sep','Oct','Nov','Dec'];
        	  //var year = a.getFullYear();
        	  //var month = months[a.getMonth()];
        	  //var date = a.getDate();
        	  var hour = a.getHours();
        	  var min = a.getMinutes();
        	  //var sec = a.getSeconds();
        	  var time = hour + ':' + min;
        	  return time;
        }
        
        function build_result_body(result){  
        	var data = result.data;
        	var insuranceList=data.insuranceList;
        	var pathList=data.pathList;
        	var priceList=data.priceList;
        	var taxList=data.taxList;
        	var num_paths = insuranceList.length;
        	
        	$(".result-flight").html("");
        	
        	var from = $("#origin_city").find("option:selected").text();;
        	var to = $("#destination_city").find("option:selected").text();;
        	
        	$result_body = $("<div id='result_body' class='elements_accordions' data-multitabs='true'></div>");
        	
        	for (var i = 0; i<num_paths; i++){
   
        		$accordion = $("<div class='accordion_container col-md-8 order-md-1'></div>");
        		$accordion_parrent = $("<div class='accordion accordion-lg d-flex flex-row align-items-center'></div>")
        		$city = $("<div class='col-md-5'><h3 class='my-0'>" + from + " to " + to +"</h3><small class='text-muted'>Multiple stops [click to see breakdown]</small></div>");
        		$money = $("<div class='col-md-2'><span class='text-muted pull-right h3'>&euro;" + priceList[i] + "</span></div><div class='col-md-2'><a class='btn btn-warning choose_flight'>Choose Flight</a></div>")
        		
        		$accordion_parrent.append($city);
        		$accordion_parrent.append($money);
        		$accordion.append($accordion_parrent);
        		
        		$parentDiv = $("<table class='table table-striped table-sm'></table>");
            	$thead = $("<thead><tr><th></th><th>Depart From</th><th>Arrive At</th><th>Flight Time</th><th>Waiting Time</th><tr></thead>")
            	$tbody = $("<tbody></tbody>");
            	$parentDiv.append($thead);
            	
        		var pathLength = pathList[i].length;
        		
        		for(var j = 0; j < pathLength; j++) {
        			var path = pathList[i][j];
        			var fromCity = path.oriCity.cityname;
        			var toCity = path.dstCity.cityname;
        			var fromTime = timeConverter(path.takeofftime);
        			var toTime = timeConverter(path.arrivetime);
        			var flightId = path.flightid;
        			$td = $("<tr value="+ flightId +"><td><i class='fa fa-plane'></i></td>" +
	        					 "<td>" + fromCity + "</td>" + 
	        					 "<td>" + toCity + "</td>" + 
	        					 "<td>" + fromTime + "-" + toTime + "</td>" +
	        					 "<td>--</td></tr>");
        			$tbody.append($td);
        		}
        		
        		$parentDiv.append($tbody);
        		$accordion_panel = $("<div class='accordion_panel'><div class='table-responsive flight-table'></div></div>")
        		$accordion_panel.append($parentDiv);
        		
        		$accordion.append($accordion_panel)
        		$result_body.append($accordion);
        	}
        	$(".result-flight").append($result_body);
        }
    </script>

</body>

</html>