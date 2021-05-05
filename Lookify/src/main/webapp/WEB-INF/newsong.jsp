<%@ page language="java" contentType="text/html; charset=BIG5" pageEncoding="BIG5"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>	
<html>
	<head>
		<meta charset="BIG5">
		<title>New Song Page</title>
		<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-eOJMYsd53ii+scO/bJGFsiCZc+5NDVN2yr8+0RDqr0Ql0h+rP48ckxlpbzKgwra6" crossorigin="anonymous">
		<link rel = "stylesheet" type = "text/css" href = "../css/style.css">
	</head>
	<body>
		<div class = "container">
		<a class = "dash" href = "/dashboard">Dashboard</a>
			<div class = "formbody">
				<form:form action="/create" method="post" modelAttribute="song">
					    <p>
					        <form:label path="title">Title</form:label>
					        <form:errors path="title"/>
					        <form:input class ="inputform" path="title"/>
					    </p>
					    <p>
					        <form:label path="artist">Artist</form:label>
					        <form:errors path="artist"/>
					        <form:input class ="inputform" path="artist"/>
					    </p>
					    
					    <p>
					        <form:label path="rating">Rating(1-10)</form:label>
					        <form:errors path="rating"/>
					        <form:input class ="inputform" path="rating" min="1" max="10" step="1" type="number" value = "1"/>
					    </p>
					        
					    <input type="submit" value="Add New"/>
					</form:form> 
				</div>
			</div>
	</body>
</html>