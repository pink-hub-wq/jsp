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
		try{
			int money = 100;
			int number = 0;
			request.setAttribute("result", money/number);
		}catch(Exception e){
			request.setAttribute("result", "很抱歉，页面出现错误");
		}
		request.getRequestDispatcher("SL5_result.jsp").forward(request, response);
	%>
</body>
</html>