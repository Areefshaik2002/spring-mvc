<%@page import="com.mvc.model.User"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>!!!</title>
</head>
<body>
		<% User user = (User)request.getAttribute("user"); %>
		<center>
			<table border="2">
				<tr>
					<th>Name</th>
					<th>Email</th>
					<th>Address</th>
					<th>Mobile</th>
				</tr>
				<tr>
					<td><%= user.getName() %></td>
					<td><%= user.getEmail() %></td>
					<td><%= user.getAddress() %></td>
					<td><%= user.getMobile() %></td>
				</tr>
			</table>
		</center>
		
</body>
</html>