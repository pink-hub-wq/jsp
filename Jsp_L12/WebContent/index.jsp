<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
      <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>注册</title>
<script type="text/javascript" src="js/jquery-1.8.0.min.js"></script>
<script>
	function checkUserName(){
		var userName = $("#userName").val();
		$.ajax({
			url:"UserServlet?opt=checkUserName",
			type:"post",
			data:"userName=" + userName,
			success: function(data){
				if (data === 'true') {
			        $("#msg1").html("用户名不符合要求，请重新输入");
			    } else {
			        $("#msg1").html("用户名符合要求");
			    }
			}
		})
	}
	function checkUserPassword(){
		var password = $("#password").val();
		$.ajax({
			url:"UserServlet?opt=checkPassword",
			type:"post",
			data:"password=" + password,
			success:function(data){
				if (data === 'true') {
					$("#msg2").html("密码格式正确");
				}else{
					$("#msg2").html("密码不能为空，请重新输入");
				}
			}
		})
	}
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
					$("#msg3").html("验证码正确");
				}else{
					$("#msg3").html("验证码错误，请重新输入");
				}
			}
		})
	}
	function sendEmail(){
		var email = $("#email").val();
		$.ajax({
			url:"UserServlet?opt=sendEmail",
			type:"post",
			data:"email=" + email,
			success:function(data){
				if (data === 'true') {
					$("#msg4").html("验证码已发送");
				}else{
					$("#msg4").html("验证码发送失败");
				}
			}
		})
	}
	function checkNumber(){
		var number = $("#number").val();
		$.ajax({
			url:"UserServlet?opt=checkNumber",
			type:"post",
			data:"number=" + number,
			success:function(data){
				if (data === 'true') {
					$("#msg5").html("验证码正确");
				}else{
					$("#msg5").html("验证码错误，请重新输入");
				}
			}
		})
	}
</script>
</head>
<body>
	<form action="UserServlet?opt=checkAll" method="post">
		用户名：<input type= "text" id="userName"name="userName" onblur="checkUserName()" value="${userName }"/>
		<span id="msg1"></span><br/>
		密&nbsp;&nbsp;&nbsp;&nbsp;码：<input type= "text" id="password" name="password" onblur="checkUserPassword()" value="${password }"/>
		<span id="msg2"></span><br/>
		验证码：<input type="text" id="image" name="image" onblur="checkImage()" value="${image }"/>
		<img id="pic" border=1 src="image.jsp?,Math.random();" onclick="return chk_image();">
		<a href="#" onclick="return chk_image();">	看不清，换一张</a><span id="msg3"></span><br/>
		邮&nbsp;&nbsp;&nbsp;&nbsp;箱：<input type="text" id="email" name="email"value="${email}"/><a href="#" onclick="sendEmail();" >	发送邮箱验证码</a><br/>
		<span id="msg4"></span><br/>
		邮箱验证码：<input type="text" id="number" name="number" onblur="checkNumber()"/>
		<span id="msg5"></span><br/>
		<input type="submit" value="注册"/>
		${msg6}
	</form>
	<a href="UserServlet?opt=main2">分页</a>
</body>
</html>