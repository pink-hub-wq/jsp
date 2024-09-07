<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="js/jquery-1.8.0.min.js"></script>
<script>
function chk_image(){
	   var img = document.getElementById("pic");
	   img.src = "image.jsp?" + Math.random();
}
function checkImage(){
	var image = $("#image").val();
	$.ajax({
		url:"UserServlet?opt=checkImage",
		type:"post",
		data:"image=" + image,
		success:function(data){
			if (data === 'true') {
				$("#msg").html("验证码正确");
			}else{
				$("#msg").html("验证码错误，请重新输入");
			}
		}
	})
}
</script>
</head>
<body>
	<form action="UserServlet?opt=login" method="post">
		<h1>后台登录</h1>
		用户名：<input type= "text" id="userName"name="userName" value="${userName }"/><br/>
		密&nbsp;&nbsp;&nbsp;&nbsp;码：<input type= "text" id="password" name="password" value="${usePassword }"/><br/>
		验证码：<input type="text" id="image" name="image" onblur="checkImage()" value="${image }"/>
		<img id="pic" border=1 src="image.jsp?,Math.random();" onclick="return chk_image();">
		<a href="#" onclick="return chk_image();">	看不清，换一张</a><span id="msg"></span><br/>
		<input type="submit" value="登录"/>
		${msg2}
	</form>
</body>
</html>