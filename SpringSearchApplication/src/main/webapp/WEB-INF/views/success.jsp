<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page isELIgnored="false"  %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
		<h3>${user }</h3>
		<h3>Name is :- ${user.name}</h3>
		<h3>Id is :- ${user.id}</h3>
		<h3>Email is :- ${user.email}</h3>
		<h3>Password is :- ${user.password}</h3>
		<h3>Date of birth is :- ${user.dob}</h3>
		<h3>Gender is :- ${user.gender}</h3>
		<h3>Courses are :- ${user.courses}</h3>
		<h3>Comments :- ${user.comments}</h3>
		<br>
		<h3>City is :- ${user.address.city}</h3>
		<h3>State is :- ${user.address.state}</h3>
</body>
</html>