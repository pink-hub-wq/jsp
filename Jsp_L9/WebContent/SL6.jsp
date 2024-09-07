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
<body>
	循环输出 1-8之间的数字：
	<c:forEach var="item" begin="1" end="8" >
	<c:out value="${item}"/>
	</c:forEach >
	<br/>
	循环输出1-8之间的数字，步长2：
	<c:forEach var="item" begin="1" end="8" step="2">
	<c:out value="${item}"/>
	</c:forEach>
	<br/>
	forEach 遍历字符串：
	<c:forEach var="item" items="java,net,php,ios,android">
	<c:out value="${item}"/>
	</c:forEach >
	<br>
</body>
</body>
</html>