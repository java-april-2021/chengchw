<%@ page language="java" contentType="text/html; charset=BIG5"
    pageEncoding="BIG5"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
	<head>
		<meta charset="BIG5">
		<title>Login Page</title>
	</head>
	<body>
		<h1>Login</h1>
		<p><c:out value = "${errormessage}" /></p>
		<form method = "post" action = "/login">
			<p>
				<label for = "email">Email</label> 
				<input type ="text" id = "email" name = "email"/>
			</p>
			
			<p>
				<label for = "password">Password</label> 
				<input type ="password" id = "password" name = "password"/>
			</p>
			<input type = "submit" value ="Login!"/>
		
		</form>
		
	</body>
</html>