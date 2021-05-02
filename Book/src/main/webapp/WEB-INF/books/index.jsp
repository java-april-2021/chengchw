<%@ page language="java" contentType="text/html; charset=BIG5"
    pageEncoding="BIG5"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="BIG5">
		<title>Insert title here</title>
	</head>
	<body>

		<h1>All Books</h1>
		<table>
	    <thead>
	        <tr>
	            <th>Title</th>
	            <th>Description</th>
	            <th>Language</th>
	            <th>Number of Pages</th>
	        </tr>
	    </thead>
	    <tbody>
	        <c:forEach items="${books}" var="book">
	        <tr>
	            <td><c:out value="${book.getTitle()}"/></td>
	            <td><c:out value="${book.getDescription()}"/></td>
	            <td><c:out value="${book.getLanguage()}"/></td>
	            <td><c:out value="${book.getNumberOfPage()}"/></td>
	        </tr>
	        </c:forEach>
	    </tbody>
		</table>
		<form method = "POST" action = "/books">
			<input type = "text" name = "index">
			<button>Try Index</button>
		</form>
		<a href="/books/new">New Book</a>

	</body>
</html>