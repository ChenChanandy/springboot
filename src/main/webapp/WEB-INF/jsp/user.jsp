<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>chenchan</title>
	<script src="https://lib.sinaapp.com/js/jquery/2.0.2/jquery-2.0.2.min.js"></script>
	<script>
		$(function(){
			$("tr:odd").css("background-color","#f8f8f8");
		});
	</script>
	<style>
		table{
			width: 50%;
			border: 1px solid #ddd;
			border-collapse: collapse;
			table-layout: fixed;
		}
		td{
			text-align: center;
			border-bottom: 1px solid #ddd;
			padding-bottom: 10px;
			padding-top: 10px;
			font-family: "宋体";
		}
		th{
			border-bottom: 1px solid #ddd;
			padding-bottom: 10px;
			padding-top: 10px;
		}
		a{
			text-decoration: none;
		}
	</style>
</head>
<body>
	<table align="center">
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
					<a href="/users/findOne?id=${user.id}">更改</a>&nbsp;&nbsp;
					<a href="/users/delete?id=${user.id}">删除</a>
				</td>
			</tr>
		</c:forEach>
	</table>
	<div align="center" style="margin-top: 10px">
		<a href="/users/add">新增用户</a>
	</div>
</body>
</html>