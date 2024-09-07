<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
    <c:out value="无标签主体的输出"></c:out><br>
    <c:out value="${name}">value值为null时，输出JSTJ</c:out><br>
    <c:out value="<hr>原样输出html标签<hr>" escapeXml="true"></c:out><br>
    <c:out value="<hr>转换html标签并输出<hr>" escapeXml="false"></c:out>
</body>
</html>