<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Student Registration Form</title>
</head>
<body>

	<form:form action="processForm" modelAttribute="student">
	First name: <form:input path="firstName" />

		<br>
		<br>
	
	Last name: <form:input path="lastName" />

		<br>
		<br>
		
		Country:
		
		<form:select path="country">
			<form:options items="${student.country }" />
		</form:select>

		<br>
		<br>
		
		Favorite Programming Languages: 
		
		Java<form:radiobutton path="favoriteLanguage" value="Java" />
		C#<form:radiobutton path="favoriteLanguage" value="C#" />
		PHP<form:radiobutton path="favoriteLanguage" value="PHP" />
		Ruby<form:radiobutton path="favoriteLanguage" value="Ruby" />

		<br>
		<br>
		
		Operation Systems: 
		
		Linux <form:checkbox path="operatingSystems" value="Linux" />
		Mac OS <form:checkbox path="operatingSystems" value="Mac OS" />
		MS Windows<form:checkbox path="operatingSystems" value="MS Windows" />

		<br>
		<br>

		<input type="submit" value="Submit" />

	</form:form>
</body>
</html>