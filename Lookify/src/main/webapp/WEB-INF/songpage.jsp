<%@ page language="java" contentType="text/html; charset=BIG5" pageEncoding="BIG5"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="BIG5">
		<link href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" 
			  rel="stylesheet" 
			  integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" 
			  crossorigin="anonymous">
		 <link rel = "stylesheet" type = "text/css" href = "../css/style.css">
		<title>Song Page</title>	
		
	</head>
	
	<body>
	
		<div class = "container">
			<a class = "dash" href = "/dashboard">Dashboard</a>
			<h5>Title</h5>
			<p>${song.getTitle()}</p>
			<h5>Artist</h5>
			<p>${song.getArtist()}</p>
			<h5>Rating</h5>
			<p> ${song.getRating()}</p>
			<a href = "/delete/${song.getId()}">Delete</a>	
		</div>
		
	</body>
</html>