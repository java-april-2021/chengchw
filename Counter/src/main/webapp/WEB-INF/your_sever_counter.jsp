<%@ page language="java" contentType="text/html; charset=BIG5"
    pageEncoding="BIG5"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="BIG5">
		<link rel = "stylesheet" type = "text/css" href = "css/style.css">
		<title>Out Put Math</title>
	</head>
	<body>
	
		<p> You have visited &nbsp;<a href = "/"></a><c:out value = " ${PresentCount}"/></p>
		<!-- &nbsp white space -->
		<a href = "/">Test another visit?</a>
		<form method = "POST" action = "/resetCounter">
		<!-- We apply Post method to get request from submit button -->
		<!-- <a href="/reset"><button>Reset Session</button></a> -->
		<!-- The answer just apply button in anchar tag which may be more effeciency -->
			<button type="submit">Reset Counter</button>
		</form>
			
	</body>
</html>