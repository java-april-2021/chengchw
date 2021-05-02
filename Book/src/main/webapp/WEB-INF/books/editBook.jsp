<%@ page language="java" contentType="text/html; charset=BIG5"
    pageEncoding="BIG5"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%> 
<!DOCTYPE html>
<html>
	<head>
		<meta charset="BIG5">
		<title>Insert title here</title>
	</head>
	<body>
		
		<h1>Edit Book</h1>
			<form:form action="/api/books/${index}" method="post" modelAttribute="book">
			    <p>
			        <form:label path="title">Title</form:label>
			        <form:errors path="title"/>
			        <form:input path="title"/>
			    </p>
			    <p>
			        <form:label path="description">Description</form:label>
			        <form:errors path="description"/>
			        <form:textarea path="description"/>
			    </p>
			    <p>
			        <form:label path="language">Language</form:label>
			        <form:errors path="language"/>
			        <form:input path="language"/>
			    </p>
			    <p>
			        <form:label path="numberOfPage">Pages</form:label>
			        <form:errors path="numberOfPage"/>     
			        <form:input type="number" path="numberOfPage"/>
			    </p>    
			    <input type="submit" value="Submit"/>
			</form:form>    
	
		
	
	</body>
</html>