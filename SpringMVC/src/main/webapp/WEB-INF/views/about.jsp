<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>ABOUT PAGE</title>
</head>
<body>
	<h1>Inside the about page</h1>
	<h2>Called by /about</h2>
	<h1>Hello , My name is Sunpreet Singh</h1>
	
	<% 
		String name = (String)request.getAttribute("name");
		Integer id = (Integer)request.getAttribute("id");
		String city = (String)request.getAttribute("city");
		List<String> friends = (List<String>)request.getAttribute("f");
	%>
	
	<h3>Name is :-<%= name %></h3>
	<h3>Id is :-<%= id %></h3>
	<h3>City is :-<%= city %></h3>
	<h2>Friends</h2>
	
	<% for(String s : friends) 
		{	
	%>
	<h3><%= s %></h3>
	<% } %>
	
	
	
</body>
</html>