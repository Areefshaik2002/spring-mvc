<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Success!</title>
</head>
<body>
	<center>
		<h1><%= request.getAttribute("data") %></h1>
	</center>
</body>
</html>