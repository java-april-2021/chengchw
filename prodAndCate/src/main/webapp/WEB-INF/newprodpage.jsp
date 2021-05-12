<%@ page language="java" contentType="text/html; charset=BIG5"
    pageEncoding="BIG5"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="BIG5">
		<title>New Prod Page</title>
		<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-eOJMYsd53ii+scO/bJGFsiCZc+5NDVN2yr8+0RDqr0Ql0h+rP48ckxlpbzKgwra6" crossorigin="anonymous">
		<link rel = "stylesheet" type = "text/css" href = "../css/style.css">
	</head>
	<body>
		<div class = "container">
		
			<h1> New Product</h1>
			<div class = "cot">
				<div class = "category">
					<form:form action="/createprod" method="post" modelAttribute="newprod">			    				    
					    <p>
					        <form:label path="name">Name:</form:label>
					        <form:errors path="name"/>
					        <form:input path="name"/>
					    </p>
					    <p>
					        <form:label path="description">Description:</form:label>
					        <form:errors path="description"/>
					        <form:textarea  path="description"/>
					    </p>
					    
					    <p>
					        <form:label path="price">Price:</form:label>
					        <form:errors path="price"/>
					        <form:input  path="price" value = "0"/>
					    </p>		    			        
					    <input type="submit" value="Create"/>
					</form:form>
				</div>
				<div class = "category">
					<form class = "formsite" action = "/chooseproduct" method = "post">
						<label >Choose a Product:</label>
							<select name = "selectprodid">
								<c:forEach items = "${allProds}" var = "prod">
									<option value = "${prod.getId()}">${prod.getName()}</option>
								</c:forEach>			
							</select>
						<input type="submit" value="Submit"/>
					</form>
				</div>
			</div>
			<a href = "/categories/new">Back to Category</a>		
		</div>
	
	</body>
</html>