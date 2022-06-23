<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Edit</h1>
        <form:form action="/update" modelAttribute="student">
            <form:label path="roll">Rollno</form:label>
            <form:input path="roll" readonly="true"/>
            <form:errors path="roll"/> <br/>

            <form:label path="name">Fullname</form:label>
            <form:input path="name"/>
            <form:errors path="name"/> <br/>

            <form:label path="className">Class Name</form:label>
            <form:input path="className"/>
            <form:errors path="className"/> <br/>

            <input type="submit"/>
        </form:form>
    </body>
</html>