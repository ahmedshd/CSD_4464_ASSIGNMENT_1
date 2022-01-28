<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
</head>
<body>
	<form action="login" method="POST">
		<div style="margin-left: 30%;margin-right: 30%;margin-top: 10%;">
		<%if(session.getAttribute("message") != null && !session.getAttribute("message").equals("")) {
		    out.println(session.getAttribute("message"));
		    session.removeAttribute("message");
			}
		%>
			<label>Email</label><br>
			<input type="email" name="email" required />
			<br><br>
			<label>Password</label><br>
			<input type="password" name="password" required />
			<br><br>
			<input type="submit" value="Login" />
		</div>
	</form>
</body>
</html>