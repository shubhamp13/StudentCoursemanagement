 <%@page import="java.util.List"%>
<%@page import="dto.Student"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="css/display.css">
</head>
<body>
	<%Student student=(Student)request.getAttribute("student");%>
	<div class="container">

		<div class="card">
			<h1>Student Records</h1>
			<table border="3px">
				<tr>
					<th>Name</th>
					<th>Email id</th>
					<th>Address</th>
					<th>Phone No</th>
					<th>Password</th>
					<th>update</th>
					<th>delete</th>
				</tr>
				<tr>
					<td><%=student.getName()%></td>
					<td><%=student.getEmailId()%></td>
					<td><%=student.getAddress()%></td>
					<td><%=student.getPhoneNo()%></td>
					<td><%=student.getPassword()%></td>
				</tr>

			</table>
		</div>
	</div>

</body>
</html>