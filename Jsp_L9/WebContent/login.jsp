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
<form action="UserManagerServlet?flag=login" method="post">
    <table>
        <tr>
            <td>用户名:</td>
            <td><input type="text" name="account"></td>
        </tr>
        <tr>
            <td>密&nbsp;&nbsp;码:</td>
            <td><input type="password" name="password"></td>
        </tr>
        <tr>
            <td><input type="hidden" name="flag" value="login"></td>
            <td><input type="submit" value="登录"/></td>
        </tr>
        <tr>
            <td colspan="2" style="color: red;">${msg}</td>
        </tr>
    </table>
</form>
</body>
</html>