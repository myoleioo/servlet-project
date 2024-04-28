<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
     
<style>
p{
	color:green;
}

table, tr, td {
	border: solid 1px;
	border-collapse: collapse;
}
</style>

</head>
<body>
		<%
		if(session.getAttribute("email")==null){
			response.sendRedirect("login.jsp");
		}else{
		%>
		welcome
		<%--<%=session.getAttribute("email") --%>
		${email}
		<table>
		<tr>
		<td>Name</td>
		<td>Email</td>
		</tr>
		
		<c:forEach items="${userList}" var ="user">
		
		<tr>
		<td>${user.userName}</td>
		<td>${user.userEmail}</td>
		</tr>
		
		</c:forEach>
		
		
		
		</table>
		
		<% 
		}
		%>
	<script src="page.js"></script>

</body>
</html>