<%@page import="com.edu.seiryo.entity.User,java.util.*"%>
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
	<table>
		<tr>
			<td>编号</td>
			<td>用户名</td>
			<td>密码</td>
			<td>操作</td>
		</tr>
		<c:forEach var="user" items="${allUserList}">
            <tr>
                <td><c:out value="${user.id}" /></td>
                <td><c:out value="${user.userName}" /></td>
                <td><c:out value="${user.password}" /></td>
                <td>
                    <a href="UsersServlet?opt=queryUser&amp;id=${user.id}">修改</a>
                    <a href="UsersServlet?opt=delete&amp;id=${user.id}">删除</a>
                </td>
            </tr>
        </c:forEach>
		${msg }
	</table>
</body>
</html>