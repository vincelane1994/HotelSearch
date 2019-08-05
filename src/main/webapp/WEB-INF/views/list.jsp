<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Hotel List</title>
<link href="https://stackpath.bootstrapcdn.com/bootswatch/4.3.1/lux/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<h1>Hotels in ${hotelList[0].city}</h1>
		<table class="table">
			<thead>
				<tr>
					<th>Rating</th>
					<th>Hotel</th>
				</tr>
			</thead>
			<tbody>
			<c:forEach var="hotelList" items="${hotelList}">
				<tr>
					<td>${hotelList.rating}</td>
					<td>${hotelList.name}<br>Price Per Night $${hotelList.pricePerNight}</td>
				</tr>
			</c:forEach>
			</tbody>
		</table>
		<a href="/" class="btn btn-outline-primary" class="btn btn-outline-primary">Home</a>
</body>
</html>