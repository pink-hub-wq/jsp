<%@page import="com.edu.seiryo.entity.User"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	
	<form action="UsersServlet?opt=update" method="post">
        <table>
            <tr>
                <td>编号</td>
                <td>用户名</td>
                <td>密码</td>
                <td>操作</td>
            </tr>
            <tr>
                <td>
                	<span style="border: 1px solid; display: inline-block; height: 20px; width:20px">${ user.id}</span>
                	<input type="hidden" name="id" value="${ user.id}">
                </td>
                <td><input type="text" name="userName" value="${ user.userName}"></td>
                <td><input type="text" name="password" value="${ user.password}"></td>
                <td>
                    <input type="submit" value="确认修改">
                </td>
            </tr>
        </table>
    </form>
</body>
</html>