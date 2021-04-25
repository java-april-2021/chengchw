<%@ page language="java" contentType="text/html; charset=BIG5"
    pageEncoding="BIG5"%>
    
 <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="BIG5">
		<title>Code Page</title>
		<link rel = "stylesheet" type = "text/css" href = "css/style.css">
	</head>
	<body>
		<div class = "listdiv">
		
			<ul>
				
				<c:forEach var = "word" items ="${List}">
				<li><c:out value="${word}"/></li>
				</c:forEach>
				
			</ul>
			
			
		</div>
		<a href = "/">Back</a>	
	</body>
</html>