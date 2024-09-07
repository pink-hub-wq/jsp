<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>订单信息</h1>
订单编号：${order.orderId }<br/>
订单金额：${totalAmount }<br/>
创建时间：${order.createDtm }<br/>
请记住你的订单编号
<a href="ShopInfoServlet?opt=queryAllShopInfo2">返回购物</a>
</body>
</html>