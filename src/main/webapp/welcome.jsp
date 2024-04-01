<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="css/index.css">
</head>
<body>
	<div class="container">
	<%String name=(String)request.getAttribute("name"); %>
		<h1>
			Welcome
			<%=name%>
			To Student Management System
		</h1>
		<h3>This Project Have Been Created By Shubham Puri With Servlets</h3>
		<p>Explore And Learn new technologies</p>
	</div>
</body>
</html>