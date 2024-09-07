<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script src="JS/jquery-1.8.0.min.js"></script>
<script>
    $(function() {
        $('.userName').on("blur", function() {
            var userName = $(this).val();
            if (userName.length < 5 || userName.length > 12) {
                alert("用户名应该在5-12位之间");
            }
        });

        $('.password').on("blur", function() {
            var password = $(this).val();
            if (password.length < 5 || password.length > 12) {
                alert("密码应该在5-12位之间");
            }
        });
    });
</script>
</head>
<body>

	<form action = "UsersServlet?opt=regist"method="post">
		<p>用户名：<input type = "text" name = "userName" class = "userName"/></p>
		<p>密码：<input type = "password" name = "password" class = "password"/></p>
		<p><input type = "submit" value = "注册"></p>
			${msg }
	</form>
</body>
</html>