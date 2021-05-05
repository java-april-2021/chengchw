<%@ page language="java" contentType="text/html; charset=BIG5" pageEncoding="BIG5"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="BIG5">
		<title>Singer Songs</title>
		<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-eOJMYsd53ii+scO/bJGFsiCZc+5NDVN2yr8+0RDqr0Ql0h+rP48ckxlpbzKgwra6" crossorigin="anonymous">
		<link rel = "stylesheet" type = "text/css" href = "../css/style.css">
	</head>
	<body>
	
		
		<div class = "container">
			
			<a class = "dash" href = "/dashboard">Dashboard</a><br>
			<form method = "POST" action = "/search">
				<p>Songs by artist <c:out value = "${artist}"></c:out> <input type = "text" name = "artist" value = <c:out value="${artist}"/>><button>New Search</button>
				
				</p>
			</form>
			
			
			
			<table class="table table-hover">
		    <thead>
		        <tr>
		            <th>Name</th>
		            <th>Rating</th>
		            <th>actions</th>
		            
		        </tr>
		    </thead>
		    <tbody>
		        <c:forEach items="${songs}" var="song">
		        <tr>
		            <td><a class="dropdown-link-color" href = "song/${song.getId()}"><c:out value="${song.getTitle()}"/></a></td>
		            <td><c:out value="${song.getRating()}"/></td>
		            <td><a href = "/delete/${song.getId()}">delete</a></td>
		            
		        </tr>
		        </c:forEach>
		    </tbody>
			</table>
	</div>	
	
	
	</body>
</html>