<%@ page language="java" contentType="text/html; charset=BIG5"
    pageEncoding="BIG5"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>    
<!DOCTYPE html>
<html>
	<head>
		<meta charset="BIG5">
		<title>Register Page</title>
	</head>
	<body>
		<div class = "container">
		
			<h1> Register!</h1>
			<p>${errormessage}</p>
			<p><form:errors path = "user.*"/></p>
			<form:form method = "post" action = "/registration" modelAttribute = "user">
			
				<p>
					<form:label path = "email"> Email:</form:label>
					<form:input type = "email" path = "email"/>
				</p>
				<p>
					<form:label path = "password"> Password:</form:label>
					<form:password path = "password"/>
				</p>
				<p>
					<form:label path = "passwordConfirmation"> Password Confirmation:</form:label>
					<form:password path = "passwordConfirmation"/>
				</p>
				<input type = "submit" value = "Register"/>
			
			</form:form>
		
		</div>
	
	</body>
</html>