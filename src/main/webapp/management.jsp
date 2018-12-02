<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%> 
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%-- <%@ taglib uri="http://java.sun.com/jstl/core" prefix="c" %> --%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Employee List</title>
<%	
	pageContext.setAttribute("APP_PATH",request.getContextPath());
%>

<script src="http://ajax.googleapis.com/ajax/libs/jquery/1.9.1/jquery.min.js">
</script>
<!-- <link rel="stylesheet" href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css"> -->
<link rel="stylesheet" href="static/bootstrap-3.3.7-dist/css/bootstrap.min.css">
<!-- <script src="https://cdn.bootcss.com/bootstrap/3.3.7/js/bootstrap.min.js"></script> -->
<script src="static/bootstrap-3.3.7-dist/js/bootstrap.min.js"></script>
</head>
<body>
	<div class="container">
		<!-- Title -->
		<div class="row">
			<div class="col-md-12">
				<h1>Airline-Management</h1>
			</div>
		</div>
		<!-- Button -->
		<div class="row">
			 <div class="col-md-4 col-md-offset-8">
			 	<button class="btn btn-primary" id="emp_add_modal_btn">Add new flight</button>
			 	<button class="btn btn-danger">Cancel Flight</button>
			 </div>
		</div>
		<!-- 表格 -->
		<div class="row">
			<div class="col-md-12">
				<table class="table table-hover" id="flight_body">
					<thead>
						<tr>
							
							<th>Flight Id</th>
							<th>Origin</th>
							<th>Destination</th>
							<th>Take off Time</th>
							<th>Arrive Time</th>
							<th>Plane</th>
							<th>Operation</th>
						</tr>
					</thead>
					<tbody>
						
					</tbody>
				</table>
			</div>
		</div>
		
	</div>
	
	
	
	<!-- 员工修改的模态框 -->
	<div class="modal fade" id="cancel_flight" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
	  <div class="modal-dialog" role="document">
	    <div class="modal-content">
	      <div class="modal-header">
	        <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
	        <h4 class="modal-title" id="myModalLabel">Cancel a flight</h4>
	      </div>
	      <div class="modal-body">
	        <form class="form-horizontal" id="cancel_flight_form">
			  <div class="form-group">
			    <label for="cancel_flight_id" class="col-sm-2 control-label">Flight</label>
			    <div class="col-sm-8">
			      <input type="text" name="flightid" class="form-control" id="cancel_flight_id" placeholder="flight id">
			     <span class="help-block"></span>
			    </div>
			  </div>
			  <div class="form-group">
			    <label for="cancel_date" class="col-sm-2 control-label">cancel date</label>
			    <div class="col-sm-8">
			      <input type="text" name="date" class="form-control" id="cancel_date" placeholder="Cancel date">
			     <span class="help-block"></span>
			    </div>
			  </div>
			  
			  <div class="form-group">
			    <label for="reason" class="col-sm-2 control-label">Reason</label>
			    <div class="col-sm-8">
			      <input type="text" name="description" class="form-control" id="reason" placeholder="reason">
			     <span class="help-block"></span>
			    </div>
			  </div>
			  
			</form>
	      </div>
	      <div class="modal-footer">
	        <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
	        <button type="button" class="btn btn-primary" id="flight_cancel_confirm_btn">Confirm</button>
	      </div>
	    </div>
	  </div>
	</div>
	
	<script type="text/javascript">
		var totalRecord;
	
	/* ================== 表格，分页信息查询部分 ================= */
	
		/* 1.页面加载完成之后 页面发送ajax请求，要到分页数据 */
		$.ajax({
				url:"${APP_PATH}/queryFlights.do",
				type:"POST",
				success:function(result){
					console.log(result);
					build_flight_table(result);
				}
				
			});
		
		
		function build_flight_table(result){
			$("#flight_body tbody").empty();
			var flights = result.data.results;
			$.each(flights, function(index,item){
				var Index = $("<td></td>").append(index);
				
				var Origin = $("<td></td>").append(item.oriCity.cityname);
				var Destination = $("<td></td>").append(item.dstCity.cityname);
				var TakeOffTime = $("<td></td>").append(item.takeofftime);
				var ArriveTime = $("<td></td>").append(item.arrivetime);
				var plane = $("<td></td>").append(item.plane.model);
				var editBtn = $("<button></button>")
				.addClass("btn btn-primary btn-sm edit_btn")
				.append($("<span></span>").addClass("glyphicon glyphicon-pencil"))
				.append("Update");
				
				var delBtn = $("<button></button>");
				delBtn.addClass("btn btn-danger btn-sm delete_btn")
				.append($("<span></span>").addClass("glyphicon glyphicon-trash"))
				.append("Cancel");  
				
				
				var btnTd=$("<td></td>").append(editBtn).append(" ").append(delBtn);
				
				$("<tr value=" + item.flightid + "></tr>")
				  .append(Index)
				  .append(Origin)
				  .append(Destination)
				  .append(TakeOffTime)
				  .append(ArriveTime)
				  .append(plane)
				  .append(btnTd)
				  .appendTo("#flight_body");
			});
		}
		
		function get_flight_data(){
			
		}
		
		
		function build_emps_table(result){
			
		}
		
		
		
		/* ================== 员工添加部分 ================= */
		
		//表单重置方法
		function form_reset(ele){
			//重置表单内容
			$(ele)[0].reset();
			//清空表单样式
			$(ele).find("*").removeClass("has-error has-success");
			$(ele).find(".help-block").text("");
		}
		
		
		/* 点击新增按钮就弹出模态框 */
		$("#emp_add_modal_btn").click(function(){
			$("#flight_cancel").modal({
				backdrop:"static"
			});
		});
		
		/* 查询出所有的部分信息,并显示在下拉里列表当中 */
		function getDepts(ele){
			
		}
		
		/* 绑定单击事件，点击以后将数据传给控制器| */
		$("#flight_cancel_confirm_btn").click(function(){
			$.ajax({
				url:"${APP_PATH}/cancelFlight.do",
				type:"POST",
				data:$("#cancel_flight_form").serialize(),
				success:function(result){
					
					
				}
			});
		});
		
		
		/* ================= 编辑按钮 =============================== */
		//为编辑按钮绑定点击事件
		$(document).on("click", ".delete_btn", function(){
			var flightId = $(this).parent().parent().attr("value");
			document.getElementById("cancel_flight_id").value = flightId;
			$("#cancel_flight").modal({
				backdrop:"static"
			});
		});
	</script>
</body>
</html>