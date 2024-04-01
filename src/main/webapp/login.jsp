<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Login</title>
<link rel="stylesheet" href="css/login.css">
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
		<h1>Login Here</h1>
		<form action="login" method="POST">
			<label for="email">Email:</label> <input type="email" id="email"
				name="email"><br> <label for="password">Password:</label>
			<input type="password" id="password" name="password"><br>

			<input type="submit" value="Login">
		</form>
		<a href="register.jsp" class="link">Back to Register</a>
	</div>


</body>
</html>
