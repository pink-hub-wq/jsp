<%@page import="com.edu.seiryo.service.imp.UserServiceImp"%>
<%@page import="com.edu.seiryo.service.UserService"%>
<%@page import="java.util.List,com.edu.seiryo.entity.Chat"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>聊天内容</title>
      <script>
            window.setInterval(function(){
              window.location.href="ChatManagerServlet?flag=_show";
            }, 3000);
      
      </script>
  </head>
  
  <body>
  	<%	
  	UserService userService = new UserServiceImp();
  	if(request.getAttribute("msg") == null){
  		

  	List<Chat> list = (List<Chat>)session.getAttribute("chatList");
  	if(list != null){
  		if(list.size() != 0){

  		for(Chat chat : list){
  			String account = chat.getSender();
  			String sender = userService.selectUserNickName(account);
  	%>
      <!--遍历在线用户列表-->
        
             <div style="font-size:14;colopr:#666;">
                 	<%=sender %>说:
                 	<span style="color:<%=chat.getColor()%>">
                 	<%=chat.getInfo() %> 
                 	</span>&nbsp;&nbsp;
                 	<%=chat.getTime() %>
             </div> 
           <%
              }
  	}
			
		}else{
  		 %>	
  		 <%String msg = (String)request.getAttribute("msg"); %>
  		<%="无用户信息"%>
  	<%
  		}
  	}else{
  	%>
  	<%String msg = (String)request.getAttribute("msg"); %>
  	<%="无用户信息"%>
       <%
  	}
       %>   
  </body>
</html>