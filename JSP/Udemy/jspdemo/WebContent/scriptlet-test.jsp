<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<h3>Hello World of Java</h3>
	<%
		for (int i = 0; i <= 5; i++) {
		out.println("<br/>I really luv2code: " + i);
	}
	%>
</body>
</html>