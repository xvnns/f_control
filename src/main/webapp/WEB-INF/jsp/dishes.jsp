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
                <h2>Dishes List</h2>
                <table class="table table-striped table-hover table-condensed table-bordered">
                    <tr>
                        <th>Id</th>
                        <th>Name</th>
                        <th>Calories</th>
                        <th>Mass</th>
                        <th>Total calorie</th>
                    </tr>
                    <c:forEach var="dish" items="${dishes}">
                        <tr>
                            <td>${dish.id}</td>
                            <td>${dish.name}</td>
                            <td>${dish.calories}</td>
                            <td>${dish.mass}</td>
                            <td>${dish.totalCalorie}</td>
                        </tr>
                    </c:forEach>
                </table>
            </div>
        </div>
    </body>
</html>