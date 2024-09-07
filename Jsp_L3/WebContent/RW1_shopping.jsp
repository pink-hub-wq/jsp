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
        String sql = "select * from t_goods where type = ?";
        ResultSet resultSet = null;
        boolean bo= false;
        try {
        	resultSet = dbUtil.excuteQuery(sql, type);
        	if(resultSet.next()){
        		bo = true;
        	}
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
            </tr>
            <%
            if(!bo){
            
            %>
           		<td colspan="5" align="center">没有查询到商品信息</td>
            <%
           		}
            %>
            <%
                if (bo) {
                    try {
                        while (resultSet.next()) {
            %>
            <tr>
                <td align="center"><%= resultSet.getString("no") %></td>
                <td align="center"><%= resultSet.getString("name") %></td>
                <td align="center"><%= resultSet.getString("time") %></td>
                <td align="center"><%= resultSet.getString("address") %></td>
                <td align="center"><%= resultSet.getString("type") %></td>
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
                }
            %>
        </table>
    </center>
</body>
</html>