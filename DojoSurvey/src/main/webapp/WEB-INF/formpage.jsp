<%@ page language="java" contentType="text/html; charset=BIG5"
    pageEncoding="BIG5"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
	<head>
		<meta charset="BIG5">
		<title>Submitted Form</title>
		<link rel = "stylesheet" type = "text/css" href = "css/style.css">
		
	</head>
	<body class = "formpage">
	
		<h1>Submitted Info</h1><br>
		<div>
			<table>
			  <tr>
			    <td>Name:</td>
			    <td><c:out value= "${usernameAtt}"/></td>
			  </tr>
			  <tr>
			    <td>Dojo Location:</td>
			    <td><c:out value= "${locationAtt}"/></td>
			  </tr>
			  <tr>
			    <td>Favorite Language:</td>
			    <td><c:out value= "${languageAtt}"/></td>
			  </tr>
			  
			  <tr>
			    <td>Comment:</td>
			    <td><c:out value= "${commentAtt}"/></td>
			  </tr>	  
			  
			</table>		
		
			
		
		</div>
		
		<form class = "back" action = "/">
				<button>Back</button>
		</form>
		
	</body>
</html>