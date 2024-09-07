<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
    <h1>帖子标题</h1>
    <h3>${title.title}</h3>
    <table border="1" width="60%">
        <tr>
            <td>回复时间</td>
            <td>账号</td>
            <td>回复内容</td>
        </tr>
        <c:forEach var="reply" items="${replyList}" varStatus="status">
            <tr>
                <td><c:out value="${reply.time}"/></td>
                <td><c:out value="${reply.account}"/></td>
                <td><c:out value="${reply.msg}"/></td>
            </tr>
        </c:forEach>
    </table>
    输入回帖内容：<br/>
    <form action="TitleManagerServlet?flag=_reply" method="post">
        <textarea name="msg" rows="4" cols="50"></textarea><br>
        <input type="hidden" name="id" value="${title.id}">
        <input type="submit" value="提交">
    </form>
</body>
</html>