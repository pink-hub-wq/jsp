<%@page import="java.util.ArrayList"%>
<%@page import="com.edu.seiryo.entity.User"%>
<%@page import="java.util.List"%>
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
	List<User> list=new ArrayList<User>();
	for(int i=1;i<6;i++){
		User user = new User();
		user.setName("JAVAEE" +i);
		if(i % 2 == 0){
			user.setSex("男");
		}else {
			user.setSex("女");
		}
		user.setAge(20 + i);
		list.add(user);
	}
	session.setAttribute("list",list);%>
	<table width="400" height="160" border="Ipx" cellpadding= "0" cellspacing="0">
	<tr> 
		<td colspan="4" align="center">用户信息</td>
	</tr>
	<tr>
		<td width="107" align="center">編号</td>
		<td width="107" align="center">姓名</td>
		<td width="106" align="center">性别</td>
		<td width="106"align="center">年龄</td>
	</tr>
	<c:forEach var="user" items="${list }" varStatus="calc">
	<tr>
		<td align= "center">${calc.count} </td>
		<td align="center">${user.name}</td>
		<td align="center">${user.sex}</td>
		<td align="center">${user.age} </td>
	</tr>
	</c:forEach>
	</table>
</body>
</html>