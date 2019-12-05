<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<!-- saved from url=(0044)http://localhost:8080/Voids/user/userShow.do -->
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<!-- base href="http://localhost:8080/video/" -->
<meta name="viewport"
	content="initial-scale=1, maximum-scale=1, user-scalable=no">

<meta name="renderer" content="webkit">
<meta name="keywords"
	content="Web前端视频教程,大数据视频教程,HTML5视频教程,UI视频教程,PHP视频教程,java视频教程,python基础教程">
<meta name="description"
	content="智游教育在线课程视频,为您提供java,python,HTML5,UI,PHP,大数据等学科经典视频教程在线浏览学习,精细化知识点解析,深入浅出,想学不会都难,智游教育,学习成就梦想！">
<meta name="author" content="尚忠祥">

<!--<base href="http://localhost:8080/Voids/">-->
<base href=".">
<link rel="stylesheet" href="z/base.css">
<link rel="stylesheet" href="z/profile.css">
<link rel="icon" href="z/favicon.png"
	type="image/png">
<title>在线公开课-智游教育|java|大数据|HTML5|python|UI|PHP视频教程</title>
</head>

<body>


	<header>
		<div class="container top_bar clearfix">
			<img src="z/logo.png" alt="智游">
			<div id="tele">
				<span>4006-371-555</span> <span>0371-88888598</span>
			</div>
		</div>
		<menu>
			<div class="container clearfix">
				<ul class="clearfix f_left">
					<li><a href="HomePageShow">首页</a></li>

					<li class="menu_active"><a>个人中心</a></li>
				</ul>

				<div id="user_bar">
					<a> <img id="avatar" src="z/avatar_lg.png" alt="" width="30px;">

					</a> <a  href="ExitHomePageShow">退出</a>
				</div>
			</div>
		</menu>
	</header>


	<div class="container">
		<h2>我的资料</h2>
		<div id="profile_tab">
			<ul class="profile_tab_header f_left clearfix">
				<li><a  href="UpdateUserPage">更改资料</a></li>
				<li class="profile_tab_line">|</li>
				<li><a href="UpdateUserPhotoShow">更改头像</a></li>
				<li class="profile_tab_line">|</li>
				<li><a>密码安全</a></li>
			</ul>
			<div class="proflle_tab_body">

				<div class="proflle_tab_workplace clearfix">
					<div class="profile_avatar_area">

						<img id="avatar" width="200px;" src="${list.imgurl }" alt="">
						<p>欢迎回来！</p>
					</div>
					<ul class="profile_ifo_area">
						<li><span class="dd">昵 称：</span><input type="text" name="nickname" readonly="readonly" value="${list.nickname }"></li>
						<li><span class="dd">性 别：</span><input type="text" name="sex" readonly="readonly" value="${list.sex }"></li>
						<li><span class="dd">生 日：</span><input type="text" name="birthday" readonly="readonly" value="${list.birthday }"></li>
						<li><span class="dd">邮 箱：</span><input type="text" name="accounts" readonly="readonly" value="${list.accounts }"></li>
						<li><span class="dd">所在地：</span><input type="text" name="address" readonly="readonly" value="${list.address }"></li>
					</ul>
				</div>
			</div>
		</div>
	</div>
	</main>
	<footer>
		<div class="container">
			<ul>
				<li><img src="z/footer_logo.png" alt=""
					id="foot_logo"></li>
				<li>版权所有：智游3G教育 ©&nbsp;www.zhiyou.com</li>
				<li><img src="z/a.png" alt="" id="wxgzh"></li>
			</ul>
		</div>
	</footer>

</body>
</html>