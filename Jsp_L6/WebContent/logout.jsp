<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
 <script>
            window.setInterval(function(){
              window.location.href="SessionTimeout";
            }, 1000);
      
 </script>
 <head>
    <title>用户退出页面</title>
  </head>
  <body>
  <a href="LoginServlet?flag3=_logout">退出登录</a>
  </body>
</html>