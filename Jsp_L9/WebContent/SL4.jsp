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
	<c:if var="result" test="${ empty param.username}">
	 	<form method="post" action="SL4.jsp">
			用户名:<input type="text" name="username"/><br>
			<input type="submit" value="登录"/>
		</form>
	</c:if>
	<c:if test="${!result}">
		[${param.username}]欢迎您登录！！
	</c:if>
</body>
</html>