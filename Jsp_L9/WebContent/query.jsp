<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<c:choose>
    <c:when test="${type == 1}">
        <title>管理员发帖</title>
    </c:when>
    <c:otherwise>
        <title>帖子列表</title>
    </c:otherwise>
</c:choose>
<style>
    .style1 {font-size: 16px; font-weight: bold;}
    .style2 {font-size: 16px;}
    a{text-decoration: none;}
</style>
</head>
<body>
<c:choose>
    <c:when test="${type == 1}">
        <h3>管理员 [<c:out value="${account}"/>] 欢迎你</h3>
        <form action="TitleManagerServlet?flag=_send" method="post">
            <table>
                <tr>
                    <td>标题名：</td>
                    <td><input type="text" name="title"></td>
                </tr>
                <tr>
                    <td><input type="submit" value="发帖"></td>
                </tr>
                <tr>
                    <td colspan="2"><font color="red">${msg}</font></td>
                </tr>
            </table>
        </form>
    </c:when>
    <c:otherwise>
        <a href="TitleManagerServlet?flag=_queryAll">点击查看所有帖子列表</a>
    </c:otherwise>
</c:choose>
</body>