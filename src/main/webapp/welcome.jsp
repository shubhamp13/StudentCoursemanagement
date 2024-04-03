<%@page import="dto.Student"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
 <!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Student Management System</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
<link rel="stylesheet" href="css/index.css">
</head>
<body>
 <% Student dbStudent = (Student) request.getAttribute("student"); %>
        <%request.setAttribute("student",dbStudent);%>
    <nav class="navbar navbar-expand-lg navbar-light bg-light fixed-top">
        <a class="navbar-brand" href="#">Student Management System</a>
        <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNav"
            aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse" id="navbarNav">
            <ul class="navbar-nav ml-auto">
                <li class="nav-item">
                    <a class="nav-link" href="profile?email=<%=dbStudent.getEmailId()%>">Profile</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="update?email=<%=dbStudent.getEmailId()%>">Logout</a>
                </li>
            </ul>
        </div>
    </nav>
    <div class="container mt-5">
       
        <h1>
            Welcome <%= dbStudent.getName() %> To Student Management System
        </h1>
        <h3>This Project Has Been Created By Shubham Puri With Servlets</h3>
        <p>Explore And Learn new technologies</p> 
    </div>
    
<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
<script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.1/dist/umd/popper.min.js"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</body>
</html>
 
 
 
 