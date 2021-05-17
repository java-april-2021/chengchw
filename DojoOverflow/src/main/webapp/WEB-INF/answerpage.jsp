<%@ page language="java" contentType="text/html; charset=BIG5"
    pageEncoding="BIG5"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="BIG5">
		<title>Answer page</title>
		<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-eOJMYsd53ii+scO/bJGFsiCZc+5NDVN2yr8+0RDqr0Ql0h+rP48ckxlpbzKgwra6" crossorigin="anonymous">
		<link rel = "stylesheet" type = "text/css" href = "../css/style.css">
	</head>
	<body>	
		<div class = "container">
		
			<h1>${showquestion.getQuestion()}</h1>
			<p>Tags:</p>
			<p>
				<c:forEach items = "${showtag}" var = "eachtag">
					${eachtag.getSubject()}
				</c:forEach>
			</p>
			<div>
				<table class="table">
					<tr>
						<th>Answers</th>
					</tr>
					<c:forEach items = "${showanswer}" var = "eachanswer">
						<tr>
							<td>${eachanswer.getAnswer()}</td>
						</tr>
					</c:forEach>
				</table>
			</div>
			
			<div>
			
				<h3>Add your answers</h3>
				<form action = "addanswer"  method = "post" id="usrform">
					<label>Answers:</label><br>
					<textarea  name = "inpuanswer"  rows="4" cols="50" form="usrform">Input answer here!</textarea><br>	
					<input type ="hidden" name = "questionid" value = "${showquestion.getId()}">
					<input type ="submit" value = "Answer It!">
				</form>
			
			
			
			</div>
		
		</div>
	</body>
</html>