<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
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
		List<String> list = new ArrayList<String>();
		list.add("Java高级软件工程师");
		list.add(".Net高级软件工程师");
		list.add("Android高级软件工程师");
		list.add("Ios高级软件工程师");
		session.setAttribute("List", list);
	%>
	<%
		List<String> listl = (List<String>)session.getAttribute("List");
		for(int i = 0;i < listl.size();i++){
			request.setAttribute("requestI", i);
	%>
		${requestI}:${List[requestI]}<br/>
	<%
		}
	%>
</body>
</html>