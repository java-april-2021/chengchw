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
	
			<table>
	    <thead>
	        <tr>
	        	<!-- <th>Id</th> -->
	            <th>Name</th>
	            <th>Creator</th>
	            <th>Version</th>
	            <th>action</th>
	        </tr>
	    </thead>
	    <tbody>
	        <c:forEach items="${languages}" var="language" varStatus="loop">
	        <tr>
	         	<td>
	         		<a href = "/languages/<c:out value="${loop.index}"/>"><c:out value="${language.getName()}"/></a>
	         	</td>
	            
	            <td><c:out value="${language.getCreator()}"/></td>
	            <td><c:out value="${language.getVersion()}"/></td>
	            <td>
	            	<%-- <form method = "POST" action = "/delete">
	            		
	            	</form> --%>
	            <%-- 	<a href = "/delete/<c:out value="${loop.index}"/>">delete</a> --%>
	            	<a href = "/delete/${loop.index}">delete</a>
	         		<a href = "/languages/edit/<c:out value="${loop.index}"/>">edit</a>
	         	</td>
	            
	           <%--  <td><c:out value="space"/></td> --%>
	            
	        </tr>
	        </c:forEach>
	    </tbody>
		</table>
		
		<%-- <p>${languages}</p> --%>
		
		<form:form action="/newlanguage" method="post" modelAttribute="inputlanguage">
		
			    
			    
			    <p>
			        <form:label path="name">Name</form:label>
			        <form:errors path="name"/>
			        <form:input path="name"/>
			    </p>
			    
			    <p>
			        <form:label path="creator">Creator</form:label>
			        <form:errors path="creator"/>
			        <form:input path="creator"/>
			    </p>
			    <p>
			        <form:label path="Version">Version</form:label>
			        <form:errors path="Version"/>
			        <form:input path="Version"/>
			    </p>
			    
			    <input type="submit" value="Submit"/>
		
		</form:form>    
		
		
	
	
	</body>
</html>