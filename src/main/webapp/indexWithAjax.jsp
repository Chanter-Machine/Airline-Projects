<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%-- <jsp:forward page="/WEB-INF/view/list.jsp"></jsp:forward> --%>
<%	
	pageContext.setAttribute("APP_PATH",request.getContextPath());
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script src="http://ajax.googleapis.com/ajax/libs/jquery/1.9.1/jquery.min.js">
</script>
<title>Insert title here</title>
</head>
<body>
	<form id="login_form">
		email:<input type="text" name="email"/></br>
		password:<input type="password" name="password"/></br>
		<input type="submit" id="user_login" value="Submit" />
	</form>
	
	<script>
	$("#user_login").click(function (){
		//submit ajax request，
		$.ajax({
			url:"${APP_PATH}/login2.do",
			data:$("#login_form").serialize(),
			type:"POST",
			success:function(result){
				if(result.code==100){
					console.log(result);
					alert("success"); 
				}
				else{
					alert("interesting");
				}
			}
		});
	});
	</script>
</body>
</html>