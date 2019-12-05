<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<script src="http://libs.baidu.com/bootstrap/3.0.3/js/bootstrap.min.js"></script>

<link href="http://libs.baidu.com/bootstrap/3.0.3/css/bootstrap.min.css" rel="stylesheet" />
<title>主讲人管理</title>
</head>
<body>

<table class="table table-bordered">
	<tr>
		<td>序号</td>
		<td>ID</td>
		<td>名字</td>
		<td>经验</td>
		<td>职位</td>
		<td>url</td>
		<td>操作</td>
	</tr>
	<c:forEach begin="0" end="${list.size()-1}" var = "i">
	<tr>
		<td>${i }</td>
		<td>${list[i].id }</td>
		<td>${list[i].speaker_name }</td>
		<td>${list[i].speaker_desc }</td>
		<td>${list[i].speaker_job }</td>
		<td>${list[i].pic_url }</td>
		<td>
			<a class="btn btn-success" href="Uspeaker?id=${list[i].id }">（编辑）Success</a>
			<a  class="btn btn-danger" href="">（删除）Danger</a>
		</td>
	</tr>
	</c:forEach>
</table>
</body>
</html>