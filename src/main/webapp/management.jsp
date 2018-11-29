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
				<table class="table table-hover" id="emp_body">
					<thead>
						<tr>
							<th>#</th>
							<th>Flight Id</th>
							<th>Origin</th>
							<th>Destination</th>
							<th>Plane</th>
							<th>操作</th>
						</tr>
					</thead>
					<tbody>
						
					</tbody>
				</table>
			</div>
		</div>
		<!-- 分页信息 -->
		<div class="row">
			<!-- 分页文字信息 -->
			<div class="col-md-6" id="page_info_area">
			</div>
			<!--分页条信息 -->
			<div class="col-md-6">
				<nav aria-label="Page navigation" id="page_info_nav">
				  
				</nav>
			</div>
		</div>
	</div>
	
	<!-- 点击"新增"之后出现的模态框 -->
	<div class="modal fade" id="empAdd" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
	  <div class="modal-dialog" role="document">
	    <div class="modal-content">
	      <div class="modal-header">
	        <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
	        <h4 class="modal-title" id="myModalLabel">添加一个新员工</h4>
	      </div>
	      <div class="modal-body">
	        <form class="form-horizontal" id="add_emp_form">
			  <div class="form-group">
			    <label for="emp_name_add_input" class="col-sm-2 control-label">Name</label>
			    <div class="col-sm-8">
			      <input type="text" name="empName" class="form-control" id="emp_name_add_input" placeholder="Name">
			     <span class="help-block"></span>
			    </div>
			  </div>
			  <div class="form-group">
			    <label for="emp_emall_add_input" class="col-sm-2 control-label">Email</label>
			    <div class="col-sm-8">
			      <input type="text" name="address" class="form-control" id="emp_email_add_input" placeholder="Email">
			     <span class="help-block"></span>
			    </div>
			  </div>
			  <div class="form-group">
			    <label for="emp_gender_add_input" class="col-sm-2 control-label">Gender</label>
			    <div class="col-sm-10">
			      <label class="radio-inline">
				    <input type="radio" name="gender" id="gender1_add_input" value="M" checked="checked"> M
				  </label>
			      <label class="radio-inline">
				    <input type="radio" name="gender" id="gender2_add_input" value="F"> F
				  </label>
			    </div>
			  </div>
			  <div class="form-group">
			    <label for="emp_dept_add_input" class="col-sm-2 control-label">Department</label>
			    <div class="col-sm-4">
			    	<!-- 部分id需要查询的出来 -->
			     	<select class="form-control" name="dId" id="dept_add_select">
					  
					</select>
			    </div>
			  </div>
			  
			</form>
	      </div>
	      <div class="modal-footer">
	        <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
	        <button type="button" class="btn btn-primary" id="emp_save_btn">Save changes</button>
	      </div>
	    </div>
	  </div>
	</div>
	
	<!-- 员工修改的模态框 -->
	<!-- 点击"修改"之后出现的模态框 -->
	<div class="modal fade" id="empEdit" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
	  <div class="modal-dialog" role="document">
	    <div class="modal-content">
	      <div class="modal-header">
	        <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
	        <h4 class="modal-title" id="myModalLabel">添加一个新员工</h4>
	      </div>
	      <div class="modal-body">
	        <form class="form-horizontal" id="add_emp_form">
			  <div class="form-group">
			    <label for="emp_name_add_input" class="col-sm-2 control-label">Name</label>
			    <div class="col-sm-8">
			      <input type="text" name="empName" class="form-control" id="emp_name_update_input" placeholder="Name">
			     <span class="help-block"></span>
			    </div>
			  </div>
			  <div class="form-group">
			    <label for="emp_emall_add_input" class="col-sm-2 control-label">Email</label>
			    <div class="col-sm-8">
			      <input type="text" name="address" class="form-control" id="emp_email_update_input" placeholder="Email">
			     <span class="help-block"></span>
			    </div>
			  </div>
			  <div class="form-group">
			    <label for="emp_gender_add_input" class="col-sm-2 control-label">Gender</label>
			    <div class="col-sm-10">
			      <label class="radio-inline">
				    <input type="radio" name="gender" id="gender1_update_input" value="M" checked="checked"> M
				  </label>
			      <label class="radio-inline">
				    <input type="radio" name="gender" id="gender2_update_input" value="F"> F
				  </label>
			    </div>
			  </div>
			  <div class="form-group">
			    <label for="emp_dept_add_input" class="col-sm-2 control-label">Department</label>
			    <div class="col-sm-4">
			    	<!-- 部分id需要查询的出来 -->
			     	<select class="form-control" name="dId" id="dept_update_select">
					  
					</select>
			    </div>
			  </div>
			  
			</form>
	      </div>
	      <div class="modal-footer">
	        <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
	        <button type="button" class="btn btn-primary" id="emp_save_btn">Update</button>
	      </div>
	    </div>
	  </div>
	</div>
	
	<script type="text/javascript">
		var totalRecord;
	
	/* ================== 表格，分页信息查询部分 ================= */
	
		/* 1.页面加载完成之后 页面发送ajax请求，要到分页数据 */
		$(function(){
				/* 已经来就直接进入分页的首页 */
				to_page(1);
				getDepts("#dept_add_select");
			}		
		);
		
		function to_page(pageNum){
			$.ajax({
				url:"${APP_PATH}/emps.do",
				data:"pageNum=" + pageNum,
				type:"GET",
				success:function(result){
					/* console.log(result); */
					/* 1.再页面解析json并显示员工数据 */
					build_emps_table(result); 
					/* 2.解析并显示分页信息 */
					build_page_info(result);
					/* 3.解析显示分页条数据 */
					build_page_nav(result);
				}
				
			});
		}
		
		function build_emps_table(result){
			/* 每次再拿到数据之前都需要先清空数据 */
			$("#emp_body tbody").empty();
			var emps = result.data.pageInfo.list;
			$.each(emps, function(index,item){
				/* alert(item.empName); */
				var empIdTd = $("<td></td>").append(item.empId);
				var empNameTd = $("<td></td>").append(item.empName);
				var empNameTd = $("<td></td>").append(item.empName);
				var genderTd = $("<td></td>").append(item.gender=='M'?"Male":"Female");
				var empAddressTd = $("<td></td>").append(item.address);
				var DeptNameTd = $("<td></td>").append(item.department.deptName);
				var editBtn = $("<button></button>")
				.addClass("btn btn-primary btn-sm edit_btn")
				.append($("<span></span>").addClass("glyphicon glyphicon-pencil"))
				.append("编辑");
				var delBtn = $("<button></button>")
				.addClass("btn btn-danger btn-sm delete_btn")
				.append($("<span></span>").addClass("glyphicon glyphicon-trash"))
				.append("删除");
				var btnTd=$("<td></td>").append(editBtn).append(" ").append(delBtn);
				/* append方法执行完以后还是会返回原来的元素 */
				$("<tr></tr>").append(empIdTd)
							  .append(empNameTd)
							  .append(genderTd)
							  .append(empAddressTd)
							  .append(DeptNameTd)
							  .append(btnTd)
							  .appendTo("#emp_body tbody");
				
			});
		}
		/* 表格左边的是分页信息 */
		function build_page_info(result){
			/* 每次再拿到数据之前都需要先清空数据 */
			$("#page_info_area").empty();
			/* 获取数据 */
			$("#page_info_area").append("当前"+result.data.pageInfo.pageNum+"页, 总"
					+result.data.pageInfo.pages+"页,总"
					+result.data.pageInfo.total+"条记录");
			
			totalRecord = result.data.pageInfo.total; 
		}
		/* 表格右边的是分页条 */
		function build_page_nav(result){
			/* 每次再拿到数据之前都需要先清空数据 */
			$("#page_info_nav").empty();
			/* 获取数据 */
			/* page_info_nav */
			var ul = $("<ul></ul>").addClass("pagination");
			
			/* 构建元素 */
			var firstPageLi = $("<li></li>").append($("<a></a>").append("首页").attr("href","#"));
			var prePageLi = $("<li></li>").append($("<a></a>").append("&laquo;").attr("href","#"));
			/* 如果当前页没有前一页，则首页与前一页按钮将不可用 */
			if(result.data.pageInfo.hasPreviousPage == false){
				prePageLi.addClass("disabled");
				firstPageLi.addClass("disabled");
			}
			else{
				//为元素添加点击分页事件
				firstPageLi.click(function(){
					to_page(1);
				});
				prePageLi.click(function(){
					to_page(result.data.pageInfo.pageNum-1);
				});
			}
			var nextPageLi = $("<li></li>").append($("<a></a>").append("&raquo;").attr("href","#"));
			var lastPageLi = $("<li></li>").append($("<a></a>").append("末页").attr("href","#"));
			if(result.data.pageInfo.hasNextPage == false){
				nextPageLi.addClass("disabled");
				lastPageLi.addClass("disabled");
			}
			else{
				//为元素添加点击分页事件
				nextPageLi.click(function(){
					to_page(result.data.pageInfo.pageNum+1);
				});
				lastPageLi.click(function(){
					to_page(result.data.pageInfo.pages);
				});
			}
			/* 添加首页和前一页 */
			ul.append(firstPageLi).append(prePageLi);
			/* 添加数字页 */
			$.each(result.data.pageInfo.navigatepageNums, function(index, item){
				var numLi = $("<li></li>").append($("<a></a>").append(item).attr("href","#"));
				numLi.click(function(){
					to_page(item);
				});
				/* 如果显示的数字是当前页增加一个class属性 */
				if(result.data.pageInfo.pageNum == item){
					numLi.addClass("active");
				}
				
				ul.append(numLi);
			});
			/* 添加后一页和末页 */
			ul.append(nextPageLi).append(lastPageLi);
			
			ul.appendTo("#page_info_nav");
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
			//表单重置,清除表单数据，样式。。
			form_reset("#add_emp_form");
			//$("#add_emp_form")[0].reset();
			/* 发送ajax请求，查询出本门信息，显示在下拉列表当中 */
			//getDepts();
			/* 弹出模态框 */
			$("#empAdd").modal({
				backdrop:"static"
			});
		});
		
		/* 查询出所有的部分信息,并显示在下拉里列表当中 */
		function getDepts(ele){
			//先清空下拉列表中的值
			$(ele).empty();
			$.ajax({
				url:"${APP_PATH}/depts.do",
				type:"GET",
				success:function(result){
					/* console.log(result); */
					/* 显示部门信息在下拉列表中 */
					$.each(result.data.depts,function(){
						var optionEle = $("<option></option>").attr("value", this.deptId).append(this.deptName);
						optionEle.appendTo(ele);
					})
				}
			});
		}
		
		/* 绑定单击事件，点击以后将数据传给控制器| */
		$("#emp_save_btn").click(function(){
			//1.将模态框中填写的数据交给服务器进行保存
			//2.先对要提交的数据进行校验
			/* validate_add_form();
			if(!validate_add_form()){
				return false;
			}  */
			//判断ajax用户名是否校验成功，如果成功
			if(!$(this).attr("ajax-va")){
				return false;
			}
			//3.发送ajax请求到服务器，保存数据
			$.ajax({
				url:"${APP_PATH}/saveEmp.do",
				type:"POST",
				/* 提取要提交的数据 */
				data:$("#add_emp_form").serialize(),
				success:function(result){
					/* alert(result.msg); */
					if(result.code == 100){
						/* 员工保存成功：*/
						//1.关闭模态框
						$("#empAdd").modal('hide');
						//2. 来到最后一页
						//发送ajax请求显示组后裔也数据,将总记录数当作页码
						to_page(totalRecord);
					}else{
						//显示失败信息
						 /* console.log(result); */ 
						//有那个字段的信息 就显示那个字段
						if(undefined != result.data.errorField.address){
							//显示邮箱错误信息
							console.log(result.data.errorField.address);
							show_validation_msg("#emp_email_add_input", "error", result.data.errorField.address);
						}
						if(undefined != result.data.errorField.empName){
							//显示用户名错误信息
							show_validation_msg("#emp_name_add_input", "error", result.data.errorField.empName);
						}
					}
				}
			});
			/* alert($("#add_emp_form").serialize()); */
		});
		
		//前端校验表单数据是否合法
		function validate_add_form(){
			//1.要校验数据需要拿到数据，正则表达式检测
			var empName = $("#emp_name_add_input").val();
			var regName =  /(^[a-zA-Z0-9]{6,16}$)|(^[\u2E80-\u9FFF]{2,5}$)/;
			/* alert( regName.test(empName));  */
			if(!regName.test(empName)){
				/* alert("username should in6-16 or Chinese in 2-5 characteristics"); */
				show_validation_msg("#emp_name_add_input", "error","username should in6-16 or Chinese in 2-5 characteristics(from front end)");
				return false;
			}
			else{
				show_validation_msg("#emp_name_add_input", "success","");
			}
			
			var empEmail = $("#emp_email_add_input").val();
			var regEmail = /^([a-zA-Z0-9_\.-]+)@([\da-z\.-]+)\.([a-z\.]{2,6})$/;
			if(!regEmail.test(empEmail)){
				/* alert("Email format is not correct, please check it now!"); */
				show_validation_msg("#emp_email_add_input", "error","Email format is not correct, please check it now!(from front end)");
				return false;
			}
			else{
				show_validation_msg("#emp_email_add_input", "success","");
			}
			return true;
		}
		
		//显示校验结果
		function show_validation_msg(element, status, msg){
			/* 在添加新的class之前应该先清空上一次正确/错误的class */
			$(element).parent().removeClass("has-success has-error");
			$(element).next("span").text("");
			
			if(status=="success"){
				$(element).parent().addClass("has-success");
				$(element).next("span").text(msg);
			}
			else if(status=="error"){
				$(element).parent().addClass("has-error");
				$(element).next("span").text(msg);
			}
		}
		
		//后端校验用户数据是否可用，为input修改绑定一个修改事件
		$("#emp_name_add_input").change(function (){
			//发送ajax请求，
			var empName = this.value;
			$.ajax({
				url:"${APP_PATH}/empNameCheck.do",
				data:"empName="+empName,
				type:"POST",
				success:function(result){
					if(result.code==100){
						show_validation_msg("#emp_name_add_input","success","available username");
						$("#emp_save_btn").attr("ajax-va","success");
					}
					else{
						show_validation_msg("#emp_name_add_input","error", result.data.va_msg);
						$("#emp_save_btn").attr("ajax-va","error");
					}
				}
			});
		});
		
		
		
		/* ================= 编辑按钮 =============================== */
		//为编辑按钮绑定点击事件
		$(document).on("click", ".edit_btn", function(){
			//alert("ss");
			//0. 查出员工信息
			//1. 查出部门信息。并显示部门列表
			getDepts("#dept_update_select");
			
			//弹出模态框
			$("#empEdit").modal({
				backdrop:"static"
			});
		});
	</script>
</body>
</html>