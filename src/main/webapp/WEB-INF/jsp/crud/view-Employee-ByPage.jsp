
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>SPRING MVC</title>
</head>
<body>
	<a href="/Formation_Spring_MVC/">index</a>
	<h1>Welcome To Training Spring MVC ;)</h1>
	<h3>Spring MVC CRUD Example</h3>
	<h2>View ALL Employee</h2>


	<table border="2" width="70%" cellpadding="2">
		<tr>
			<th>Id</th>
			<th>Name</th>
			<th>Salary</th>
			<th>Designation</th>
		</tr>
		<c:forEach var="emp" items="${listEmployee}">
			<tr>
				<td>${emp.id}</td>
				<td>${emp.name}</td>
				<td>${emp.salary}</td>
				<td>${emp.designation}</td>
			</tr>
		</c:forEach>
	</table>
	<br/>
	<a href="/Formation_Spring_MVC/viewempByPage/1">1</a>
	<a href="/Formation_Spring_MVC/viewempByPage/2">2</a>
	<a href="/Formation_Spring_MVC/viewempByPage/3">3</a>


</body>
</html>