<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page isELIgnored="false" %> 
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Person</title>
</head>
<body>

<div align="center" style="margin-top: 80px;margin-bottom: 20px;margin-left:300px;margin-right:300px;background-color:cyan;border: 1px solid black;">
	<h1>Enter Person Details</h1>
	<form:form action="${pageContext.request.contextPath}/save-person.htm" method="post">
	<table>
	<tr><td>
	first name   :<td> <input type="text" name="firstName"><br>
	</tr>
	<tr><td>
	lastName     : <td><input type="text" name="lastName"><br>
	</tr>
	<tr><td>
	email        : <td><input type="text" name="email"><br>
	</tr>
	<tr><td>
	contactNo    : <td><input type="text" name="contactNo"><br>
	<tr><td><td align="right">
	<input type="submit" value="save"><br>
	<tr/>
	</table>
	</form:form>
</div>
</body>
</html>