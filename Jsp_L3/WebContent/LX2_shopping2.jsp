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
        String no = request.getParameter("no");
        String sql = "select * from t_goods where no = ? ";
        ResultSet resultSet = null;
        try {
        	resultSet = dbUtil.excuteQuery(sql,no);
        } catch (Exception e) {
            e.printStackTrace();
        }
    %>
    <center>
        <table style="margin-top:20px" cellspacing="0" border="1px" width="500px" height="200px">
            <tr>
                <td align="center">商品编号</td>
                <td align="center">商品名</td>
                <td align="center">产地</td>
                <td align="center">商品类型</td>
                <td align="center">操作</td>
            </tr>
            <%
                  try {
                        if (resultSet.next()) {
            %>
            <tr>
               <form action="LX2_updateShopping.jsp" method="post">
                    <td align="center"><input type="text" name="no" value="<%= resultSet.getString("no") %>"></td>
                    <td align="center"><input type="text" name="name" value="<%= resultSet.getString("name") %>"></td>
                    <td align="center"><input type="text" name="address" value="<%= resultSet.getString("address") %>"></td>
                    <td align="center"><input type="text" name="type" value="<%= resultSet.getString("type") %>"></td>
                    <td align="center">
                        <input type="submit" value="修改">
                    </td>
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