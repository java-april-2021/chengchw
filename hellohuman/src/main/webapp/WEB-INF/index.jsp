<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>


<!DOCTYPE html>
<html>
	<head>
	<meta charset="ISO-8859-1">
		<title>Greeting</title>
	</head>
	
	<body>
		<h1>Hello <c:out value= "${firstName} ${lastName} !" /></h1> 
		<p> Welcome to SpringBoot!</p>
		<a href = "http://localhost:8080/">Go Back</a>
		
		
	</body>
</html>