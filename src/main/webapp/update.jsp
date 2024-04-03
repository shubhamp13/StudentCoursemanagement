<%@page import="dto.Student"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="css/regester.css">
</head>
<body>
	<div class="container">
		<%
		Student dbStudent = (Student) request.getAttribute("student");
		%>
		<h1>Update Here</h1>
		<form action="edit" method="post">
			<label for="username">Username:</label> <input type="text"
				name="username" value="<%=dbStudent.getName()%>"><br> <label
				for="email">Email Id:</label> <input type="email" name="email"
				value="<%=dbStudent.getEmailId()%>" readonly></br> <label
				for="address">Address</label> <input type="text" name="address"
				value="<%=dbStudent.getAddress()%>"><label for="phoneno">Contact
				No:</label> <input type="tel" name="phoneno"
				value="<%=dbStudent.getPhoneNo()%>"><br> <label
				for="password">Enter Password:</label> <input type="password"
				name="password"><br> <input type="submit"
				value="submit">

		</form>
	</div>
</body>
</html>