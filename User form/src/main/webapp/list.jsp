<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css">
<style type="text/css">
body {
	display: flex;
	justify-content: center;
	align-items: center;
	min-height: 30px;
	background-color: white;
	border-color: black;	
}
</style>
</head>
<body>
<body>
<form action="apply" method="post">
<h1 class="text-center">Registration From</h1>
<div class="mb-3">
<label class="form-label">Id</label><br>
<input type="text" class="form-control" name="id" required="required">
</div>
<div class="mb-3">
<label class="form-label">Name</label><br>
<input type="text" class="form-control" name="name" required="required">
</div>
<div class="mb-3">
<label class="form-label">Phone No</label><br>
<input type="number" class="form-control" name="phoneno" required="required">
</div>
<div class="mb-3">
<label class="form-label">Email</label><br>
<input type="text" class="form-control" name="email" required="required">
</div>
<div class="mb-3">
<label class="form-label">Password</label><br>
<input type="password" class="form-control" name="password" required="required">
</div>
<div class="mb-3">
<label class="form-label">Address</label><br>
<input type="text" class="form-control" name="address" required="required">
</div>
<div class="mb-3">
<label class="form-label">City</label><br>
<input type="text" class="form-control" name="city" required="required">
</div>
<input type="submit" class="form-control" value="APPLY" style="color:blue">

</form>

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"></script>


</body>
</html>