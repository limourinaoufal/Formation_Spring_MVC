<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>SPRING MVC</title>
</head>
<body>
<a href="/Formation_Spring_MVC/">index</a>
<h1>Welcome To Training Spring MVC ;)</h1>
	<h3>reservation-page</h3>
	
	<form:form action="submitForm" modelAttribute="reservation">
		First name: <form:input path="firstName"/>
		<br/><br/>
		Last name: <form:input path="lastName"/>
		<br/><br/>
		Gender:
			Male <form:radiobutton path="gender" value="Male"/>
			Female <form:radiobutton path="gender" value="Female"/>
		<br/><br/>
		Food:
			BreakFast<form:checkbox path="food" value="BreakFast"/>
			Lunch<form:checkbox path="food" value="Lunch"/>
			Dinner <form:checkbox path="food" value="Dinner"/>
		<br/><br/>	
		
		 Leaving from: <form:select path="cityFrom">  
	        <form:option value="Rabat" label="Rabat"/>  
	        <form:option value="Casablanca" label="Casablanca"/>  
	        <form:option value="Fes" label="Fes"/>  
	        <form:option value="Marrakech" label="Marrakech"/>  
        </form:select> 
         
        <br><br>  
        
        Going to: <form:select path="cityTo">  
	        <form:option value="Rabat" label="Rabat"/>  
	        <form:option value="Casablanca" label="Casablanca"/>  
	        <form:option value="Fes" label="Fes"/>  
	        <form:option value="Marrakech" label="Marrakech"/>
        </form:select>  
		 

		
		<br/><br/>	
		<input type="submit"  value="submit"/>
	</form:form>
	
	
</body>
</html>