<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>新增用户</title>
	<style>
		input{
			margin: 5px;
		}
	</style>
</head>
<body>
	<div align="center">
		<form action="addUser" method="post">
			用户姓名：<input type="text" name="name" placeholder="请输入姓名"/><br/>
			用户年龄：<input type="text" name="age" placeholder="请输入年龄" /><br/>
			<input type="submit" value="确定"  />
			<input type="reset" value="取消">
		</form>
		<a href="/users/findAll" style="text-decoration: none;margin-top: 10px">查看所有用户</a>
	</div>
</body>
</html>