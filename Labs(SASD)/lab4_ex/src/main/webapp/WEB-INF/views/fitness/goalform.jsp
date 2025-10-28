<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Document</title>
</head>
<body>
<form:form action="addgoal" modelAttribute="goal" method="get">

    <label for="id">ID:</label>
    <form:input path="id"/>
    <form:errors path="id" cssClass="error"/>
    <br/><br/>d

    <label for="minutes">Time:</label>
    <form:input path="minutes" cssStyle="width: 50px;" />
    <form:errors path="minutes" cssClass="error"/>
    <br/><br/>


    <label>
        Exercise:
        <input type="text" name="exerciseDesc">
    </label>
    <br/><br/>

    <input type="submit" value="Submit"/>
</form:form>
</body>
</html>