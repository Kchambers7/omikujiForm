<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
<script src="/webjars/jquery/jquery.min.js"></script>
<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
<title>Send an Omikuji!</title>
</head>
<body>
	<div class="container">
		<h1>Send an Omikuji!</h1>
		<form action="/createfortune" class="form" method="post">
			<label>Pick any number from 5 to 25</label>
			<select class="form-control" name="years">
				<option>5</option>
				<option>10</option>
				<option>15</option>
				<option>20</option>
				<option>25</option>
			</select>
			<label>Enter the name of any city:</label>
			<input type="text" class="form-control" name="city"></input>
			<label>Enter the name of any real person.</label>
			<input type="text" class="form-control" name="name"></input>
			<label>Enter profession or hobby:</label>
			<input type="text" class="form-control" name="profession"></input>
			<label>Enter any type of living thing:</label>
			<input type="text" class="form-control" name="living_thing"></input>
			<p>Send an show a friend!</p>
			<button class="btn btn-success">Send</button>
		</form>
	</div>
</body>
</html>