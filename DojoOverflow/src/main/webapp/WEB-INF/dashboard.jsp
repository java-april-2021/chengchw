<%@ page language="java" contentType="text/html; charset=BIG5"
    pageEncoding="BIG5"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="BIG5">
		<title>Question Dashboard</title>
		<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" 
			  integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" 
			  crossorigin="anonymous">
	</head>
	<body>
		<div class = "container">
		<h1>Questions Dashboard</h1>
			<table class="table">
				<tr>
					<th>Questions</th>
					<th>Tags</th>
				</tr>
				<c:forEach items = "${showquestion}" var = "eachquestion">
					<tr>
						<td><a href = "${eachquestion.getId()}">${eachquestion.getQuestion()}</a></td>
						<td>
							<p>
								<c:forEach items = "${eachquestion.getTags()}" var = "eachtag">
									${eachtag.getSubject()},
								</c:forEach>
							</p>
						</td>
					</tr>
				</c:forEach>
			</table>
		
			<a href = "new"> New Question</a>
		</div>
	</body>
</html>