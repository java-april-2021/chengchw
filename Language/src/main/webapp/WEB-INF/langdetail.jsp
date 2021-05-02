<%@ page language="java" contentType="text/html; charset=BIG5"
    pageEncoding="BIG5"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%> 
<!DOCTYPE html>
<html>
	<head>
		<meta charset="BIG5">
		<title>Language Detail here</title>
	</head>
	<body>
		
		<c:out value="${language.getName()}"/><br>
		<c:out value="${language.getCreator()}"/><br>
		<c:out value="${language.getVersion()}"/><br>
		
		<a href = "/languages/edit/${index}">edit</a><br>
		<a href = "/delete/${index}">delete</a><br>
		<a href = "/languages">Dash Board</a>
	         		
		
	
	
	</body>
</html>