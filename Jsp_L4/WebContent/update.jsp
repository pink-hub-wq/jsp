<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
        <%@page import="com.edu.seiryo.entity.User2,java.util.*"%>
<%@page import="java.util.List"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
		User2 user = new User2();
		user = (User2)request.getAttribute("user");
	%>
	<form action="UserServlet?opt=update" method="post">
        <table>
            <tr>
                <td>编号</td>
				<td>用户名</td>
				<td>性别</td>
				<td>出生日期</td>
				<td>公司名称</td>
				<td>操作</td>
            </tr>
            <tr>
                <td>
                	<span style="border: 1px solid; display: inline-block; height: 20px; width:20px"><%= user.getId() %></span>
                	<input type="hidden" name="id" value="<%= user.getId() %>">
                </td>
                <td><input type="text" name="userName" value="<%= user.getUserName() %>"></td>
                <td><input type="text" name="sex" value="<%= user.getSex() %>"></td>
                <td><input type="text" name="birthday" value="<%= user.getBirthday() %>"></td>
                <td><input type="text" name="company" value="<%= user.getCompany() %>"></td>
                <td>
                    <input type="submit" value="确认修改">
                </td>
            </tr>
        </table>
    </form>
</body>
</html>