<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<jsp:useBean id="emp" class="jspproject.Employee"
	scope="request"></jsp:useBean>
	<jsp:setProperty name="emp" property="id" value="1" />
	<jsp:setProperty name="emp" property="name" value="John" />
	<jsp:getProperty name="emp" property="id" />
	<jsp:getProperty name="emp" property="name"/>
</body>
</html>