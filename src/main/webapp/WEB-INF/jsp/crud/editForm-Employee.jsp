
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  
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
	<h2>editForm-Employee</h2>
	
	<form:form method="post" action="/Formation_Spring_MVC/editSaveEmp">
		<table>
			<tr>	
				<td>ID :</td>
				<td> ${command.id} </td>
				<td> <form:hidden path="id" />  </td>
			</tr>
			<tr>
				<td>Name :</td>
				<td> <form:input path="name" />  </td>
			</tr>
			<tr>
				<td>Salary :</td>
				<td> <form:input path="salary" /> </td>
			</tr>
			<tr>
				<td>Designation :</td>
				<td> <form:input path="designation"/> </td>
			</tr>
			<tr>
			<td></td>
			<td> <input type="submit" value="Update"/> </td>
			</tr>
		</table>
	</form:form>
	

	
</body>
</html>