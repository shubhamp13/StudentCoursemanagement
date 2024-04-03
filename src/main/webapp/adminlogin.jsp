<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Admin Login</title>
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
		<h1>Admin Login Here</h1>
		<form action="adminlogin" method="POST">
			<label for="email">Email:</label> <input type="email" id="email"
				name="email"><br> <label for="password">Password:</label>
			<input type="password" id="password" name="password"><br>

			<input type="submit" value="Login">
		</form>
		<div class="links">
				<a href="login.jsp" class="link">Back To User Login</a>
		</div>

	</div>
</body>
</html>