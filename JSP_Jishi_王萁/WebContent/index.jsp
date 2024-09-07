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
window.onload = function() {
    if (!sessionStorage.getItem('first')) {
        sessionStorage.setItem('first', 'true');
        window.location.href = "ShopInfoServlet?opt=queryAllShopInfo";
    }
};

function queryStatus() {
	event.preventDefault();
	var orderId = $("#orderId").val();
    $.ajax({
        url: 'OrderServlet?opt=queryStatus',
        type: 'post',
        data: {
        	orderId: orderId 
        },
        success: function(data) {
            $('#msg').text(data);
        }
    });
}
</script>
</head>
<body>
<h1>订单查询</h1>
    <form>
        输入订单号：<input type="text" name="orderId" id="orderId">
        <input type="submit" value="查询" onclick="queryStatus(); return false;">
    </form>
	<span id="msg"></span>
<h1>商品查询</h1>
    <form action="ShopInfoServlet?opt=queryAllShopInfo2" method="post">
        输入关键字：<input type="text" name="shopname" id="shopname">
        <input type="submit" value="查询">
    </form>
	<span id="msg2"></span>
<h2>商品信息列表</h2>
<table border="1">
    <tr>
    	<th>编号：</th>
        <th>商品名：</th>
        <th>原价</th>
        <th>现价</th>
        <th>描述</th>
        <th>操作</th>
    </tr>
    <c:forEach items="${page.currentPagedText}" var="shopinfo">
        <tr>
        	<td>${shopinfo.shopId}</td>
            <td>${shopinfo.shopName}</td>
            <td>${shopinfo.oldPrice}</td>
            <td>${shopinfo.price}</td>
            <td>${shopinfo.descr}</td>
            <td><a href="ShopInfoServlet?opt=addCart&shopId=${shopinfo.shopId}&shopName=${shopinfo.shopName}&price=${shopinfo.price}">加入购物车</a></td>
        </tr>
    </c:forEach>
    <a href="ShopInfoServlet?opt=queryAllShopInfo2&&currentPage=1">首页</a>
    <a href="ShopInfoServlet?opt=queryAllShopInfo2&&currentPage=${ page.currentPage-1}">上一页</a>
    <a href="ShopInfoServlet?opt=queryAllShopInfo2&&currentPage=${ page.currentPage+1}">下一页</a>
    <a href="ShopInfoServlet?opt=queryAllShopInfo2&&currentPage=${page.totalPage }">末页</a>
  第${page.currentPage}页 / 共${page.totalPage }页
</table>	
</body>
</html>