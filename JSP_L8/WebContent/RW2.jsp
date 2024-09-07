<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<form name="form1" method="post" action="RW2Servlet">
        <table width="349" height="120" border="1" align="center" cellpadding="0" cellspacing="2">
            <tr>
                <td>用户名：</td>
                <td>
                    <input name="username" type="text" id="username" style="border:1px solid #B99500; width:160px;">
                </td>
            </tr>
            <tr>
                <td>密&nbsp;&nbsp;码：</td>
                <td>
                    <input name="pwd" type="password" id="pwd" style="border:1px solid #B99500; width:160px;">
                </td>
            </tr>
            <tr>
                <td colspan="2" align="center">
                    <input type="submit" value="登录">
                </td>
            </tr>
        </table>
    </form>
</body>
</html>