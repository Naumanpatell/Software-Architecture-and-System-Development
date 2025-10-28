<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html>
<head>
    <title>Pet Form</title>
</head>
<body>
<h2>Enter Pet Details</h2>

<!-- Spring form tag -->
<form:form action="showPet" modelAttribute="pet" method="get">

    <label for="name">Pet Name:</label>
    <form:input path="name"/>
    <form:errors path="name" cssClass="error"/>
    <br/><br/>

    <label for="species">Pet Species:</label>
    <form:select path="species" items="${allspecies}" cssStyle="width: 50px;" />
    <form:errors path="species" cssClass="error"/>
    <br/><br/>

    <label for="food">Pet food:</label>
    <form:input path="food" cssStyle="width: 50px;" />
    <form:errors path="food" cssClass="error"/>
    <br/><br/>

    <input type="submit" value="Submit"/>
</form:form>

</body>
</html>
