<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Sign Up Form</h1>
	<form action="signup" method="post">
		<pre>
User Id <input type="text" name="userid" value=${dto.userid} ></br>
Email <input type="text" name="email" value=${dto.email} ></br>
Password<input type="text" name="password"></br>
Confirm Password<input type="text" name="confirmpassword"></br>
<input type="submit" value="signup">
</pre>

	</form>
	<span style="color: green">${hi} ${id} ${success} 
	<span style="color: red">${signUPDto} ${failure} 
</body>
</html>