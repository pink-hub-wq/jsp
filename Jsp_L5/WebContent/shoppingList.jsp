<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@page import="com.edu.seiryo.servlet.*,com.edu.seiryo.entity.*,java.util.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>商品列表页面</title>
<link rel="stylesheet" type="text/css" href="css/list.css" />
<script>
    function seeCar() {
        window.location.href = "ShoppingCarServlet?flag=_seeCar";
    }

    function addCar() {
        var flag = false;
        var eles = document.getElementsByName("goods");
        for (var i = 0; i < eles.length; i++) {
            if (eles[i].checked) {
                flag = true;
                break;
            }
        }
        if (flag) {
            return true;
        } else {
            alert("对不起，您没有选择商品");
            return false;
        }
    }
</script>
</head>
<body>
    <div style="font-size:16px; font-family: 黑体;">商品信息列表</div>
    <form action="ShoppingCarServlet?flag=_addCar" method="post">
        <div style="float:left">
            <input type="submit" value="加入购物车" onclick="return addCar();" />
        </div>
        <table width="650" height="200" cellspacing="0" cellpadding="0" class="tong" style="clear:both; margin-top:30px">
            <tr height="20">
                <td align="center" width="56" id="bortop1">
                    <div class="liTi">
                        <div class="neiDiv">序号</div>
                    </div>
                </td>
                <td align="center" width="56" id="bortop1">
                    <div class="liTi">
                        <div class="neiDiv">选择</div>
                    </div>
                </td>
                <td align="center" width="120" id="bortop1">
                    <div class="liTi">
                        <div class="neiDiv">商品编号</div>
                    </div>
                </td>
                <td align="center" width="80" id="bortop1">
                    <div class="liTi">
                        <div class="neiDiv">商品名称</div>
                    </div>
                </td>
                <td align="center" width="120" id="bortop1">
                    <div class="liTi">
                        <div class="neiDiv">商品价格</div>
                    </div>
                </td>
                <td align="center" width="130" id="bortop2">
                    <div class="liTi">
                        <div class="neiDiv">出厂日期</div>
                    </div>
                </td>
                <td align="center" width="120" id="bortop2">
                    <div class="liTi">
                        <div class="neiDiv">商品类型</div>
                    </div>
                </td>
            </tr>
            <% 
                List<Shopping> shoppingList = (List<Shopping>)request.getAttribute("sl");
                if (shoppingList != null) {
                    for (int i = 0; i < shoppingList.size(); i++) {
                        Shopping goods = shoppingList.get(i);
            %>
            <tr onMouseOver="this.bgColor='#E8F7FF'" onMouseOut="this.bgColor='#FFFFFF'">
                <td id="borl" align="center"><%= (i + 1) %></td>
                <td id="borl" align="center">
                    <input type="checkbox" name="goods" value="<%= goods.getGoodsId() %>:<%= goods.getGoodsName() %>:<%= goods.getPrice() %>">
                </td>
                <td id="borl" align="center"><%= goods.getGoodsId() %></td>
                <td id="borl" align="center"><%= goods.getGoodsName() %></td>
                <td id="borl" align="center"><%= goods.getPrice() %></td>
                <td id="borl" align="center"><%= goods.getDate() %></td>
                <td id="borl" align="center"><%= goods.getType() %></td>
            </tr>
            <% 
                    }
                } else {
            %>
            <tr>
                <td colspan="7" align="center">暂无商品信息</td>
            </tr>
            <% 
                }
            %>
            <tr>
                <td colspan="7" align="right">
                    <input type="button" value="查看购物车" onclick="seeCar();" />
                </td>
            </tr>
        </table>
        <br />
        <% 
            String msg = (String) request.getAttribute("msg");
            if (msg != null) {
        %>
        <%= msg %>
        <% } %>
    </form>
</body>
</html>