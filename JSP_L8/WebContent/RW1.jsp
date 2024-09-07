<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
    <form name="form1" method="post" action="RW1.jsp">
        <table width="483" border="1" cellpadding="0" cellspacing="0" align="center">
            <tr align="center">
                <td colspan="2">使用 EL实现购物找零功能</td>
            </tr>
            <tr>
                <td width="109">商品单价：</td>
                <td width="156">
                    <input name="price" type="text" id="price" value="${param.price}">
                </td>
            </tr>
            <tr>
                <td>购买数量：</td>
                <td>
                    <input name="quantity" type="text" id="quantity" value="${param.quantity}">
                </td>
            </tr>
            <tr>
                <td>实付款：</td>
                <td>
                    <input name="realPay" type="text" id="realPay" value="${param.realPay}">
                </td>
            </tr>
            <tr>
                <td>应付款：</td>
                <td>
                    <span class="style3">￥${param.price * param.quantity}元</span>
                </td>
            </tr>
            <tr>
                <td>找零：</td>
                <td>
                    <span class="style3">￥${param.realPay - (param.price * param.quantity)}元</span>
                </td>
            </tr>
            <tr align="right">
                <td colspan="2">
                    <input type="submit" name="submit" value="计算">
                    <input type="reset" name="reset" value="重置">
                </td>
            </tr>
        </table>
    </form>
</body>
</html>