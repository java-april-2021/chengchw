<%@ page language="java" contentType="text/html; charset=BIG5"
    pageEncoding="BIG5"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="BIG5">
		<title>Product Page</title>
		<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-eOJMYsd53ii+scO/bJGFsiCZc+5NDVN2yr8+0RDqr0Ql0h+rP48ckxlpbzKgwra6" crossorigin="anonymous">
		<link rel = "stylesheet" type = "text/css" href = "../css/style.css">
	</head>
	<body>
		<div class = "container" >
		
			<h1>${showprod.getName()}</h1>
			<div class = "cot">
			<div class = "category">
				
				<h3>Categories:</h3>
				
				<ul>
				
				<c:forEach items = "${showprod.getCategory()}" var = "cat">
					<li>${cat.getName()}</li>
				</c:forEach>
				
				</ul>
			</div>
			
			<div class = "AddCategory">	
			    <form class = "formsite" action = "/addcadegory/${showprod.getId()}" method = "post">
				<label >Choose a Category:</label>
					<select name = "selectcatid">
						<c:forEach items = "${allunlistcat}" var = "cat">
							<option value = "${cat.getId()}">${cat.getName()}</option>
						</c:forEach>			
					</select>
				<input type="submit" value="Submit"/>
				</form>
			</div>
			</div>
		
			
			<a href = "/reserprod/${showprod.getId()}">Reset Category</a>
			<a href = "/products/new">Back to Product</a>	
		</div>
	
	</body>
</html>