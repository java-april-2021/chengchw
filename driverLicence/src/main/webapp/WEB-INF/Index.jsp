<%@ page language="java" contentType="text/html; charset=BIG5"
    pageEncoding="BIG5"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="BIG5">
		<title>New Page</title>
		<link rel = "stylesheet" type = "text/css" href = "../css/style.css">
		<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta3/dist/css/bootstrap.min.css" 
			  rel="stylesheet" integrity="sha384-eOJMYsd53ii+scO/bJGFsiCZc+5NDVN2yr8+0RDqr0Ql0h+rP48ckxlpbzKgwra6" 
			  crossorigin="anonymous">
	</head>
	<body class = "main">
		
		<h1 class = "head"> New Person</h1>
		
		<form:form action="/person/new" method="post" modelAttribute="driver">
		    
		    <p>
		        <form:label path="firstName">First Name:</form:label>
		        <form:errors path="firstName"/>
		        <form:input class ="inputform" path="firstName"/>
		    </p>
		    <p>
		        <form:label path="lastName">Last Name</form:label>
		        <form:errors path="lastName"/>
		        <form:input class ="inputform" path="lastName"/>
		    </p>
		    
		    <input type="submit" value="Create"/>
		</form:form> 
		
		<p><c:out value = "${errors}"/></p>
		
		<input type="button" onclick="location.href='/licenses/new'" value = "To License Page">
		
		<form method = "POST" action = "/person">
		
			<label >Choose a driver:</label>
		  	<select name="driver_index">
		  		<c:forEach items = "${alldriver}" var ="eachdriver" varStatus="loop">
		    		<option value="${loop.index}">${loop.index}</option>
		    	</c:forEach>
		   </select>
		  <input type="submit" value = "submit" >	
	   </form>
		
		
			
		
	</body>
</html>