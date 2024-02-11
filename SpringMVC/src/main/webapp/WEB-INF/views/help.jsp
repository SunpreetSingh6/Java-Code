<%@page import="java.time.LocalDateTime"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page isELIgnored= "false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>ON HELP PAGE</title>
</head>
<body>

<%-- 	<%
		String name = (String)request.getAttribute("name");
		Integer contact = (Integer)request.getAttribute("contact");
		LocalDateTime time =(LocalDateTime)request.getAttribute("time");
	%> --%>
	
	<h1>Contact Info</h1>
	<h2>Name:- ${name}</h2>
	<h2>Contact:- ${contact} </h2>
	<h2>Date and Time:- ${time} </h2>
	
</body>
</html>