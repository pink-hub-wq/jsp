<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>公告</title>
<script type="text/javascript" src="inc/jquery.js"></script>
<script type="text/javascript">
$(function(){
	var timer = true; //执行向上或向下的开关
	var liindex = 0;//LI的索引
	var $div = $(".byc").find("div");	
	//每隔三秒执行一次变换LI的内容
    var set1 = setInterval(function(){
	ainbyc($div);
	liindex = 0;
	timer = !timer;
	},3000);
	//LI变换的方式，即每隔100ms，让下一个LI移动top值;
	function ainbyc(ds){
		var set2 = setInterval(function(){
			//所有的LI移动完毕，就清除
		  if(liindex == $div.length){
			clearInterval(set2);
			//向上
		  }else if(timer){
			ds.eq(liindex).animate({"top":0},100);
			//向下
		  }else{
			ds.eq(liindex).animate({"top":-25},100);
		  }
		  liindex++;
		},100);		
	}	
})
</script>
<style type="text/css">
	*{margin:0;padding:0;}
	.box1{width:200px;margin-top:15px;}
	ul.byc{list-style:none;}
	ul.byc li{font-size:13px;font-family:'Arial,宋体,楷体_GB2312';
	     position:relative;width:180px;height:30px;
	     overflow:hidden;border-bottom:1px #000000 dotted;}
	ul.byc li div{position:absolute;top:-25px;}
	ul.byc li div p{height:30px;}
	.notice{font-family:楷体_GB2312;margin-top:15px;font-size:14px;color:#666;}
	.tax{overflow:hidden;}
</style>
</head>
<body>

<div class="box1">
  <ul class="byc">
  	<li>
  		<div>
  		    <p>新英雄降临！</p>
  			<p>五月限时皮肤！</p>
  			
  		</div>
  	</li>
  	<li>
  		<div>
  		    <p>修复排位赛Bug！</p>
  			<p>全新游戏模式！</p>
  			
  		</div>
  	</li>
  	<li>
  		<div>
  		   <p>版本更新预告！</p>
  			<p>官方社区大赛！</p>
  			
  		</div>
  	</li>
  	<li>
  		<div>
  	     	<p>荣耀归来，周年庆典！</p>
  			<p>免费周末双倍经验！</p>
  			
  		</div>
  	</li>
  </ul>
</div>

</body>
</html>