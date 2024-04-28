<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	
	<p>${error}</p>
	Register Form
	<form action="register" method="post" onsubmit ="return checkForm()"> 
	<label>Name</label>
	<input type="text" name="userName" ><br>
	<label>Email</label>
	<input type="text" name="email"><br>
	<label>Password</label>
	<input type="password" name="pass" id="pass">><br>
	<span id = "message1" style="color:red"> </span> <br> 
	<label>ConPassword</label>
	<input type="password" name="cpass" id="cpass">><br>
	<span id = "message2" style="color:red"> </span> <br>  
	<input type="submit" value="Register">
	
	</form>
	
	<script src="register.js"></script>
</body>
</html>