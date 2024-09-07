<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="com.edu.seiryo.entity.User,java.util.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>在线用户</title>
<script>
     window.setInterval(function(){      
       window.location.href="LoginServlet?flag2=_online";
     },1000)
</script>
<style>
*{padding:0px;margin:0px;}
</style>
</head>
<body>
	<%
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=utf-8");
		Object objType = session.getAttribute("type");
		int type = Integer.parseInt(objType.toString());
		if(type != -1){	
	%>
	<div style="height:32px;width:120px">
	<%
			String account = (String)session.getAttribute("account");
			if(account != null){
				String sex = (String)session.getAttribute("sex");
				if("男".equals(sex)){
	%>
		 <div style="width:32px;height:32px;background:url(images/g.png);float:left"></div>
			<div style="font-size:14px;color:red"><%=session.getAttribute("nickname") %></div>
			<%
				}else if("女".equals(sex)){
			%>
			<div style="width:32px;height:32px;background:url(images/b.png);float:left"></div>
			<div style="font-size:14px;color:red"><%=session.getAttribute("nickname") %></div>
			<%
				}
			%>
		<%
			}
		%>
	</div>
	<br/>
	<%
		}
		List<User> userList = (List<User>)session.getAttribute("list");
		String nickname = (String)session.getAttribute("nickname");
		for(User user: userList){
			if(!(nickname.equals(user.getNickname()))&&user.getType() != -1){
				if("男".equals(user.getSex())){
					
	%>
	<div style="height:32px;width:120px">
		<div style="width:32px;height:32px;background:url(images/g.png);float:left"></div>
			<div style="font-size:14px;color:red"><%=user.getNickname() %></div>
	</div>
	<br/>
	<%
				}else{
		
	%>
	<div style="height:32px;width:120px">
		<div style="width:32px;height:32px;background:url(images/b.png);float:left"></div>
			<div style="font-size:14px;color:red"><%=user.getNickname() %></div>
	</div>
	<br/>
	<%
			}
		}
	}
	%>
</body>
</html>
