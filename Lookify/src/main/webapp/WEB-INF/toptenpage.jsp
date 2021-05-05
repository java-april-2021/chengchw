<%@ page language="java" contentType="text/html; charset=BIG5" pageEncoding="BIG5"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="BIG5">
		<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-eOJMYsd53ii+scO/bJGFsiCZc+5NDVN2yr8+0RDqr0Ql0h+rP48ckxlpbzKgwra6" crossorigin="anonymous">
		<link rel = "stylesheet" type = "text/css" href = "css/style.css">
		<title>Insert title here</title>
	</head>
	<body>
		
		<div class = "container">
			<div class = "header">
				<h3>Top Ten Songs</h3>
				<a class = "dashboarder" href = "/dashboard">Dashboard</a>
			
			</div>
		
			
			
			<div class="topTenCountainer">
				<c:forEach items="${songs}" var="song">
				
				<p>
				   <c:out value="${song.getRating()}"/> -  
				   <a href = "song/${song.getId()}"><c:out value="${song.getTitle()}"/></a> - 
				   <c:out value="${song.getArtist()}"/>
				</p>
			
				 </c:forEach>
			</div>
		
		</div>
	
	</body>
</html>