<%@page import="java.util.Random"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		Random rnd = new Random();
	%>
	<c:set var = "luck">
		<%=rnd.nextInt(10) %>
	</c:set>
	<c:choose>
		<c:when test="${luck==6 }">恭喜你中了一等奖！</c:when>
		<c:when test="${luck==7 }">恭喜你中了二等奖！</c:when>
		<c:when test="${luck==8 }">恭喜你中了三等奖！</c:when>
		<c:otherwise>谢谢您的参与！</c:otherwise>
	</c:choose>
</body>
</html>