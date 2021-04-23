<%@ page language="java" contentType="text/html; charset=BIG5"
    pageEncoding="BIG5"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="BIG5">
		<title>Date Time</title>
		<link rel = "stylesheet" type = "text/css" href = "css/style.css">
		<script defer type="text/javascript" src="js/main.js"></script>
		
	</head>
	
	
	<body onload="alertPage('<c:out value="${DateTime}"/>')">
	<!-- After load onload, alertPage function will be trigger and call the function in javascript file -->
	<!-- DateTime is attribute that mapped from main chamber -->
	<!-- Alert the user of the time, time is input from model mapping in main controller -->
	
		
		<%-- <h1>Hello <c:out value= "${firstName} ${lastName} !" /></h1>  --%>
		
		<p class = "datetime"><c:out value= "${DateTime}"/></p>
		<!-- Show the date, date mapping by DateTime attribute model from main controller -->
		<a href = "/">Go Back</a>
		
	
	</body>
</html>