<%--
  Created by IntelliJ IDEA.
  User: CHOIDONGYOUNG
  Date: 2022-11-15
  Time: 오전 10:13
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>${message}</h1>

<h1><c:out value="${message}"></c:out></h1>
</body>
</html>
