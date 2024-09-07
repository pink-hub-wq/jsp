<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>注册和登录</title>
<link href = "css/style.css" rel="stylesheet" type="text/css"/>
</head>
<body>
	<%
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=utf-8");
	    String msg = (String)request.getAttribute("msg2");
	    String account = "";
	    if((String)request.getAttribute("account")!= null){
	    	account = (String)request.getAttribute("account");
	    }
	%>
	<form id="loginForm" action="LoginServlet?flag=_login" method="post">
    <div class="contain">
        <div class="login">
            <ul>
                <li>
                    <input type="text" name="account" class="login-one" value="<%=account%>">
                </li>
                <li>
                    <input type="password" name="password" class="login-two">
                </li>
                <li>
                    &nbsp;&nbsp;&nbsp;
                    <input type="image" src="images/Login.gif">
                    <input type="image" src="images/rer.gif" onclick="regist(event);"><br/>
                    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                    <%
						if(msg != null){
							out.print(msg);
						}
					%>
                </li>
                
            </ul>
        </div>
    </div>
</form>

<script>
    function regist(event) {
        event.preventDefault();
        window.location.href = 'regist.jsp';
    }
</script>
</body>
</html>