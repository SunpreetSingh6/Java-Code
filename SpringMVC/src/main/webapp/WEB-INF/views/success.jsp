<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration Successful</title>
</head>
<body>
	
	<h2 class="text-center">${Msg }</h2>
	<p class="text-center">${description }</p>
	<hr>

	<%-- 
	<h2>Welcome , ${name} </h2>
	<h2>Your Email is :- ${email} </h2>
	<h2>Your Password :- ${password} </h2> 
	--%>
	
	<h2>Welcome , ${user.username} </h2>
	<h2>Your Email is :- ${user.email} </h2>
	<h2>Your Password :- ${user.password} </h2>
</body>
</html>