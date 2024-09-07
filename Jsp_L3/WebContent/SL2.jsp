<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>实现乘法口诀</title>
</head>
<body>
	<%
		String str = "";
		for(int i = 1;i <= 9;i++){
			for(int j = 1;j <= i;j++){
				str += j+"*" + i + "=" + j * i;
				str += "&nbsp;";
			}
			str += "<br>";
		}
	%>
	<table width = "440" height = "85" border = "1" cellpadding="0" style= "font:9px;">
		<tr><td height = "30" align = "center"></td></tr>
		<tr>
			<td style = "padding:3px"><%= str %></td>
		</tr>
	</table>
</body>
</html>