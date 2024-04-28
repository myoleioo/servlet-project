<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

<style>
table, tr, td {
	border: solid 1px;
	border-collapse: collapse;
}
</style>

</head>
<body>
	<jsp:useBean id="user" class= "model.UserBean2" scope= "application"></jsp:useBean>
	<table>
		<tr>
			<td>Label</td>
			<td>Use JSP UseBean</td>
			<td>Use EL</td>
		</tr>
		<tr>
			<td>Name</td>
			<td><jsp:getProperty property="name" name="user"/></td>
			<td>${user.name}</td>
		</tr>
		<tr>
			<td>DOB</td>
			<td><jsp:getProperty property="dob" name="user"/></td>
			<td>${user.dob}</td>
		</tr>
		<tr>
			<td>Gender</td>
			<td><jsp:getProperty property="gender" name="user"/> </td>
			<td>${user.gender}</td>
		</tr>
		<tr>
			<td>Knowledge You May Know</td>
			<td><jsp:getProperty property="pl" name="user"/></td>
			<td>${user.pl}</td>
		</tr>
		<tr>
			<td>Class you want to attend</td>
			<td><jsp:getProperty property="course" name="user"/></td>
			<td>${user.course}</td>
	
	</table>
	
</body>
</html>