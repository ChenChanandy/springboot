<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>chenchan</title>
</head>
<body>
	<table border="1" align="center" width="300px">
		<tr>
			<th>ID</th>
			<th>Name</th>
			<th>Age</th>
			<th>操作</th>
		</tr>
		<c:forEach items="${list }" var="user">
			<tr>
				<td>${user.id}</td>
				<td>${user.name}</td>
				<td>${user.age}</td>
				<td>
					<a href="/users/findOne?id=${user.id}">更改</a>
					<a href="/users/delete?id=${user.id}">删除</a>
				</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>