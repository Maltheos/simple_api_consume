<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
<title>Tiny list</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
</head>
<body>
<div class = "container">

<div class="btn-group">
	<a href = "/"><button type = "button" class = "btn btn-primary">Home</button></a>
	<a href="/complete"><button type = "button" class = "btn btn-primary">Complete</button></a>
</div>

	<div class = "table-responsive">
	<table class = "table-striped">
		<tr><th>Name</th><th>Invention</th><th>Year</th></tr>
		<c:forEach var="person" items="${tiny}">
			<tr><td>${person.name}</td><td>${person.invented}</td><td>${person.year}</td></tr>
		</c:forEach>
	</table>
	</div>
	
</div>
</body>
</html>