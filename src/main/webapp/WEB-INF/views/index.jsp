<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home</title>
</head>
<body>
<form action="/" method="post">
	<h3>Hotel Search</h3>
	<h5>City
	<select name="city">
		<option value="detroit">Detroit</option>
		<option value="rome">Rome</option>
		<option value="da nang">Da Nang</option>
	</select>
	</h5>
	<h5>Max Price
	<input type="text" name="maxPrice" required></h5>
	<button type="submit">Go!</button>
</form>
</body>
</html>