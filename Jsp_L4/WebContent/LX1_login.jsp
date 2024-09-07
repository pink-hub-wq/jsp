<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@page import="com.edu.seiryo.service.imp.UserServiceImp"%>
<%@page import="com.edu.seiryo.service.UserService"%>
<%@page import="com.edu.seiryo.entity.User"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=utf-8");
        //获取cookie数组
        Cookie[] cookies = request.getCookies();
        String cookieAccount = null;
        String cookiePassword = null;
        if (cookies != null) {
            for (Cookie cookie2 : cookies) {
                if("name".equals(cookie2.getName())){
                    cookieAccount = cookie2.getValue();
                } else if("password".equals(cookie2.getName())){
                    cookiePassword = cookie2.getValue();
                }
            }
        }
        UserService userService = new UserServiceImp();
        User user = userService.login(cookieAccount, cookiePassword);
        if (user != null) {
        	%>
        	<form action="LoginServlet2" method="post">
        <div class="cc">
            <div class="inf">
                <ul>
                    <li>账号：&nbsp;&nbsp;
                        <label for="account"></label>
                        <input type="text" name="account" class="ipt" value = "<%= cookieAccount%>"/>
                    </li>
                    <li>密码：&nbsp;&nbsp;&nbsp;
                        <input type="password" name="password" class="ipt" value="<%= cookiePassword%>"/>
                    </li>
                    <li>有效期：
                        <input type="radio" name="cookie" value="30"/>
                        <label for="radio"></label>
                        <span>30天有效</span>
                    </li>
                </ul>
            </div>
            <div class="dl">
                <input type="submit" value="登录"/>
            </div>
            <div style="color:red; margin-top:15px; margin-left:70px">
             <%
       		 	String msg = (String) request.getAttribute("msg");
       		 	if (msg != null) {
   			 %>
            	<%= msg %>
   			 <%
     		   }
   			 %>
            </div>
        </div>
    </form>
        	<%
        } else {
    %>
    <form action="LoginServlet2" method="post">
        <div class="cc">
            <div class="inf">
                <ul>
                    <li>账号：&nbsp;&nbsp;
                        <label for="account"></label>
                        <input type="text" name="account" class="ipt"/>
                    </li>
                    <li>密码：&nbsp;&nbsp;&nbsp;
                        <input type="password" name="password" class="ipt"/>
                    </li>
                    <li>有效期：
                        <input type="radio" name="cookie" value="30"/>
                        <label for="radio"></label>
                        <span>30天有效</span>
                    </li>
                </ul>
            </div>
            <div class="dl">
                <input type="submit" value="登录"/>
            </div>
            <div style="color:red; margin-top:15px; margin-left:70px">
             <%
       		 	String msg = (String) request.getAttribute("msg");
       		 	if (msg != null) {
   			 %>
            	<%= msg %>
   			 <%
     		   }
   			 %>
            </div>
        </div>
    </form>
    <%
        }
    %>
</body>
</html>