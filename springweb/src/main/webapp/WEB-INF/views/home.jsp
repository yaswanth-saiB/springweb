<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home page</title>
</head>
<body>
<h1>Welcome to Spring MVC Home page</h1>

<!-- EL(Expression Language) is used to display
attribute values from JSP files passed from a controller.
Syntax: ${Attribute} -->
<h1>Welcome to ${user} Home Page</h1>

<p> Page served on ${d} </p>

<a href="spring">Click here for one more View</a>
</body>
</html>