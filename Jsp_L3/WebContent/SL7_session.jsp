<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

	<%
		request.setCharacterEncoding("UTF-8");
		String name = request.getParameter("name");
	    session.setAttribute("name", name);
	%>
	<form action = "SL7_effect.jsp" method = "post">
		<table>
			<tr>
				<td width="36%" align = "left">您的名字是：</td>
				<td width="64%" align = "left"><%=name %></td>
			</tr>
			<tr>
				<td width="55%" align = "left">您最喜欢的地方是：</td>
				<td width="45%" align = "left"><input type = "text" name="area"></td>
			</tr>
			<tr>
				<td colspan=3><input type = "submit" value="提交" align = "right"></td>
			</tr>
		</table>
	</form>
</body>
</html>