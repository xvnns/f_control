<!DOCTYPE html>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html lang="en">
<head>
    <link rel="stylesheet" href="CSS/regstyle.css">
</head>
<body>
<div class="container">
    <div class="starter-template">
        <h2>Clients List</h2>
        <table class="table table-striped table-hover table-condensed table-bordered">
            <tr>
                <th>Id</th>
                <th>Name</th>
                <th>Login</th>
                <th>Password</th>
            </tr>
            <c:forEach var="client" items="${clients}">
                <tr>
                    <td>${client.id}</td>
                    <td>${client.name}</td>
                    <td>${client.login}</td>
                    <td>${client.password}</td>
                </tr>
            </c:forEach>
        </table>
    </div>
</div>
</body>
</html>