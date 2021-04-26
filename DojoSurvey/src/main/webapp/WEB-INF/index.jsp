<%@ page language="java" contentType="text/html; charset=BIG5"
    pageEncoding="BIG5"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
	<head>
		<meta charset="BIG5">
		<title>Fill in Survey</title>
		<link rel = "stylesheet" type = "text/css" href = "css/style.css">
	</head>
	<body>
	
		<div>
			
			<form method = "POST" action = "/formsubmit">
				<label>Your Name:</label>
				<input type = "text" name = "username"><br>
				<label>Dojo Location:</label>
				
				<select name = "location">	
					<c:forEach var = "loc" items ="${Location}">
						<option><c:out value="${loc}"/></option>
					</c:forEach>
				</select>
				<br>	
				<label>Favorite Language:</label>
				
				<select name = "language">	
					<c:forEach var = "lag" items ="${Language}">
						<option><c:out value="${lag}"/></option>
					</c:forEach>
				</select>
				<br>	
				<label>Comment (optional):</label><br>
				
				<textarea rows="4" cols="50" name="comment" ></textarea><br>
				
				<button>Submit</button>
			</form>
		
		
		</div>
		
	</body>
</html>