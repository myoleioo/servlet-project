<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="DataEntry" method="post">
		<table>
			<tr>
				<td>Name</td>
				<td><input type="text" name="userName"></td>
			</tr>
			<tr>
				<td>DOB</td>
				<td><input type="date" name="dob"></td>
			</tr>
			<tr>
				<td>Gender</td>
				<td><input type="radio" name="gender" value="Male">Male</td>
				<td><input type="radio" name="gender" value="Female">Female</td>		
			</tr>
			<tr>
				<td>Knowledge You may know</td>
				<td><input type="checkbox" name="pl" value="HTML">HTML</td>
				<td><input type="checkbox" name="pl" value="CSS">CSS</td>
				<td><input type="checkbox" name="pl" value="JavaScript">JavaScript</td>
				<td><input type="checkbox" name="pl" value="jQuery">jQuery</td>
			</tr>
			<tr>
				<td>Choose one class you want to attend</td>
				<td>
					<select name= "course">
						<option>PHP</option>
						<option>JS</option>
						<option>Java</option>
					</select>
				</td>
			</tr>
			<tr>
				<td></td>
				<td><input type= "reset" value= "Reset"></td>
				<td><input type="submit" value="Submit"></td>
			</tr>
		</table>

	</form>
	

</body>
</html>