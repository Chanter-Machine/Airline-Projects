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
<!-- 
	不以/开始的相对路径，找资源，以当前资源的路径魏基准，进场容易出问题
	以/开始的相对路径，找资源以服务器的路劲为标准eg.http://localhost:3306， 需要加上项目名
	
 -->
<link rel="stylesheet" href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script src="https://cdn.bootcss.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body>
	<div class="container">
		<!-- 标题行 -->
		<div class="row">
			<div class="col-md-12">
				<h1>SSM-CRUD</h1>
			</div>
		</div>
		<!-- 按钮 -->
		<div class="row">
			 <div class="col-md-4 col-md-offset-8">
			 	<button class="btn btn-primary">新增</button>
			 	<button class="btn btn-danger">删除</button>
			 </div>
		</div>
		<!-- 表格 -->
		<div class="row">
			<div class="col-md-12">
				<table class="table table-hover">
					<tr>
						<th>#</th>
						<th>empName</th>
						<th>gender</th>
						<th>email</th>
						<th>department</th>
						<th>操作</th>
					</tr>
					
					<c:forEach items="${pageInfo.list }" var="emp">
						<tr>
							<th>${emp.empId }</th>
							<th>${emp.empName }</th>
							<th>${emp.gender=="M"?"male":"female" }</th>
							<th>${emp.address }</th>
							<th>${emp.department.deptName }</th>
							<th>
								<button class="btn btn-primary btn-sm">
								 	<span class="glyphicon glyphicon-pencil" aria-hidden="true"></span> Star 
								  	编辑
								</button>
								<button class="btn btn-danger btn-sm">
								 	<span class="glyphicon glyphicon-trash" aria-hidden="true"></span> Star 
									  删除
								</button>
							</th>
						</tr>
					</c:forEach>
					
				</table>
			</div>
		</div>
		<!-- 分页信息 -->
		<div class="row">
			<!-- 分页文字信息 -->
			<div class="col-md-6">
				当前${pageInfo.pageNum }页, 总${pageInfo.pages}页,总${pageInfo.total }条记录
			</div>
			<!--分页条信息 -->
			<div class="col-md-6">
				<nav aria-label="Page navigation">
				  <ul class="pagination">
				  	<c:if test="${!pageInfo.isFirstPage }">
					    <li><a href="${APP_PATH }/emps.do?pageNum=1">首页</a></li>
					    
					</c:if>
				    <c:if test="${pageInfo.hasPreviousPage }">
				      <li>
					      <a href="${APP_PATH }/emps.do?pageNum=${ page_Num-1}" aria-label="Previous">
					        <span aria-hidden="true">&laquo;</span>
					      </a>
				      </li>
					</c:if>
				    <c:forEach items="${pageInfo.navigatepageNums }" var="page_Num">
						<c:if test="${page_Num == pageInfo.pageNum }">
					    	<li class="active"><a href="#">${page_Num }</a></li>
						</c:if>				    	
						<c:if test="${page_Num != pageInfo.pageNum }">
					    	<li ><a href="${APP_PATH }/emps.do?pageNum=${ page_Num}">${page_Num }</a></li>
						</c:if>				    	
				    </c:forEach>
				    <c:if test="${pageInfo.hasNextPage }">
				      <li>
					      <a href="${APP_PATH }/emps.do?pageNum=${ page_Num+1}" aria-label="Next">
					        <span aria-hidden="true">&raquo;</span>
					      </a>
				      </li>
					</c:if>
					
					<c:if test="${!pageInfo.isLastPage }">
					    <li><a href="${APP_PATH }/emps.do?pageNum=${pageInfo.pages}">末页</a></li>
					</c:if>
				  </ul>
				</nav>
			</div>
		</div>
	</div>
</body>
</html>