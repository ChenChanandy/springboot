<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>新增用户</title>
</head>
<body>
	<form action="addUser" method="post">
		用户姓名：<input type="text" name="name" /><br/>
		用户年龄：<input type="text" name="age" /><br/>
		<input type="submit" value="确定"  /><br/>
	</form>
</body>
</html>