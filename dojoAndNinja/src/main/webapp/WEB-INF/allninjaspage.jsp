<%@ page language="java" contentType="text/html; charset=BIG5"
    pageEncoding="BIG5"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="BIG5">
		<title>Show all Ninja at Dojo</title>
		<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-eOJMYsd53ii+scO/bJGFsiCZc+5NDVN2yr8+0RDqr0Ql0h+rP48ckxlpbzKgwra6" crossorigin="anonymous">
	</head>
	
	<body>
		<div class = "container">
			
			<h1><c:out value = "${dojoSite}"></c:out> Location Ninjas</h1>
			
			<table class="table table-hover">
			    <thead>
			        <tr>
			            <th>First Name</th>
			            <th>Last Name</th>
			            <th>Age</th>
			            
			        </tr>
			    </thead>
				    <tbody>
				        <c:forEach items="${viewAllNinjas}" var="ninja">
				        <tr>
				            <td><c:out value="${ninja.getFirst_name()}"/></td>
				            <td><c:out value="${ninja.getLast_name()}"/></td>
				            <td><c:out value= "${ninja.getAge()}"/></td>    
				        </tr>
				        </c:forEach>
				    </tbody>
				</table>
			    <input type ="button" onclick="javascript:location.href='/dojos/new'" value="Create Dojo Page"></input>
		</div>
	</body>
</html>