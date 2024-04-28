<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

<style>
p{
color:Black;
}
#success{
color:blue;
}
</style>

</head>
<body>
	 <p id="success"></p>
	<%-- <p id="success"><%=application.getAttribute("success") %></p>--%>
	<p>${success}</p>
	<%-- <p><%=application.getAttribute("loginerror") %></p>--%>
	<P>${loginerror}</P>
	<form action="login" method="post">
	<label>Email</label>
	<input type="text" name="email"><br>
	<label>Password</label>
	<input type="password" name="pass"><br>
	<input type="submit" value="login">
	</form>
	<a href="register.jsp">Create account</a>

</body>
</html>