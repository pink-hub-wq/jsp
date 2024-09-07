<%@page import="java.util.List"%>
<%@page import="com.edu.seiryo.entity.Shopping"%>
<%@page import="java.util.HashSet"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
    // 获取购物车中商品
    HashSet<Shopping> shoppingCar = (HashSet<Shopping>) session.getAttribute("carSet");
    // 获取同一商品被重复存放的次数
    List<Integer> timesList = (List<Integer>) session.getAttribute("timesList");
%>
    <div style="font-size:16px; font-family: 黑体;">购物车</div>
    <br />
    <table width="550" height="200" cellspacing="0" cellpadding="0" class="tong">
        <tr height="20">
            <td align="center" width="56" id="bortop1">
                <div class="liTi">
                    <div class="neiDiv">序号</div>
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
            <td align="center" width="120" id="bortop1">
                <div class="liTi">
                    <div class="neiDiv">个数</div>
                </div>
            </td>
        </tr>
        <%
            int count = 0;
            int i = 0;
            for (Shopping shopping : shoppingCar) {
                int times = timesList.get(i);
                count += times * shopping.getPrice();
        %>
        <tr onMouseOver="this.bgColor='#E8F7FF'" onMouseOut="this.bgColor='#FFFFFF'">
            <td id="borl" align="center"><%= (++i) %></td>
            <td id="borl" align="center"><%= shopping.getGoodsId()%></td>
            <td id="borl" align="center"><%= shopping.getGoodsName() %></td>
            <td id="borl" align="center"><%= shopping.getPrice() %></td>
            <td id="bor2" align="center"><%= times %></td>
        </tr>
        <%
        	System.out.println(times);
            }
        %>
    </table>
    <br />
    <div style="font-size:14px">总计: <%= count %></div>
</body>
</html>