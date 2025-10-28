<%@ taglib prefix="c" uri="jakarta.tags.core"%>
<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title> </title>
</head>
<body>
    <h2 style="padding-left: 13px"> All Goals </h2>
    <div class = goals>
        <c:forEach var="goal" items="${goals}">
            <h3> Goal: ${goal.id} (total time: ${goal.minutes})</h3>
            <ul>
                <c:forEach var="exercise" items="${goal.exercises}">
                    <li>${exercise.activity} - ${exercise.minutes} min</li>
                </c:forEach>
            </ul>
        </c:forEach>
    </div>
</body>
</html>