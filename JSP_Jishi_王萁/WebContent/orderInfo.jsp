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
function updateStatus(orderId, newState) {
    $.ajax({
        url: 'OrderServlet?opt=update',
        type: 'post',
        data: {
            orderId: orderId,
            newState: newState
        },
        success: function(data) {
            if (data && data.orders) {
                $.each(data.orders, function(i, v) {
                    $("#status-" + v.orderId).text(getStateText(v.state));
                });
            }
        },
    });
}

function getStateText(state) {
    switch(state) {
        case 0: 
        	return '待审核';
        case 1: 
        	return '已审核';
        case 2: 
        	return '已付款';
        case 3: 
        	return '已发货';
    }
}
function queryOrderDetails(orderId) {
    $.ajax({
        url: 'OrderDetailServlet?opt=queryOrderDetailById',
        type: 'post',
        data: { orderId: orderId },
        success: function(data) {
        	var details = data.details;
            var detailsTable = $('#detailsTable tbody');
            var totalAmount = 0;
            detailsTable.empty();
            $.each(details, function(index, detail) {
            	var amount = detail.quantity * detail.price;
                totalAmount += amount; 
                var row = '<tr>' +
                          '<td>' + detail.shopId + '</td>' +
                          '<td>' + detail.shopName + '</td>' +
                          '<td>' + detail.quantity + '</td>' +
                          '<td>' + detail.price.toFixed(2) + '</td>' +
                          '<td>' + (detail.quantity * detail.price).toFixed(2) + '</td>' +
                          '</tr>';
                detailsTable.append(row);
            });
            $('#totalAmount').text(totalAmount.toFixed(2));
            $('#orderDetails').show();
        }
    });
}

</script>
</head>
<body>
	<h1>后台订单管理</h1>
    <table border="1">
    <tr>
        <th>订单编号</th>
        <th>日期</th>
        <th>状态</th>
        <th>修改状态</th>
        <th>查看明细</th>
    </tr>
    <c:forEach items="${OrderList}" var="order">
    <tr>
        <td>${order.orderId}</td>
        <td>${order.createDtm}</td>
        <td id="status-${order.orderId}">
           <c:choose>
                <c:when test="${order.state == 0}">待审核</c:when>
                <c:when test="${order.state == 1}">已审核</c:when>
                <c:when test="${order.state == 2}">已付款</c:when>
                <c:when test="${order.state == 3}">已发货</c:when>
            </c:choose>
        </td>
        <td>
            <a href="#" onclick="updateStatus('${order.orderId}', 0)">待审核</a> |
            <a href="#" onclick="updateStatus('${order.orderId}', 1)">已审核</a> |
            <a href="#" onclick="updateStatus('${order.orderId}', 2)">已付款</a> |
            <a href="#" onclick="updateStatus('${order.orderId}', 3)">已发货</a>
        </td>
        <td><a href="#" onclick="queryOrderDetails('${order.orderId}'); return false;">查看明细</a></td>
    </tr>
    </c:forEach>
</table>
	<div id="orderDetails" style="display:none;">
    <table id="detailsTable" border="1">
        <thead>
            <tr>
                <th>编号</th>
                <th>商品名称</th>
                <th>数量</th>
                <th>单价</th>
                <th>总金额</th>
            </tr>
        </thead>
        <tbody>
        </tbody>
    </table>
</div>
	<div id="totalAmountDisplay" style="margin-top: 20px; font-size: 16px;">
    总金额: <span id="totalAmount">0.00</span> 元
</div>
</body>
</html>