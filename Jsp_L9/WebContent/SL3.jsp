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
	<c:set var="name" value="JAVAEE"/>
	输出无签体变量：<c:out value="${name }"/></br>
	<c:remove var="name"/>
	输出remove命令执行后的变量:
	<c:out value="${name}">值为null,执行此处</c:out></br>
</body>
</html>