<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		request.setAttribute("key", "requestVal");
		session.setAttribute("key", "sessionVal");
		session.setAttribute("keyl", "sessionVal");
	%>
	属性值：key = ${key};<br/>
	request范围内的 key=${requestScope.key};<br/>
	session范围内的 key=${sessionScope.key};<br/>
	session范围内的 keyl=${keyl};<br/>
</body>
</html>