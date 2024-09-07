<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h3>
		empty表达式：<br/>
		User实例的No属性是否为null?&nbsp;&nbsp;&nbsp;result:&nbsp;${empty user.no}<br/>
	</h3>
	<h3>
		条件表达式：<br/>
		条件表达式 user.name ==null ? "abc":user.name&nbsp;&nbsp;
		result:&nbsp;${user.name == null ? "abc" : user.name}
	</h3>
</body>
</html>