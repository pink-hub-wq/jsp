<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
    <form name="form1" method="post" action="LX1.jsp">
        <table width="483" border="1" cellpadding="0" cellspacing="0" align="center">
            <tr align="center">
                <td colspan="2">歌手评分系统</td>
            </tr>
            <tr>
                <td width="109">第一评委给分：</td>
                <td width="156">
                    <input name="goal1" type="text" id="goal1" value="${param.goal1}">
                </td>
            </tr>
            <tr>
                <td>第二评委给分：</td>
                <td>
                    <input name="goal2" type="text" id="goal2" value="${param.goal2}">
                </td>
            </tr>
            <tr>
                <td>第三评委给分：</td>
                <td>
                    <input name="goal3" type="text" id="goal3" value="${param.goal3}">
                </td>
            </tr>
            <tr>
                <td>选手得分：</td>
                <td>
                    <span class="style3">${(param.goal1 + param.goal2 + param.goal3) / 3}</span>
                </td>
            </tr>
            <tr align="right">
                <td colspan="2">
                    <input type="submit" name="submit" value="计算">
                    <input type="reset" name="reset" value="重置">
                </td>
            </tr>
        </table>
    </form>
</body>
</html>