<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body> 
	<form action="jspworkout1.jsp" method="post">
		<label>Name</label>
			<input type="text" name="username"><br>
		<label>DOB</label>
			<input type="date" name="date"><br>
		<label>Gender</label>
			<input type="radio" name="gender" value="Male">
			<input type="radio" name="gender" value="FeMale"><br>
		<label>Course</label>
			<select name="course" multiple>
				<option value="Java">Java</option>
				<option value="PHP">PHP</option>
				<option value="Android">Android</option>
				<option value="ASP">ASP</option>
			</select>
		<input type="submit" value="Register">
     </form>
	

    <%
		String name = request.getParameter("username");
		out.print("<br>Name :" + name);
		
		String date = request.getParameter("date");
		out.print("<br>DOB :" + date);
		
		String gender= request.getParameter("gender");
		out.print("<br>Genden :" + gender);
		
		String [] subject=request.getParameterValues("course");
		int count=1;
		if(subject!=null){
			for(String s:subject) {
			out.println("<br>subject"+count+":"+s);
			count++;
			}
		}
    %>   
</body>
</html>