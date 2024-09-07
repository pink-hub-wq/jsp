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
	<c:set var="username" value="Seiryo软件实训"></c:set>
	输出无标签体变量<c:out value="${username }"></c:out></br>
	<c:set var="body" scope="session">body content</c:set>
	输出有标签体变量<c:out value="${body}"></c:out></br>
	<jsp:useBean id="userBean" class="com.edu.seiryo.entity.User">
	</jsp:useBean>
	<c:set target="${userBean}" property="name" value=" JAVAEE"/>
	无标签体-输出设置 bean 中属性 name 的值：<c:out value="${userBean.name}"/><br> <c:set target="${userBean}" property="name" >
	JAVAEE-JSTL-核心标签
	</c:set>
	有标签体-输出设置 bean 中属性 name 的值：
	<c:out value="${userBean.name}"/><br>
</body>
</html>