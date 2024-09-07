<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="js/jquery-1.8.0.min.js"></script>
<script>
	function queryAllUser(){
		var name = $("#name").val();
		$.ajax({
			url:"UserServlet?opt=queryAllUser",
			type:"post",
			data:"name=" + name,
			success:function(data){
				var objList = eval(JSON.parse(data));
				$("#tbStus").empty();
				var trs = "<tr>";
				$.each(objList, function(i, v) {
					trs += "<td>" + v.id + "</td>";
					trs += "<td>" + v.userName + "</td>";
					trs += "<td>" + v.password + "</td>";
					trs += "<td>" + v.email + "</td>";
					trs += "</tr>";
				});
				$("#tbStus").append(trs);				
			}
		})
	}
</script>
</head>
<body>
${userName}用户，您好！<br/>
	<input type="text" id="name" name="name"/>
	<a href="#" onclick="return queryAllUser();">查找用户</a>
	<table id="tbStus">
	</table>
	<a href="UserServlet?opt=downloadExcel">导出Excel数据</a>
	<a href="UserServlet?opt=downloadTxt">导出Txt数据</a>
	<a href="UserServlet?opt=downloadWord">导出Word数据</a>
</body>
</html>