<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
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
<form:form action="addExercise" modelAttribute="exercise" method="get">
    <input type="hidden" name="goalId" value="1" />

    <label for="id">ID:</label>
    <form:input path="id"/>
    <form:errors path="id" cssClass="error"/>
    <br/><br/>

    <label for="minutes">Exercise Time:</label>
    <form:input path="minutes" cssStyle="width: 50px;" />
    <form:errors path="minutes" cssClass="error"/>
    <br/><br/>

    <label for="activity">Activity:</label>
    <form:input path="activity" cssStyle="width: 100px;" />
    <form:errors path="activity" cssClass="error"/>
    <br/><br/>

    <input type="submit" value="Submit"/>
</form:form>



</body>
</html>