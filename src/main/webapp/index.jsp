<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%-- <jsp:forward page="/WEB-INF/view/list.jsp"></jsp:forward> --%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
<%	
	pageContext.setAttribute("APP_PATH",request.getContextPath());
%>
<link rel="stylesheet" href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script src="https://cdn.bootcss.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>


</head>
<body>
	Welcome to our index page.
	<form action="${APP_PATH}/login.do" method="POST">
		passengername:<input type="text" name="passengername"/></br>
		password:<input type="password" name="password"/></br>
		<input type="submit" value="Submit" />
	</form>
</body>
</html>