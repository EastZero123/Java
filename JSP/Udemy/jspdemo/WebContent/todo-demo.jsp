<%@ page import="java.util.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<form action="todo-demo.jsp">
		Add new item: <input type="text" name="theItem" /> <input
			type="submit" value="Submit" />
	</form>

	<%
		List<String> items = (List<String>) session.getAttribute("myToDoList");

	if (items == null) {
		items = new ArrayList<String>();
		session.setAttribute("myToDoList", items);
	}

	String theItem = request.getParameter("theItem");
	if (theItem != null) {
		items.add(theItem);
	}
	%>

	<hr>
	<b>To List Items:</b>
	<br />

	<ol>
		<%
			for (String temp : items) {
			out.println("<li>" + temp + "</li>");
		}
		%>
	</ol>

</body>
</html>