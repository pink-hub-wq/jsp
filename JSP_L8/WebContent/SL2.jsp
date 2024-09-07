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
	String[] arr = {"pageContext","request","session","applicationf","session","response","page","out","exception"};
	request.setAttribute("javaee", arr);
%>
<%
	String[] arrl = (String[])request.getAttribute("javaee");
	for(int i =0;i < arrl.length;i++){
	request.setAttribute("val", i);

	
%>
	arr[${val}]:${javaee[val]}<br/>
<%
	}
%>
</body>
</html>