<!DOCTYPE html>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html lang="en">
    <head>
        <link rel="stylesheet" href="CSS/regstyle.css">
    </head>
    <body>
        <div class="container">
            <h2>Find client by id</h2>
            <p><label>Id: ${randclient.get().id}</label></p>
            <p><label>Name: ${randclient.get().name}</label></p>
            <p><label>Login: ${randclient.get().login}</label></p>
            <p><label>Password: ${randclient.get().password}</label></p>
        </div>
    </body>
</html>