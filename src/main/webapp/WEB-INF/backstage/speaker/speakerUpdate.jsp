<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="">
<table class="table table-bordered">
	<tr>
		<td>序号</td>
		<td>ID</td>
		<td>名字</td>
		<td>经验</td>
		<td>职位</td>
		<td>url</td>
	
	</tr>
	
	<tr>
		
		<td><input type="text" value="${speaker.id }"></td>
		<td><input type="text" value="${speaker.speaker_name }"></td>
		<td><input type="text" value="${speaker.speaker_desc }"></td>
		<td><input type="text" value="${speaker.speaker_job }"></td>
		<td><input type="text" value="${speaker.pic_url }"></td>
		<td>
			<input type="submit" class="btn btn-danger" value="（保存）save">
		</td>
	</tr>
</table>
<a  class="btn btn-danger" href="show">（返回）return</a>
</form>
</body>
</html>