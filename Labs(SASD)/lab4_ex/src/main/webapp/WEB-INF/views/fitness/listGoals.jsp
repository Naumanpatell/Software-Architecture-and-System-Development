<%@ taglib prefix="c" uri="jakarta.tags.core"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Goals</title>
</head>
<body>

<c:forEach items="${goals}" var="goal">
    <h3>Goal ${goal.id} (${goal.minutes}min)</h3>
    <c:forEach items="${goal.exercises}" var="exercise">
        <p>${exercise.activity} for ${exercise.minutes} min.</p>
    </c:forEach>
</c:forEach>

</body>
</html>