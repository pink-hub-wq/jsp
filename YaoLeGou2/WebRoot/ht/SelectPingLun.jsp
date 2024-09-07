﻿<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML>
<html>
<head>
<meta charset="utf-8">
<meta name="renderer" content="webkit|ie-comp|ie-stand">
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
<meta name="viewport" content="width=device-width,initial-scale=1,minimum-scale=1.0,maximum-scale=1.0,user-scalable=no" />
<meta http-equiv="Cache-Control" content="no-siteapp" />
<!--[if lt IE 9]>
<script type="text/javascript" src="lib/html5shiv.js"></script>
<script type="text/javascript" src="lib/respond.min.js"></script>
<![endif]-->
<link rel="stylesheet" type="text/css" href="static/h-ui/css/H-ui.min.css" />
<link rel="stylesheet" type="text/css" href="static/h-ui.admin/css/H-ui.admin.css" />
<link rel="stylesheet" type="text/css" href="lib/Hui-iconfont/1.0.8/iconfont.css" />
<link rel="stylesheet" type="text/css" href="static/h-ui.admin/skin/default/skin.css" id="skin" />
<link rel="stylesheet" type="text/css" href="static/h-ui.admin/css/style.css" />
<!--[if IE 6]>
<script type="text/javascript" src="lib/DD_belatedPNG_0.0.8a-min.js" ></script>
<script>DD_belatedPNG.fix('*');</script>
<![endif]-->

<title>查看评论列表</title>
<script type="text/javascript" src="../Js+JQuery/jquery-1.12.4.js"></script>
</head>
<body>
<nav class="breadcrumb"><i class="Hui-iconfont">&#xe67f;</i> 商品管理 <span class="c-gray en">&gt;</span> 查看评论列表 <a class="btn btn-success radius r" style="line-height:1.6em;margin-top:3px" href="javascript:location.replace(location.href);" title="刷新" ><i class="Hui-iconfont">&#xe68f;</i></a></nav>
<div class="page-container">
	<div class="text-c">
	<form action="PingLun.do">
		<input type="text" class="input-text" style="width:450px" placeholder="输入关键词（昵称/评论内容）" id="" value="${text==null?'':text }" name="text">
		<button type="submit" class="btn btn-success radius" id="" name=""><i class="Hui-iconfont">&#xe665;</i> 搜评论</button>
	</form>
	</div>
	<form action="PingLun.do?State=delAll" method="post" id="biaodan">
		<div class="cl pd-5 bg-1 bk-gray mt-20"> <span class="l"><a href="javascript:;" onclick="piliang()" class="btn btn-danger radius"><i class="Hui-iconfont">&#xe6e2;</i> 批量删除</a> </span> <span class="r">共有数据：<strong>${PingLunDao.size() }</strong> 条</span> </div>
		<div class="mt-20">
			<table class="table table-border table-bordered table-hover table-bg table-sort">
				<thead>
					<tr class="text-c">
						<th width="25"><input type="checkbox" name="" value=""></th>
						<th width="60">ID</th>
						<th width="60">头像</th>
						<th width="130">用户名</th>
						<th>评论内容</th>
						<th width="100">评论时间</th>
						<th width="100">操作</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach items="${PingLunDao }" var="pld">
						<tr class="text-c">
							<td><input type="checkbox" value="1" name="xuanze"></td>
							<td>${pld.id }</td>
							<td><a href="javascript:;"><i class="avatar size-L radius"><img alt="" src="../${pld.ui.image }"></i></a></td>
							<td>${pld.ui.usernick }</td>
							<td class="text-l" style="width: 700px;cursor: pointer;"  onclick="window.open('../ShangYi.do?State=Select&ShopId=${pld.shopid }')">${pld.context }</td>
							<td>${pld.createtime }</td>
							<td class="td-manage"><!-- <a title="编辑" href="javascript:;" onclick="member_edit('编辑','member-add.html','4','','510')" style="text-decoration:none"><i class="Hui-iconfont">&#xe6df;</i> --></a> <a title="删除" href="javascript:;" onclick="member_del(this,${pld.id })" class="ml-5" style="text-decoration:none"><i class="Hui-iconfont">&#xe6e2;</i></a></td>
							<td style="display: none"><input type="hidden" name="pinglunid" value=""></td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
		</div>
	</form>
</div>

<!--_footer 作为公共模版分离出去-->
<script type="text/javascript" src="lib/jquery/1.9.1/jquery.min.js"></script> 
<script type="text/javascript" src="lib/layer/2.4/layer.js"></script>  
<script type="text/javascript" src="static/h-ui/js/H-ui.min.js"></script> 
<script type="text/javascript" src="static/h-ui.admin/js/H-ui.admin.js"></script> <!--/_footer /作为公共模版分离出去-->

<!--请在下方写此页面业务相关的脚本-->
<script type="text/javascript" src="lib/My97DatePicker/4.8/WdatePicker.js"></script> 
<script type="text/javascript" src="lib/datatables/1.10.0/jquery.dataTables.min.js"></script> 
<script type="text/javascript" src="lib/laypage/1.2/laypage.js"></script>
<script type="text/javascript">
$(function(){
	$('.table-sort').dataTable({
		"aaSorting": [[ 1, "desc" ]],//默认第几个排序
		"bStateSave": true,//状态保存
		"aoColumnDefs": [
		  //{"bVisible": false, "aTargets": [ 3 ]} //控制列的隐藏显示
		  {"orderable":false,"aTargets":[0,2,4]}// 制定列不参与排序
		]
	});

});
/*用户-添加*/
function member_add(title,url,w,h){
	layer_show(title,url,w,h);
}
/*用户-查看*/
function member_show(title,url,id,w,h){
	layer_show(title,url,w,h);
}
/*用户-停用*/
function member_stop(obj,id){
	layer.confirm('确认要停用吗？',function(index){
		$(obj).parents("tr").find(".td-manage").prepend('<a style="text-decoration:none" onClick="member_start(this,id)" href="javascript:;" title="启用"><i class="Hui-iconfont">&#xe6e1;</i></a>');
		$(obj).parents("tr").find(".td-status").html('<span class="label label-defaunt radius">已停用</span>');
		$(obj).remove();
		layer.msg('已停用!',{icon: 5,time:1000});
	});
}

/*用户-启用*/
function member_start(obj,id){
	layer.confirm('确认要启用吗？',function(index){
		$(obj).parents("tr").find(".td-manage").prepend('<a style="text-decoration:none" onClick="member_stop(this,id)" href="javascript:;" title="停用"><i class="Hui-iconfont">&#xe631;</i></a>');
		$(obj).parents("tr").find(".td-status").html('<span class="label label-success radius">已启用</span>');
		$(obj).remove();
		layer.msg('已启用!',{icon: 6,time:1000});
	});
}
/*用户-编辑*/
function member_edit(title,url,id,w,h){
	layer_show(title,url,w,h);
}
/*密码-修改*/
function change_password(title,url,id,w,h){
	layer_show(title,url,w,h);	
}
/*用户-删除*/
function member_del(obj,id){
	layer.confirm('确认要删除吗？',function(index){
		$.ajax({
			type: 'POST',
			url: 'PingLun.do?State=del&id='+id,
			success: function(data){
				$(obj).parents("tr").remove();
				layer.msg('已删除!',{icon:1,time:1000});
			},
			error:function(data) {
				console.log(data.msg);
			},
		});		
	});
}

function piliang(){
	//选择name=xuanze的元素
	var xuanze = document.getElementsByName("xuanze");
	for (var i = 0; i < xuanze.length; i++) {
		//如果name=xuanze元素==true，被勾选上
		if(xuanze[i].checked == true){
			//xuanze[i]获取多选按钮，获取按钮的父级元素
			//$(xuanze[i]).parent(),获取的值td
			//$(xuanze[i]).parent().next()获取的是当前元素的父级的下一个元素
			//$(xuanze[i]).parent().next().html()获取当前元素的文本内容
			var id = $(xuanze[i]).parent().next().html();
			$(xuanze[i]).parent().parent().children().eq(7).children().eq(0).val(id);
		}
		
	}
	$("#biaodan").submit();
}
</script>
</body>
</html>