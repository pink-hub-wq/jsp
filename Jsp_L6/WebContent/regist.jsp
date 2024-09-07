<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>注册</title>
<link href = "css/style.css" rel="stylesheet" type="text/css"/>
<script src="JS/jquery-1.8.0.min.js"></script>
<script>
    $(function() {
        $('#account').on("blur", function() {
            var account = $(this).val();
            if (account.length < 5 || account.length > 12) {
                alert("用户名应该在5-12位之间");
            }
        });

        $('#password').on("blur", function() {
            var password = $(this).val();
            if (password.length < 5 || password.length > 12) {
                alert("密码应该在5-12位之间");
            }
        });
        $('#sex').on("blur", function() {
            var sex = $(this).val();
            if (sex !== '男' && sex !== '女') {
                alert("性别只能为男或女");
            }
        });
        $('#nickname').on("blur", function() {
            var nickname = $(this).val();
            if (nickname.length < 1 || nickname.length > 5) {
                alert("昵称应该在1-5位之间");
            }
        });
    });
</script>
</head>
<body>
	<%
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=utf-8");
	    String msg = (String)request.getAttribute("msg");
	    String account = "";
    	String sex = "";
	    String nickname = "";
	    if(msg != null){
	    	account = (String)request.getAttribute("account");
	    	sex = (String)request.getAttribute("sex");
		    nickname = (String)request.getAttribute("nickname");
	    }
	%>
	<form action = "RegistServlet" method = "post">
		<div class = "reg">
			<div class = "reg-b">
				<ul>
					<li>
						账号：
						<input type = "text" name = "account" class = "text1" id = "account" value="<%=account%>">
					</li>
					<li>
						密码：
						<input type = "password" name = "password" class = "text1" id = "password">
					</li>
					<li>
						性别：
						<input type = "text" name = "sex" class = "text1" id = "sex" value="<%=sex%>">
					</li>
					<li>
						昵称：
						<input type = "text" name = "nickname" class = "text1" id = "nickname"value="<%=nickname%>">
					</li>
					<li>
						&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
						<input type="image" src="images/confirm.jpg">
					</li>
					<%
						if(msg != null){
						out.print(msg);
						}
					%>
				</ul>
			</div>
		</div>
		
	</form>
</body>
</html>