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
	<table>
		<tr>
			<td>
				用户编号
			</td>
			<td>
				用户名
			</td>
			<td>
				用户密码
			</td>
			<td>
				用户邮箱
			</td>
		</tr>
		<c:forEach items="${pager.currentPagedText}" var="user">
			<tr>
				<td>${user.id }</td>
				<td>${user.userName }</td>
				<td>${user.password }</td>
				<td>${user.email }</td>
			</tr>
		</c:forEach>
		当前页：${pager.currentPage}
		<a href="UserServlet?opt=main2&currentPage=1">首页</a>
		<a href="UserServlet?opt=main2&currentPage=${pager.currentPage - 1}">上一页</a>
		<a href="UserServlet?opt=main2&currentPage=${pager.currentPage + 1}">下一页</a>
		<a href="UserServlet?opt=main2&currentPage=${pager.totalPage}">末页</a>
	</table>
</body>
</html>