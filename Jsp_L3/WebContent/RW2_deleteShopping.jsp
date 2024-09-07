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
        String sql = "delete from t_goods where no = ?";
        ResultSet resultSet = null;
        boolean bo= false;
        try {
        	bo = dbUtil.excuteUpdate(sql, no);
        	if(resultSet.next()){
        		bo = true;
        	}
        } catch (Exception e) {
            e.printStackTrace();
        }
    %>
    <center>
  
	            <%
	            if(!bo){
	            
	            %>
	           		<td align="center">没有查询到商品信息，删除失败</td>
	           		<td align="center"><a href = "RW2_search.jsp">返回查询页面</a></td>
	            <%
	           		}
	            %>
	            <%
	                if (bo) {
	           			response.sendRedirect("RW2_search.jsp");
	                 }
	            %>
	        </table>
		</form>
    </center>
</body>
</html>