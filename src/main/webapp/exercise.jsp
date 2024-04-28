<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

<style>

.menu{margin:20% blue;
border:10% solid green;
padding:50% 75%;

}

</style>

</head>
<body>
	<div class="menu">
	<Form>
	<label>Name</label>
	<input type="text" name="name" ><br>
	<label>User Email</label>
	<input type="email" name="useremail"><br>
	<label>Password</label>
	<input type="password" name="password"><br>
	<label>Confirm Password</label>
	<input type="password" name="conpassword"><br>
	<label>Gender</label>
	<input type="radio" name="gender" value="Male">
	<input type="radio" name="gender" value="Female"><br>
	<input type="submit" name="submit">
	</Form>
	</div>
</body>
</html>