<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>登录</title>
<script type="text/javascript" src="js/jquery-1.8.0.min.js"></script>
<script>
	function checkLoginUserName(){
		var userName = $("#userName").val();
		$.ajax({
			url:"UserServlet?opt=checkLoginUserName",
			type:"post",
			data:"userName=" + userName,
			success: function(data){
				if (data === 'true') {
					$("#msg1").html("用户名符合要求");
			    } else {
			    	$("#msg1").html("用户名不能为空，请重新输入");
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
</script>
</head>
<body>
<form action="UserServlet?opt=checkLoginAll" method="post">
		用户名：<input type= "text" id="userName"name="userName" onblur="checkLoginUserName()" value="${userName }"/>
		<span id="msg1"></span><br/>
		密&nbsp;&nbsp;&nbsp;&nbsp;码：<input type= "text" id="password" name="password" onblur="checkUserPassword()" value="${ password}"/>
		<span id="msg2"></span><br/>
		验证码：<input type="text" id="image" name="image" onblur="checkImage()"value="${image }"/>
		<img id="pic" border=1 src="image.jsp?,Math.random();" onclick="return chk_image();">
		<a href="#" onclick="return chk_image();">	看不清，换一张</a><span id="msg3"></span><br/>
		<input type="submit" value="登录"/>
		${msg4}
	</form>
</body>
</html>