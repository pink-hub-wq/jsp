<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<%
	request.setCharacterEncoding("UTF-8");
%>
<body>
    <form name="form1" method="post" action="index.jsp">
        <table width="440" height="30" border="1" align="center" cellpadding="0" cellspacing="1" bgcolor="#333333">
            <tr>
                <td width="76" align="center" bgcolor="#FFFFFF">用&nbsp;户&nbsp;名：</td>
                <td width="324" bgcolor="#FFFFFF">${param.username}</td>
            </tr>
            <tr>
                <td align="center" bgcolor="#FFFFFF">密&nbsp;&nbsp;&nbsp;&nbsp;码：</td>
                <td bgcolor="#FFFFFF">${param.password}</td>
            </tr>
            <tr>
                <td align="center" bgcolor="#FFFFFF">电子邮箱：</td>
                <td bgcolor="#FFFFFF">${param.email}</td>
            </tr>
            <tr>
                <td bgcolor="#FFFFFF">性&nbsp;&nbsp;&nbsp;&nbsp;别：</td>
                <td bgcolor="#FFFFFF">${param.sex}</td>
            </tr>
            <tr>
            <td bgcolor="#FFFFFF">爱&nbsp;&nbsp;&nbsp;&nbsp;好：</td>
                <td colspan="2" bgcolor="#FFFFFF">
                    ${paramValues.likes[0]}
					&nbsp;&nbsp;${paramValues.likes[1]}&nbsp;&nbsp;
					${paramValues.likes[2]}
                </td>
            </tr>
            <tr>
           	 <td bgcolor="#FFFFFF">备&nbsp;&nbsp;&nbsp;&nbsp;注：</td>
                <td colspan="2" bgcolor="#FFFFFF">${param.memo}</td>
            </tr>
        </table>
    </form>
</body>
</html>