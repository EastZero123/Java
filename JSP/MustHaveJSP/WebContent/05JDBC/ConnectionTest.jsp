<%@page import="common.JDBCConnect"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JDBC</title>
</head>
<body>
	<h2>JDBC 테스트 1</h2>
	<%
		JDBCConnect jdbc1 = new JDBCConnect();
	jdbc1.close();
	%>

	<h2>JDBC 테스트 2</h2>
	<%
		String driver = application.getInitParameter("OracleDriver");
	String url = application.getInitParameter("OracleURL");
	String id = application.getInitParameter("OracleId");
	String pwd = application.getInitParameter("OraclePwd");

	JDBCConnect jdbc2 = new JDBCConnect(driver, url, id, pwd);
	jdbc2.close();
	%>
</body>
</html>