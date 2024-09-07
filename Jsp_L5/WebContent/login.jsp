<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<% String msg = (String)request.getAttribute("msg"); %>
	<form action = "LoginServlet?opt=login"method="post">
		<p>用户名：<input type = "text" name = "userName" class = "userName"/></p>
		<p>密码：<input type = "password" name = "password" class = "password"/></p>
		<p><input type = "submit" value = "登录"></p>
		<%
			if(msg != null){
				out.print(msg);
			}
		%>
	</form>
</body>
</html>