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
function updateNumber(obj) {
	var number = $(obj).parent().prev().prev();
    var currentNumber = number.text(); 
    var numberInput = $("<input type='text' value='" + currentNumber + "'/>");
    var updateInput = $("<input type='button' value='保存' onclick='updateShopInfoNumber(this)'/>");
    number.html(numberInput);
    number.append(updateInput); 
    $(obj).hide();
}

function updateShopInfoNumber(obj) {
	var id = $(obj).closest('tr').find('.shop-id').text();
	var number = $(obj).closest('tr').find('input[type="text"]').val();
    window.location.href = "ShopInfoServlet?opt=updateShopInfoNumber&shopId=" + id + "&number=" + number;
}
function deleteShopInfo(obj) {
	var id = $(obj).closest('tr').find('.shop-id').text();
    window.location.href = "ShopInfoServlet?opt=deleteShopInfo&shopId=" + id;
}
</script>
</head>
<body>
	<table border="1px">
		<tr>
			<td colspan="5">购物车商品列表</td>
			<td colspan="2"><a href="ShopInfoServlet?opt=queryAllShopInfo2">返回继续购物</a></td>
		</tr>
		<tr>
			<td>编号</td>
			<td>商品名称</td>
			<td>单价</td>
			<td>数量</td>
			<td>总金额</td>
			<td colspan="2">操作</td>
		</tr>
		<c:set var="totalAmount" value="0.0" />
		<c:forEach var="cart" items="${list}">
			<tr>
				<td class="shop-id">${cart.id}</td>
				<td>${cart.shomName }</td>
				<td>${cart.price }</td>
				<td>${cart.number }</td>
				<td>${cart.totalPrice }</td>
				<td><a href="#" onclick="updateNumber(this); return false;">修改数量</a></td>
				<td><a href="#" onclick="deleteShopInfo(this); return false;">退回此商品</a></td>
				
			</tr>
			 <c:set var="totalAmount" value="${totalAmount + cart.totalPrice}" />
		</c:forEach>
		<tr>
			<td colspan="4"><a href="ShopInfoServlet?opt=clearCart">清空购物车</a></td>
			<td colspan="3">购物车总金额：${totalAmount }</td>
		</tr>
		<tr>
            <td colspan="7">
                <form action="OrderServlet?opt=creatOrder" method="post">
                    <input type="hidden" name="opt" value="creatOrder"/>
                    <input type="hidden" name="totalAmount" value="${totalAmount}"/>
                    <input type="submit" value="生成订单"/>
                </form>
            </td>
        </tr>
	</table>
</body>
</html>