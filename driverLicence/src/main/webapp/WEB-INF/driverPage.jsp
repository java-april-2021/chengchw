<%@ page language="java" contentType="text/html; charset=BIG5" pageEncoding="BIG5"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="BIG5">
		<title>Driver Page</title>
		<link rel = "stylesheet" type = "text/css" href = "css/style.css">
		<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta3/dist/css/bootstrap.min.css" 
			  rel="stylesheet" integrity="sha384-eOJMYsd53ii+scO/bJGFsiCZc+5NDVN2yr8+0RDqr0Ql0h+rP48ckxlpbzKgwra6" 
			  crossorigin="anonymous">
	</head>
	<body class = "main">
		
		<div class = "container">
			
			<h1 class = "head">${showDriver.getFirstName()} ${showDriver.getLastName()}</h1>
			<p>License Number <c:out value = "${showDriver.getLicense().getLicenseStr()}"></c:out></p>
			<p>State <c:out value = "${showDriver.getLicense().getState()}"></c:out></p>
		
			<input type="button" onclick="location.href='/person/new'" value = "To Drive Page">
		</div>
		
	
	</body>
</html>