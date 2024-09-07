<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <%@page import="com.edu.seiryo.entity.User2,java.util.*"%>
<%@page import="java.util.List"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
		String msg = (String)request.getAttribute("msg");
	%>
	<%
		List<User2> list = new ArrayList<User2>();
		try{
			list = (List<User2>)request.getAttribute("allUserList");
			System.out.println(list.size());
		}catch(Exception e){
			e.printStackTrace();
		}
		
	%>
	<table>
		<tr>
			<td>编号</td>
			<td>用户名</td>
			<td>性别</td>
			<td>出生日期</td>
			<td>公司名称</td>
			<td>操作</td>
		</tr>
		<%
			if(list.size() == 0){
		%>
		<td collspan = "6" rowspan = "4">无用户信息</td>
		<%		
			}
		%>
		<%
			if(list.size() != 0){	
			
			for(int i = 0;i < list.size();i++){
				User2 user = list.get(i);
			
		%>
		<tr>
			<td><%= user.getId() %></td>
			<td><%= user.getUserName() %></td>
			<td><%= user.getSex() %></td>
			<td><%= user.getBirthday() %></td>
			<td><%= user.getCompany() %></td>
			<td>
				<a href = "UserServlet?opt=queryUser&id=<%= user.getId()%>">修改</a>
				<a href = "UserServlet?opt=delete&id=<%= user.getId()%>">删除</a>
			</td>
		</tr>
		<%
			}
		%>
		<tr>
    		<td>
      			  <a href="UserServlet?opt=deleteAll">全部删除</a>       
   			 </td>
		</tr>
		<%
			}
		%>
		<%
			if(msg != null){
				out.print(msg);
			}
		%>
	</table>
</body>
</html>