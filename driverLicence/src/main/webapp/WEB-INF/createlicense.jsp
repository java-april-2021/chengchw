<%@ page language="java" contentType="text/html; charset=BIG5"
    pageEncoding="BIG5"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html lang="en">
	<head>
		<meta charset="BIG5">
		<title>New License Page</title>
		<link rel = "stylesheet" type = "text/css" href = "../css/style.css">
		<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta3/dist/css/bootstrap.min.css" 
			  rel="stylesheet" integrity="sha384-eOJMYsd53ii+scO/bJGFsiCZc+5NDVN2yr8+0RDqr0Ql0h+rP48ckxlpbzKgwra6" 
			  crossorigin="anonymous">
	</head>
	<body class = "main">
	
		<h1 class = "head">New License</h1>
		<c:out value = "${errors}"/>
		<form:form action="/licenses/new" method="post" modelAttribute="license">
		    
		    <p>
		        <form:label path = "driver">Person:</form:label>
		        <form:select path = "driver">
		        	<c:forEach items = "${alldriver}" var ="eachdriver">
		        	 <form:option value = "${eachdriver}">${eachdriver.getFirstName()}  ${eachdriver.getLastName()}</form:option>
		        	</c:forEach>
		        </form:select>
		       
		    </p>
		    <p>
		        <form:label path="state">State</form:label>
		        <form:errors path="state"/>
		        <form:input  path="state"/>
		    </p>
		    
		    <p>
		        <form:label path="expireDate">Expire Date</form:label>
		        <form:errors path="expireDate"/>
		        <form:input type = "date" path="expireDate"/>
		    </p>
		    	
		    
		    
		    <input type="submit" value="Create"/>
		</form:form>
		<input type="button" onclick="location.href='/person/new'" value = "To Driver Page">
	</body>
</html>