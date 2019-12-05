<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
#div1 {
	padding: 30px  40px 0px;
	margin : 200px 300px 5px;
	background: green;	
	width: 600px;
	height: 200px;
}
</style>
</head>
<body>
	<div id="div1">
		<form action="login">
			账号:<input type="text" name="accounts"> 
			密码:<input type="password" name="password">
			<input type="submit" value="登录"><br>
			${msg }
		</form>
	</div>

</body>
</html>