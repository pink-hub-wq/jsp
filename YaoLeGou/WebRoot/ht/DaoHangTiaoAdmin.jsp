<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
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
<link rel="Bookmark" href="/favicon.ico" >
<link rel="Shortcut Icon" href="/favicon.ico" />
<script type="text/javascript" src="../Js+JQuery/jquery-1.12.4.js"></script>
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
<title>导航条管理</title>
</head>
<body>
<nav class="breadcrumb"><i class="Hui-iconfont">&#xe67f;</i> 首页管理 <span class="c-gray en">&gt;</span> 导航条管理 <a class="btn btn-success radius r" style="line-height:1.6em;margin-top:3px" href="javascript:location.replace(location.href);" title="刷新" ><i class="Hui-iconfont">&#xe68f;</i></a></nav>
<div class="page-container">
	<!-- <div class="text-c">
		<input type="text" class="input-text" style="width:450px" placeholder="导航条名称" id="" name="">
		<button type="submit" class="btn btn-success" id="" name=""><i class="Hui-iconfont">&#xe665;</i> 搜索</button>
	</div> -->
	<div class="cl pd-5 bg-1 bk-gray mt-20"><a href="javascript:;" onclick="window.open('AddDaoHangTiao.jsp','_self')" class="btn btn-primary radius"><i class="Hui-iconfont">&#xe600;</i> 添加导航条</a></span> <span class="r">共有数据：<strong>${DaoHangTiaoList.size() }</strong> 条</span> </div>
	<table class="table table-border table-bordered table-bg">
		<thead>
			<tr>
				<th scope="col" colspan="9">导航条列表</th>
			</tr>
			<tr class="text-c">
				<th width="25"><input type="checkbox" name="" value=""></th>
				<th width="40">Id</th>
				<th width="150">导航条名称</th>
				<th width="90">Uri连接</th>
				<th width="130">加入时间</th>
				<th width="100">是否已启用</th>
				<th width="100">操作</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${DaoHangTiaoList }" var="ddhtl">
				<c:if test="${ddhtl.istingyong == 0 }">
					<tr class="text-c">
						<td><input type="checkbox" value="1" name=""></td>
						<td>${ddhtl.id }</td>
						<td>${ddhtl.daohangtiaoname }</td>
						<td>${ddhtl.href }</td>
						<td>${ddhtl.createtime }</td>
						<td class="td-status"><span class="label label-success radius">已启用</span></td>
						<td class="td-manage">
							<a style="text-decoration:none" onClick="admin_stop(this,'10001',${ddhtl.id })" href="javascript:;" title="停用">
								<i class="Hui-iconfont">&#xe631;</i>
							</a> 
							<a title="编辑" href="javascript:;" onclick="admin_edit('导航条编辑','DaoHangTiao.do?State=SelectUpdate&id=${ddhtl.id }',id,'360','250')" class="ml-5" style="text-decoration:none">
								<i class="Hui-iconfont">&#xe6df;</i>
							</a> 
							<a title="删除" href="javascript:;" onclick="admin_del(this,'1',${ddhtl.id })" class="ml-5" style="text-decoration:none">
								<i class="Hui-iconfont">&#xe6e2;</i>
							</a>
						</td>
					</tr>
				</c:if>
				<c:if test="${ddhtl.istingyong == 1 }">
					<tr class="text-c">
						<td><input type="checkbox" value="1" name=""></td>
						<td>${ddhtl.id }</td>
						<td>${ddhtl.daohangtiaoname }</td>
						<td>${ddhtl.href }</td>
						<td>${ddhtl.createtime }</td>
						<td class="td-status"><span class="label label-default radius">已禁用</span></td>
						<td class="td-manage"><a onclick="admin_start(this,id,${ddhtl.id })" href="javascript:;" title="启用" style="text-decoration:none"><i class="Hui-iconfont"></i></a> <a title="编辑" href="javascript:;" onclick="admin_edit('导航条编辑','UpdateDaoHangTiao.jsp',${ddhtl.id },'800','500')" class="ml-5" style="text-decoration:none"><i class="Hui-iconfont"></i></a> <a title="删除" href="javascript:;" onclick="admin_del(this,'1',${ddhtl.id })" class="ml-5" style="text-decoration:none"><i class="Hui-iconfont"></i></a></td>
					</tr>
				</c:if>
			</c:forEach>
		</tbody>
	</table>
</div>
<!--_footer 作为公共模版分离出去-->
<script type="text/javascript" src="lib/jquery/1.9.1/jquery.min.js"></script> 
<script type="text/javascript" src="lib/layer/2.4/layer.js"></script>
<script type="text/javascript" src="static/h-ui/js/H-ui.min.js"></script> 
<script type="text/javascript" src="static/h-ui.admin/js/H-ui.admin.js"></script> <!--/_footer 作为公共模版分离出去-->

<!--请在下方写此页面业务相关的脚本-->
<script type="text/javascript" src="lib/My97DatePicker/4.8/WdatePicker.js"></script> 
<script type="text/javascript" src="lib/datatables/1.10.0/jquery.dataTables.min.js"></script> 
<script type="text/javascript" src="lib/laypage/1.2/laypage.js"></script>
<script type="text/javascript">
/*
	参数解释：
	title	标题
	url		请求的url
	id		需要操作的数据id
	w		弹出层宽度（缺省调默认值）
	h		弹出层高度（缺省调默认值）
*/
/*管理员-增加*/
function admin_add(title,url,w,h){
	layer_show(title,url,w,h);
}
/*管理员-删除*/
function admin_del(obj,id,Id){
	layer.confirm('确认要删除吗？',function(index){
		$.ajax({
			type: 'POST',
			url: 'DaoHangTiao.do?State=del',
			data : {"Id":Id},
			dataType: "json",
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

/*管理员-编辑*/
function admin_edit(title,url,id,w,h){
	layer_show(title,url,w,h);
}
/*管理员-停用*/
function admin_stop(obj,id,BannerId){
	layer.confirm('确认要停用吗？',function(index){
		//此处请求后台程序，下方是成功后的前台处理……
		$.post("DaoHangTiao.do?State=UpdateState",{"BannerId":BannerId,"Is":"停用"},function (){
			$(obj).parents("tr").find(".td-manage").prepend("<a onClick='admin_start(this,id,"+BannerId+")' href='javascript:;' title='启用' style='text-decoration:none'><i class='Hui-iconfont'>&#xe615;</i></a>");
			$(obj).parents("tr").find(".td-status").html("<span class='label label-default radius'>已禁用</span>");
			$(obj).remove();
			layer.msg('已停用!',{icon: 5,time:1000});
		})
		
	});
}

/*管理员-启用*/
function admin_start(obj,id,BannerId){
	layer.confirm('确认要启用吗？',function(index){
		//此处请求后台程序，下方是成功后的前台处理……
		$.post("DaoHangTiao.do?State=UpdateState",{"BannerId":BannerId,"Is":"启用"},function (){
			$(obj).parents("tr").find(".td-manage").prepend("<a onClick='admin_stop(this,id,"+BannerId+")' href='javascript:;' title='停用' style='text-decoration:none'><i class='Hui-iconfont'>&#xe631;</i></a>");
			$(obj).parents("tr").find(".td-status").html("<span class='label label-success radius'>已启用</span>");
			$(obj).remove();
			layer.msg('已启用!', {icon: 6,time:1000});
		})
	});
}
</script>
</body>
</html>