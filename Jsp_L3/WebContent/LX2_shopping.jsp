<%@page import="com.edu.seiryo.util.DBUtil,java.sql.ResultSet"%>
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
        DBUtil dbUtil = new DBUtil();
        request.setCharacterEncoding("UTF-8");
        String type = request.getParameter("type");
        String name = request.getParameter("name");
        String sql = "select * from t_goods where 1 = 1 ";
        if(!"".equals(type)){
        	sql += "and type like '%" + type + "%'";

        }
        if(!"".equals(name)){
        	sql += "and name like '%" + name + "%'";

        }
        ResultSet resultSet = null;
        try {
        	resultSet = dbUtil.excuteQuery(sql);
        } catch (Exception e) {
            e.printStackTrace();
        }
    %>
    <center>
        <table style="margin-top:20px" cellspacing="0" border="1px" width="500px" height="200px">
            <tr>
                <td align="center">商品编号</td>
                <td align="center">商品名</td>
                <td align="center">生产日期</td>
                <td align="center">产地</td>
                <td align="center">商品类型</td>
                <td align="center">操作</td>
            </tr>
            <%
                  try {
                        while (resultSet.next()) {
            %>
            <tr>
                <td align="center"><%= resultSet.getString("no") %></td>
                <td align="center"><%= resultSet.getString("name") %></td>
                <td align="center"><%= resultSet.getString("time") %></td>
                <td align="center"><%= resultSet.getString("address") %></td>
                <td align="center"><%= resultSet.getString("type") %></td>
                
                <td align="center">
               		 <form action="LX2_shopping2.jsp" method = "post">
               			 <input type = "submit" value = "修改"></td>
               			 <input type = "hidden" name = "no" value = <%= resultSet.getString("no") %>>
              	 	</form>
            </tr>
            <%
                       }
                   } catch (Exception e) {
                       e.printStackTrace();
                   } finally {
                       try {
                       	 dbUtil.close();
                       } catch (Exception e) {
                           e.printStackTrace();
                       }
                   }               
            %>
        </table>
    </center>
</body>
</html>