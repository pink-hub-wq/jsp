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
	request.setCharacterEncoding("utf-8");
%>
	用户名：${param.username }<br/>
	爱&nbsp;&nbsp;好：${paramValues.likes[0]}
	&nbsp;&nbsp;${paramValues.likes[1]}&nbsp;&nbsp;
	${paramValues.likes[2]}
	
</body>
</html>