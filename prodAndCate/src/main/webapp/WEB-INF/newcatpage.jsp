<%@ page language="java" contentType="text/html; charset=BIG5"
    pageEncoding="BIG5"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="BIG5">
		<title>New Category Page</title>
		<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-eOJMYsd53ii+scO/bJGFsiCZc+5NDVN2yr8+0RDqr0Ql0h+rP48ckxlpbzKgwra6" crossorigin="anonymous">
		<link rel = "stylesheet" type = "text/css" href = "../css/style.css">
	</head>
	<body>
		<div class = "container">
		
			<h1> New Category</h1>		
			<div class = "cot">
				<div class = "category">
					<form:form action="/createcat" method="post" modelAttribute="newcat">			    				    
					    <p>
					        <form:label path="name">Name:</form:label>
					        <form:errors path="name"/>
					        <form:input path="name"/>
					    </p>
					    <input type="submit" value="Create"/>
					</form:form>
				</div>
				<div class = "category">
					<form class = "formsite" action = "/choosecategory" method = "post">
						<label >Choose a Category:</label>
							<select name = "selectcatid">
								<c:forEach items = "${allCat}" var = "cat">
									<option value = "${cat.getId()}">${cat.getName()}</option>
								</c:forEach>			
							</select>
						<input type="submit" value="Submit"/>
					</form>
				</div>
			</div>
			<a href = "/products/new">Back to Product</a>

		</div>
	</body>
</html>