<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="SL8_2.jsp" method="post">
        <table width="435" height="170" border="1" align="center" cellpadding="0" cellspacing="0">
            <tr>
                <td colspan="2">
                    <div align="center">param、paramVal 练习</div>
                </td>
            </tr>
            <tr>
                <td width="101">
                    <div align="center">
                        <span class="style3">用户名：</span>
                    </div>
                </td>
                <td width="328">
                    <input type="text" name="username" id="username" />
                </td>
            </tr>
            <tr>
                <td>
                    <div align="center">
                        <span class="style3">爱好：</span>
                    </div>
                </td>
                <td>
                    <span class="style3">
                        <input type="checkbox" name="likes" id="likes1" value="游泳"> 游泳
                        <input type="checkbox" name="likes" id="likes2" value="看书"> 看书
                        <input type="checkbox" name="likes" id="likes3" value="编程"> 编程
                    </span>
                </td>
            </tr>
            <tr>
                <td>&nbsp;</td>
                <td>
                    <span class="style3">
                        <input type="submit" value="提交">
                        <input type="reset" name="reset" id="reset" value="重置">
                    </span>
                </td>
            </tr>
        </table>
    </form>
</body>
</html>