<%@ page language="java" contentType="text/html; charset=BIG5" pageEncoding="BIG5"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>
	<head>
		<meta charset="BIG5">
		<title>Insert title here</title>
		<link rel = "stylesheet" type = "text/css" href = "../css/style.css">
		<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-eOJMYsd53ii+scO/bJGFsiCZc+5NDVN2yr8+0RDqr0Ql0h+rP48ckxlpbzKgwra6" crossorigin="anonymous">
	</head>
	<body class = "main">
		<div class = "container">
		<h1 class = "header">New Dojo</h1>
		<form action ="/createdojo" method = "POST">
		  <label>Name</label>
		  <input type = "text" name = "dojoname">
		  <input type = "submit" value = "create">
		</form>
		
		<form class = "formsite" action = "/viewninjalist" method = "post">
			<label >Choose a Site:</label>
				<select name = "dojositeid">
					<c:forEach items = "${allDojos}" var = "dojo">
						<option value = "${dojo.getId()}">${dojo.getName()}</option>
					</c:forEach>			
				</select>
			
			<input type="submit" value="Submit"/>
		</form>
		<input class = "formsite" type ="button" onclick="javascript:location.href='/ninjas/new'" value="Create Ninja Page"></input>
		</div>
		
		
		
		
		<%-- <form:form action="/viewninjalist" method="post" modelAttribute="license">
		    <p>
		        <form:label path = "driver">Person:</form:label>
		        <form:select path = "driver">
		        	<c:forEach items = "${alldriver}" var ="eachdriver">
		        	 <form:option value = "${eachdriver}">${eachdriver.getFirstName()}  ${eachdriver.getLastName()}</form:option>
		        	</c:forEach>
		        </form:select>		       
		    </p>
		 </form:form> --%>
	
	</body>
</html>