<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="com.edu.seiryo.entity.User2,java.util.*"%>
<%@ page import="java.net.URLEncoder" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<center>
<body>
    <div>
        <table width="650" height="400" cellspacing="0" cellpadding="0" class="tong">
            <tr height="20">
                <td align="center" width="56" id="bortop1">
                    <div class="liTi">
                        <div class="neiDiv">序号</div>
                    </div>
                </td>
                <td align="center" width="120" id="bortopl">
                    <div class="liTi">
                        <div class="neiDiv">用户名</div>
                    </div>
                </td>
                <td align="center" width="80" id="bortop1">
                    <div class="liTi">
                        <div class="neiDiv">性别</div>
                    </div>
                </td>
                <td align="center" width="120" id="bortopl">
                    <div class="liTi">
                        <div class="neiDiv">出生日期</div>
                    </div>
                </td>
                <td align="center" width="130" id="bortop2">
                    <div class="liTi">
                        <div class="neiDiv">公司名称</div>
                    </div>
                </td>
                <td align="center" width="120" id="bortop2">
                    <div class="liTi">
                        <div class="neiDiv">操作</div>
                    </div>
                </td>
            </tr>
            <%
                List<User2> userList = (List<User2>) request.getAttribute("list");
                for (int i = 0; i < userList.size(); i++) {
                    User2 user = userList.get(i);
            %>
            <tr onMouseOver="this.bgColor='#E8F7FF'" onMouseOut="this.bgColor='#FFFFFF'">
                <td id="borl" align="center"><%= (i + 1) %></td>
                <td id="borl" align="center"><%= user.getUserName()%></td>
                <td id="bor1" align="center"><%= user.getSex() %></td>
                <td id="bor1" align="center"><%= user.getBirthday() %></td>
                <td id="borr" align="center"><%= user.getCompany() %></td>
                <td id="bor2" align="center">
                    <form action="DeleteUserServlet" method="post" style="display: inline;">
   						 <input type="hidden" name="account" value="<%= user.getUserName() %>">
   						 <button type="submit">删除信息</button>
					</form>
                </td>
            </tr>
            <%
                }
                
            %>
            <tr>
            	<td collspan = "6">
            		<center>
            			<form action="InvalidateServlet" method="post" ">
   						 <button type="submit" value="注销" style="display: block; width: 100px; height: 50px;">注销</button>
					</form>
            		</center>
            	</td>
            </tr>
        </table>
    </div>
</body>
</center>
</body>
</html>