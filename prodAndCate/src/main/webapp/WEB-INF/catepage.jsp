<%@ page language="java" contentType="text/html; charset=BIG5"
    pageEncoding="BIG5"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>
	<head>
		<meta charset="BIG5">
		<title>Insert title here</title>
		<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-eOJMYsd53ii+scO/bJGFsiCZc+5NDVN2yr8+0RDqr0Ql0h+rP48ckxlpbzKgwra6" crossorigin="anonymous">
		<link rel = "stylesheet" type = "text/css" href = "../css/style.css">
	</head>
	<body>
		<div class = "container">
			
			<h1>${showcat.getName()}</h1>
			<div class = "cot">
				<div class = "category">	
					<ul>
							
						<c:forEach items = "${showcat.getProducts()}" var = "prod">
							<li>${prod.getName()}</li>
						</c:forEach>
					
					</ul>
				</div>
			
			
				
				<div class = "AddCategory">
				
					<form class = "formsite" action = "/addproduct/${showcat.getId()}" method = "post">
					<label >Choose a Product:</label>
						<select name = "selectprodid">
							<c:forEach items = "${allunlistprod}" var = "prod">
								<option value = "${prod.getId()}">${prod.getName()}</option>
							</c:forEach>			
						</select>
					<input type="submit" value="Submit"/>
					</form>
				
				</div>
			</div>
			<a href = "/resercat/${showcat.getId()}">Reset Product</a>
			<a href = "/categories/new">Back to Category</a>	
			
		</div>
	
	</body>
</html>