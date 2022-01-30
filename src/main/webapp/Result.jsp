<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Result</title>
<style>
img {
	border-radius: 8px;
}

body {
	background-color: #005587;
	color: white;
}
</style>
</head>
<body>
	<div data-role="header" align="center" style="margin-top: 100px;">
		<img src="img/lambton.png" width="200px" height="200px">
	</div>
	<div data-role="content">
		<form action="Results" method="post" style="text-align: center;">
			<h4>Designed by:</h4>
			<p>
				* Navdeep Kaur * Samridhi <br> * Abhinav Mittal * Aarti <br>
				* Ahmed
			</p>
			<h2>* Your Marks detail *</h2>
			Average score: <input type="text" name="m1">
			<br>
			<br>
			Mimimum Score : <input type="text" name="m2">
			<br>
			<br>
			Maximum Score: <input type="text" name="m3">
		</form>
	</div>
</body>
</html>