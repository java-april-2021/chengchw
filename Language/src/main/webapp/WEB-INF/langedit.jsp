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
		
		<form:form action="/editlanguage/${index}" method="post" modelAttribute="inputlanguage">
		
			    
			    <p>
			        <form:label path="name" >Name</form:label>
			        <form:errors path="name"/>
			        <form:input path="name" value = "${language.getName()}"/>
			    </p>
			    
			    <p>
			        <form:label path="creator">Creator</form:label>
			        <form:errors path="creator"/>
			        <form:input path="creator" value = "${language.getCreator()}"/>
			    </p>
			    <p>
			        <form:label path="Version">Version</form:label>
			        <form:errors path="Version"/>
			        <form:input path="Version" value = "${language.getVersion()}"/>
			    </p>
			    
			    <input type="submit" value="Submit"/>
		
		</form:form>    
		<a href = "/languages">Dash Board</a>
	</body>
</html>