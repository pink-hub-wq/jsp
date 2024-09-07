<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>健康保険のホームページ</title>
		<link rel="stylesheet" type="text/css" href="css/index.css" />
		<link rel="stylesheet" href="https://at.alicdn.com/t/c/font_3881267_wfv3iyzbijg.css">
		<link rel="stylesheet" href="https://cdn.staticfile.org/font-awesome/4.7.0/css/font-awesome.css">
		<script type="text/javascript" src="js/banner.js"></script>
		<script type="text/javascript" src="js/jquery-1.8.3.js"></script>
		<script type="text/javascript" src="js/shop.js"></script>
	</head>
	<body>
		<div align="center" id="div_all">
			<div id="top1">
				<div id="top1_text">
					<div id="top1_text1">こんにちは、健康保険モールへようこそ</div>
					<div id="top1_text2">
						<span id="span1">最新情報：</span>
						<marquee id="lb" direction="left">
							ログインしてサインするとプレゼントがあります
						</marquee>
						<a href="login.jsp">
							<button type="button" id="userlogin">login/regist</button>
						</a>
					</div>
				</div>
			</div>
			<div id="top2">
				<div id="top2_text">
					<ul id="top2_text_ul">
						<li id="li1"><a id="a0" href=""><b>すべての保険</b></a></li>
						<li><b>健康保険</b></li>
						<li><b>意外保険</b></li>
						<li><b>企業保険</b></li>
						<li><b>旅行保険</b></li>
						<li><b>家計保険</b></li>
					</ul>
				</div>
			</div>
			<div id="context_all2">
				<div id="banner_img">
					<div id="banner_img_text">
					    <img src="" width="100%" />
					</div>
				</div>
				<div id="context" class="context" style="height: auto;">
					<div id="context_text_one">
						<div id="context_text_one1">
							<h3>保険責任</h3>
							<span></span><br>
							<span></span><br>
							<span></span><br>
							<span></span><br>
							<span></span><br>
							<span></span><br>
							<span></span><br>
						</div>
						<div id="context_text_one2">
							<h3>カスタム見積</h3>
							<span>
								<select>
									<option value="0">7万円</option>
									<option value="21">21万円</option>
									<option value="35">35万円</option>
									<option value="56">56万円</option>
									<option value="70">70万円</option>
								</select>
							</span><br>
							<span>
								<select>
									<option value="0">7万円</option>
									<option value="21">21万円</option>
									<option value="35">35万円</option>
									<option value="56">56万円</option>
									<option value="70">70万円</option>
								</select>
							</span><br>
							<span>
								<select>
									<option value="0">保険に加入しない</option>
									<option value="53">35万円</option>
									<option value="70">70万円</option>
									<option value="140">140万円</option>
								</select>
							</span><br>
							<span>
								<select>
									<option value="0">1万円</option>
									<option value="3">3万円</option>
									<option value="5">5万円</option>
									<option value="8">8万円</option>
									<option value="10">10万円</option>
								</select>
							</span><br>
							<span>
								<select>
									<option value="0">保険に加入しない</option>
									<option value="70">70万円</option>
									<option value="140">140万円</option>
									<option value="210">210万円</option>
									<option value="280">280万円</option>
								</select>
							</span><br>
							<span>
								<select>
									<option value="0">保険に加入しない</option>
									<option value="700">700円/天</option>
									<option value="1400">1400円/天</option>
									<option value="2100">2100円/天</option>
									<option value="2800">2800円/天</option>
								</select>
							</span><br>
							<span>
								<select>
									<option value="0">保険に加入しない</option>
									<option value="35">35万円</option>
									<option value="70">70万円</option>
									<option value="140">140万円</option>
								</select>
							</span><br>
						</div>
					</div>
					<div align="center" id="context_text_two" style="height: 300px">
						<div id="context_text_two1">
							<h2 align="left">️保険加入者</h2>
						</div>
						<div id="context_text_two2">
							<div class="div_ac">
								<span style="color: red">*</span>&nbsp;名前：<input type="text" id="userName" />
							</div>
							<div class="div_ac">
								<span style="color: red">*</span>&nbsp;携帯番号：<input type="text" id="userPhone" />&nbsp;&nbsp;&nbsp;
								<span style="color: red">*</span>&nbsp;メールボックス：<input type="text" id="userEmail" />
							</div>
						</div>
					</div>
					<div align="center" id="context_text_three">
						<div id="context_text_three1">
							<h2 align="left">️被保険者</h2>
						</div>
						<div id="context_text_three2">
							<div class="div_ac">
								<span style="color: red">*</span>&nbsp;名前：<input type="text" id="userName2" />
							</div>
							<div class="div_ac">
								<span style="color: red">*</span>&nbsp;とし：<input type="text" id="userCity2" />&nbsp;&nbsp;&nbsp;
								<span style="color: red">*</span>&nbsp;携帯番号：<input type="text" id="userPhone2" />
							</div>
						</div>
					</div>
					<div align="center" id="context_text_four" style="height: 300px;">
						<div id="context_text_four1">
							<h2 align="left">️保険期間</h2>
						</div>
						<div id="context_text_four2">
							<div class="div_ac">
								<span style="color: red">*</span>&nbsp;有効日：<input type="text" id="staDateTime" readonly="readonly" />
								&nbsp;&nbsp;&nbsp;賞味期限：
								<select id="endDataTime" onchange="js(this,'endDataTime')">
									<option value="0">1年</option>
									<option value="2">2年</option>
									<option value="3">3年</option>
									<option value="4">4年</option>
									<option value="5">5年</option>
								</select>
							</div>
							<div class="div_ac" align="center">
								<div class="div_aca">
									<div class="div_acac">
										<input hidden="hidden" id="commodity_id" value="" />
										<input hidden="hidden" id="price_value" value="" />
										<b><span  id="price_view"></span><span>円</span></b>
									</div>
									<a href="#">
										<b><div id="buyCommodity" class="button">ただちに保険をかける</div></b>
									</a>
								</div>
							</div>
						</div>
					</div>
				</div>
				<div id="foot">
					<h5 class="h51">カスタマーサービスホットライン：888-888-8888 （9:00~21:00）</h5>
					<h5 class="h52">○○健康保険株式会社 027-666666 &nbsp;&nbsp; ICP認証：UP9999999 &nbsp;&nbsp; Copyright © 2023 All Rights Reserved</h5>
				</div>
			</div>
		</div>
	</body>
</html>