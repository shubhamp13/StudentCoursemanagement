<%@page import="com.google.protobuf.Message"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<link rel="stylesheet" href="css/regester.css">
<title>Register Here</title>
</head>
<body>
	<div class="container">
		<%
		String message = (String) request.getAttribute("message");
		%>
		<%
		if (message != null) {
		%>
		<h1 style="color: red"><%=message%></h1>
		<%
		}
		%>
		<h1>Register Here</h1>
		<form action="register" method="post">
			<label for="username">Username:</label> <input type="text"
				name="username"><br> <label for="email">Email
				Id:</label> <input type="email" name="email"></br> 
				<label for="address">Address</label>
            <input type="text" name="address"><label for="phoneno">Contact
				No:</label> <input type="tel" name="phoneno"><br> <label
				for="password">Password:</label> <input type="password"
				name="password"><br> <input type="submit"
				value="submit">

		</form>
	</div>
</body>
</html>