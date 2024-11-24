<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<body>
	<h1>This is Register Page using JSP</h1>
	<h2>
		<span style="color: green;"> ${success}</span> <span
			style="color: red;"> ${failure}</span>
	</h2>
	<form action="register" method="post">
		<pre>
Name<input type="text" name="name" value="${dto.name}" />
Email<input type="text" name="email" value="${dto.email}" />
age<input type="number" name="age" value="${dto.age}" />
city<input type="text" name="city" value="${dto.city}" />
state<input type="text" name="state" value="${dto.state}" />
country<input type="text" name="country" value="${dto.country}" />
<input type="submit" value="Register" />
</pre>
	</form>

</body>


</html>