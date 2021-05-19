<%@ page language="java" contentType="text/html; charset=BIG5"
    pageEncoding="BIG5"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
	<head>
		<meta charset="BIG5">
		<title>Welcome</title>
	</head>
	<body>
		<h1>Welcome, <c:out value = "${user.email}"/></h1>
		<a href = "/logout">Logout</a>
	</body>
</html>