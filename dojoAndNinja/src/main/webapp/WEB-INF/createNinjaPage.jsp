<%@ page language="java" contentType="text/html; charset=BIG5"
    pageEncoding="BIG5"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>    

<!DOCTYPE html>
<html>
	<head>
		<meta charset="BIG5">
		<title>Create Ninja Page</title>
		<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-eOJMYsd53ii+scO/bJGFsiCZc+5NDVN2yr8+0RDqr0Ql0h+rP48ckxlpbzKgwra6" crossorigin="anonymous">
		<link rel = "stylesheet" type = "text/css" href = "../css/style.css">
	</head>
	<body class = "main">
		<div class ="container">
		<form:form action="/createninja" method="post" modelAttribute="blankNinja">
					    
					    <p>
					    	<form:label path = "dojo">Dojo:</form:label>
					        <form:select path = "dojo">
					        	<c:forEach items = "${allDojos}" var ="eachdojo">
					        	 <form:option value = "${eachdojo.getId()}">${eachdojo.getName()}</form:option>
					        	</c:forEach>
					        </form:select>				    
					    </p>
					    
					    <p>
					        <form:label path="first_name">First Name:</form:label>
					        <form:errors path="first_name"/>
					        <form:input path="first_name"/>
					    </p>
					    <p>
					        <form:label path="last_name">Last Name:</form:label>
					        <form:errors path="last_name"/>
					        <form:input  path="last_name"/>
					    </p>
					    
					    <p>
					        <form:label path="age">Age:</form:label>
					        <form:errors path="age"/>
					        <form:input  path="age" value = "0"/>
					    </p>
					    			        
					    <input type="submit" value="Create"/>
					</form:form>
					<input type ="button" class = " backbut" onclick="javascript:location.href='/dojos/new'" value="Create Dojo Page"></input>
			</div>
	</body>
</html>