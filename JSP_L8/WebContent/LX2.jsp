<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>

<body>
    <form name="form1" method="post" action="LX2_1.jsp">
        <table width="440" height="30" border="1" align="center" cellpadding="0" cellspacing="1" bgcolor="#333333">
            <tr>
                <td width="76" align="center" bgcolor="#FFFFFF">用&nbsp;户&nbsp;名：</td>
                <td width="324" bgcolor="#FFFFFF"><input type="text" name="username" id="username" /></td>
            </tr>
            <tr>
                <td align="center" bgcolor="#FFFFFF">密&nbsp;&nbsp;&nbsp;&nbsp;码：</td>
                <td bgcolor="#FFFFFF"><input type="password" name="password" id="password" /></td>
            </tr>
            <tr>
                <td align="center" bgcolor="#FFFFFF">电子邮箱：</td>
                <td bgcolor="#FFFFFF"><input type="text" name="email" id="email" /></td>
            </tr>
            <tr>
                <td  align="center" bgcolor="#FFFFFF">性&nbsp;&nbsp;&nbsp;&nbsp;别：</td>
                <td bgcolor="#FFFFFF">
	                   	<input type="radio" name="sex" id="man" value="男"> 男
	                    <input type="radio" name="sex" id="woman" value="女"> 女
                </td>
            </tr>
            <tr>
                <td align="center" bgcolor="#FFFFFF">爱好：</td>
                <td bgcolor="#FFFFFF"> 
                    <input type="checkbox" name="likes" id="likes1" value="游泳"> 游泳
                    <input type="checkbox" name="likes" id="likes2" value="看书"> 看书
                    <input type="checkbox" name="likes" id="likes3" value="编程"> 编程
                </td>
            </tr>
            
            <tr>
            	<td bgcolor="#FFFFFF">备&nbsp;&nbsp;&nbsp;&nbsp;注：</td>
                <td colspan="2" bgcolor="#FFFFFF"><input type="text" name="memo" id="memo" /></td>
            </tr>
            <tr>
                <td bgcolor="#FFFFFF"></td>
                <td align="center" bgcolor="#FFFFFF">
                	<input type="submit" name="submit" value="注册">
                    <input type="reset" name="reset" value="重置">
                </td>
            </tr>
        </table>
    </form>
</body>
</html>