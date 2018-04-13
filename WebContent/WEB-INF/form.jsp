<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Admission</title>
</head>
<body>
<h1>Student Admission from</h1>
<form action="/SpringMvcForm//Admissions/submitsucess.html" method="post">
<table>
<tr><td>Name:</td><td><input type="text" name="name" placeholder="Your Name here"/></td></tr>
<tr><td>Hobby:</td><td><input type="text"name="hobby"  placeholder="Your hobby here"/></td></tr>
<tr><td colspan="2"><input type="submit" value="SUBMIT"></td></tr>
</table>
</form>
</body>
</html>