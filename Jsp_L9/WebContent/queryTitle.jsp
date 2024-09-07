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
<table width="509" height="204" border="1" align="center" cellpadding="1" cellspacing="0">
    <tr>
        <td colspan="3" align="center">
            <span class="style1">帖子列表</span>
        </td>
    </tr>
    <tr>
        <td width="40" align="center">
            <span class="style2">序号</span>
        </td>
        <td width="390" align="center">
            <span class="style2">帖子问题</span>
        </td>
        <td width="79" align="center">
            <span class="style2">操作</span>
        </td>
    </tr>
    <c:forEach var="title" items="${titleList}" varStatus="no">
        <tr>
            <td align="center"><c:out value="${no.count}"/></td>
            <td align="center"><c:out value="${title.title}"/></td>
            <td align="center">
                <a href="TitleManagerServlet?id=<c:out value='${title.id}'/>&flag=_queryReply&count=<c:out value='${no.count}'/>">查看</a>
            </td>
        </tr>
    </c:forEach>
</table>
</body>
</html>