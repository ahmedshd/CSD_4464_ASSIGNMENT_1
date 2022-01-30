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
	<div data-role="header" align="center">
		<img src="img/lambton.png" width="200px" height="200px">
	</div>
	<div data-role="content">
		<form action="Results" method="post" style="text-align: center;">
			<h4>Designed by:</h4>
			<p>
				* Navdeep Kaur * Samridhi <br> * Abhinav Mittal * Aarti <br>
				* Ahmed
			</p>
			<h2>*${studentName}: Your Marks detail *</h2>
			Average score: ${average}
			<br>
			<br>
			Minimum Score: ${minScore}
			<br>
			<br>
			Maximum Score: ${maxScore}
			<br>
			<br>
			Grade: ${grade}
			<br>
			<br>
			Grade Point: ${gradePoint}
		</form>
	</div>
</body>
</html>