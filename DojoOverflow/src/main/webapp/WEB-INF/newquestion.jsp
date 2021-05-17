<%@ page language="java" contentType="text/html; charset=BIG5"
    pageEncoding="BIG5"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="BIG5">
		<title>New Question Page</title>
		<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" 
			  integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" 
			  crossorigin="anonymous">
	</head>
	
	<body>
		<div class = "container">
			<h1>What is your question?</h1>
			<form:form action = "new" method = "post" modelAttribute ="blankquestion">
				<p>
					<form:label path = "question">Questions:</form:label>
					<form:errors path="question"/>
					<form:textarea path="question"/>
				</p>
				
				<p>
					<label>Tag:</label>
					<input type = "text" name = "inputtag"/>
					
				</p>
				
				<input type="submit" value= "submit"/>
					
			</form:form>
			<p>${error}</p>
			
		
		</div>
	</body>
	
</html>