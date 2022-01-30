<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student Marks Details</title>
<style>
img {
	border-radius: 8px;
}

body {
	background-color: #005587;
	color: floralwhite;
}
</style>

</head>
<body>
	<!--div1-->
	<div data-role="header" align="center" id="final">
		<img src="img/lambton.png" width="200px" height="200px">
		<img src="img/marksheet.png" width="230px" height="100px">
		<br>
		<br>
	</div>
	<div data-role="content" style="border: 2px solid black; width: 480px; margin-left: 35%;">
		<form action="Results" method="post" style="text-align: center;">
			<br>
			<label for="user-name">Student Name:</label>&nbsp;
			<input type="text" name="studentname">&nbsp;
			<h2>Enter your marks in 5 subjects</h2>&nbsp;
			Mobile Technology : <input type="text" name="m1">
			<br>
			<br> 
			Python Program : <input type="text" name="m2">
			<br>
			<br> 
			WebTec Program: <input type="text" name="m3">
			<br>
			<br> 
			Web Technology : <input type="text" name="m4">
			<br>
			<br> 
			Data Management: <input type="text" name="m5">
			<br>
			<br>
			<input type="submit" value ="Submit Details"/>
		</form>
	</div>
</body>
</html>