<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Ticket Booking</h1>
	<h3 style="color: green">${success}</h3>
	<h3 style="color: red">${failure}</h3>
	<form action="Book" method="post">
		<pre>
Stadium Name<select name="Stadiumname">
<option>Select a Stadium Name</option>
<option>M. Chinnaswamy Stadium</option>
<option>SDNR Wadiyar Stadium</option>
<option>KSCA Hubli Cricket Ground</option>
<option>KSCA Rajnagar Stadium</option>
<option>Sree Kanteerava Stadium</option>
<option>Bangalore Football Stadium</option>
</select></br>
Tickets<input type="number" name="tickets"></br>
primaryContact<input type="number" name="primaryContact"></br>
email <input type="text" name="email"></br>
<input type="submit" value="Book">
</pre>
	</form>

</body>
</html>