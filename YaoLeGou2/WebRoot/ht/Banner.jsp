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
<!--[if lt IE 9]>
<script type="text/javascript" src="lib/html5shiv.js"></script>
<script type="text/javascript" src="lib/respond.min.js"></script>
<![endif]-->
<link rel="stylesheet" type="text/css" href="static/h-ui/css/H-ui.min.css" />
<link rel="stylesheet" type="text/css" href="static/h-ui.admin/css/H-ui.admin.css" />
<link rel="stylesheet" type="text/css" href="lib/Hui-iconfont/1.0.8/iconfont.css" />
<link rel="stylesheet" type="text/css" href="static/h-ui.admin/skin/default/skin.css" id="skin" />
<link rel="stylesheet" type="text/css" href="static/h-ui.admin/css/style.css" />
<script type="text/javascript" src="../Js+JQuery/jquery-1.12.4.js"></script>
<!--[if IE 6]>
<script type="text/javascript" src="lib/DD_belatedPNG_0.0.8a-min.js" ></script>
<script>DD_belatedPNG.fix('*');</script>
<![endif]-->
<title>管理员列表</title>
</head>
<body>
<nav class="breadcrumb"><i class="Hui-iconfont">&#xe67f;</i> 首页管理 <span class="c-gray en">&gt;</span> Banner管理 <a class="btn btn-success radius r" style="line-height:1.6em;margin-top:3px" href="javascript:location.replace(location.href);" title="刷新" ><i class="Hui-iconfont">&#xe68f;</i></a></nav>
<div class="page-container">
	<!-- <div class="text-c">
		<input type="text" class="input-text" style="width:450px" placeholder="输入Banner图备注" id="" name="">
		<button type="submit" class="btn btn-success" id="" name=""><i class="Hui-iconfont">&#xe665;</i> 走一发</button>
	</div> -->
	<div class="cl pd-5 bg-1 bk-gray mt-20">  <a href="javascript:;" onclick="window.open('AddBanner.jsp','_self')" class="btn btn-primary radius"><i class="Hui-iconfont">&#xe600;</i> 添加Banner图</a></span> <span class="r">共有数据：<strong>${Bannerlist.size() }</strong> 条</span> </div>
	<table class="table table-border table-bordered table-bg">
		<thead>
			<tr>
				<th scope="col" colspan="9">Banner图列表</th>
			</tr>
			<tr class="text-c">
				<th width="25"><input type="checkbox" name="" value=""></th>
				<th width="40">ID</th>
				<th width="200">Banner图</th>
				<th width="90">背景颜色</th>
				<th>Uri连接</th>
				<th>备注</th>
				<th width="130">创建时间</th>
				<th width="100">是否已启用</th>
				<th width="100">操作</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${Bannerlist }" var="bl">
				<c:if test="${bl.istingyong == 0 }">
					<tr class="text-c">
						<td><input type="checkbox" value="1" name=""></td>
						<td>${bl.id }</td>
						<td><img src="../${bl.image }" width="200px" height="100px;"></td>
						<td><div style="width: 20px;height: 20px;background: ${bl.bgcolor };float:left"></div>${bl.bgcolor }</td>
						<td>${bl.href }</td>
						<td>${bl.beizhu }</td>
						<td>${bl.createtime }</td>
						<td class="td-status"><span class="label label-success radius">已启用</span></td>
						<td class="td-manage"><a style="text-decoration:none" onClick="admin_stop(this,'10001',${bl.id})" href="javascript:;" title="停用"><i class="Hui-iconfont">&#xe631;</i></a>  <a title="删除" href="javascript:;" onclick="admin_del(this,'1',${bl.id })" class="ml-5" style="text-decoration:none"><i class="Hui-iconfont">&#xe6e2;</i></a></td>
					</tr>
				</c:if>
				<c:if test="${bl.istingyong == 1 }">
					<tr class="text-c">
						<td><input type="checkbox" value="2" name=""></td>
						<td>${bl.id }</td>
						<td><img src="../${bl.image }" width="200px" height="100px;"></td>
						<td><div style="width: 20px;height: 20px;background: ${bl.bgcolor };float:left"></div>${bl.bgcolor }</td>
						<td>${bl.href }</td>
						<td>${bl.beizhu }</td>
						<td>${bl.createtime }</td>
						<td class="td-status"><span class="label radius">已停用</span></td>
						<td class="td-manage"><a style="text-decoration:none" onClick="admin_start(this,'10001',${bl.id})" href="javascript:;" title="启用"><i class="Hui-iconfont">&#xe615;</i></a> <a title="删除" href="javascript:;" onclick="admin_del(this,'1',${bl.id})" class="ml-5" style="text-decoration:none"><i class="Hui-iconfont">&#xe6e2;</i></a></td>
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
function admin_del(obj,id,BannerId){
	layer.confirm('确认要删除吗？',function(index){
		$.post("Banner.do?State=del",{"BannerId":BannerId},function (Data){
			$(obj).parents("tr").remove();
			layer.msg('已删除!',{icon:1,time:1000});
		})		
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
		
		$(obj).parents("tr").find(".td-manage").prepend('<a onClick="admin_start(this,0,'+BannerId+')" href="javascript:;" title="启用" style="text-decoration:none"><i class="Hui-iconfont">&#xe615;</i></a>');
		$(obj).parents("tr").find(".td-status").html('<span class="label radius">已停用</span>');
		$(obj).remove();
		$.post("Banner.do?State=Update",{"BannerId":BannerId,"Is":"停用"},function (){
			layer.msg('已停用!',{icon: 5,time:1000});
		})
	});
}

/*管理员-启用*/
function admin_start(obj,id,BannerId){
	layer.confirm('确认要启用吗？',function(index){
		//此处请求后台程序，下方是成功后的前台处理……
		
		
		$(obj).parents("tr").find(".td-manage").prepend('<a onClick="admin_stop(this,0,'+BannerId+')" href="javascript:;" title="停用" style="text-decoration:none"><i class="Hui-iconfont">&#xe631;</i></a>');
		$(obj).parents("tr").find(".td-status").html('<span class="label label-success radius">已启用</span>');
		$(obj).remove();
		$.post("Banner.do?State=Update",{"BannerId":BannerId,"Is":"启用"},function (){
			layer.msg('已启用!', {icon: 6,time:1000});
		})
	});
}


</script>
</body>
</html>