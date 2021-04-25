<%@ page language="java" contentType="text/html; charset=BIG5"
    pageEncoding="BIG5"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>


<!DOCTYPE html>
<html>
	<head>
		<meta charset="BIG5">
		<title>Input Code</title>
		<link rel = "stylesheet" type = "text/css" href = "css/style.css">
	</head>
	<body>
	
		<h1 class = "warning"><c:out value= "${errors}"/></h1>
		<h1>What is the code?</h1>
		
		<form method = "POST" action = "/code">
			<input type = "text" name = "inputcode">
			<button>Try Code</button>
		</form>
		
	</body>
</html>