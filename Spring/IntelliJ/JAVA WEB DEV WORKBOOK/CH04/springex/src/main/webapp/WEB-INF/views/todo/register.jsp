<%--
  Created by IntelliJ IDEA.
  User: CHOIDONGYOUNG
  Date: 2022-11-15
  Time: 오전 10:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!doctype html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Hello, world!</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-Zenh87qX5JnK2Jl0vWa8Ck2rdkQ2Bzep5IDxbcnCeuOxjzrPF/et3URy9Bv1WTRi" crossorigin="anonymous">

</head>
<body>
<div class="container-fluid">
    <div class="row">
        <div class="col">
            <nav class="navbar navbar-expand-lg bg-light">
                <div class="container-fluid">
                    <a class="navbar-brand" href="#">Navbar</a>
                    <button class="navbar-toggler" type="button" data-bs-toggle="collapse"
                            data-bs-target="#navbarNavAltMarkup" aria-controls="navbarNavAltMarkup"
                            aria-expanded="false" aria-label="Toggle navigation">
                        <span class="navbar-toggler-icon"></span>
                    </button>
                    <div class="collapse navbar-collapse" id="navbarNavAltMarkup">
                        <div class="navbar-nav">
                            <a class="nav-link active" aria-current="page" href="#">Home</a>
                            <a class="nav-link" href="#">Features</a>
                            <a class="nav-link" href="#">Pricing</a>
                            <a class="nav-link disabled">Disabled</a>
                        </div>
                    </div>
                </div>
            </nav>
        </div>
        <div class="row content">
            <div class="col">
                <div class="card">
                    <div class="card-header">
                        Featured
                    </div>
                    <div class="card-body">
                        <form action="/todo/register" method="post">
                            <div class="input-group mb-3">
                                <span class="input-group-text">Title</span>
                                <input type="text" name="title" class="form-control" placeholder="Title">
                            </div>

                            <div class="input-group mb-3">
                                <span class="input-group-text">DueDate</span>
                                <input type="date" name="dueDate" class="form-control" placeholder="Date">
                            </div>

                            <div class="input-group mb-3">
                                <span class="input-group-text">Writer</span>
                                <input type="text" name="writer" class="form-control" placeholder="Writer">
                            </div>

                            <div class="mb-4">
                                <div class="float-end">
                                    <button type="submit" class="btn btn-primary">Submit</button>
                                    <button type="result" class="btn btn-secondary">Reset</button>
                                </div>
                            </div>
                        </form>
                        <script>
                            const serverValidResult = {}

                            <c:forEach items="${errors}" var="error">
                            serverValidResult['${error.getField()}'] = '${error.defaultMessage}'
                            </c:forEach>

                            console.log(serverValidResult)
                        </script>
                    </div>
                </div>
            </div>
        </div>
    </div>
    <%--    <div class="row content">--%>
    <%--        <h1>Content</h1>--%>
    <%--    </div>--%>
    <div class="row footer">
        <div class="row     fixed-bottom" style="z-index: -100">
            <footer class="py-1 my-1">
                <p class="text-center text-muted">Footer</p>
            </footer>
        </div>
    </div>
</div>

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-OERcA2EqjJCMA+/3y+gxIOqMEjwtxJY7qPCqsdltbNJuaOe923+mo//f6V8Qbsw3"
        crossorigin="anonymous"></script>
</body>
</html>