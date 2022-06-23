<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <table>
            <tr>
                <th>Roll</th>
                <th>Name</th>
                <th>Class</th>
                <th></th>
            </tr>
            <c:forEach items="${students}" var="student">
                <tr>
                    <td>${student.roll}</td>
                    <td>${student.name}</td>
                    <td>${student.className}</td>
                    <td><a href=/edit/${student.roll}>Edit</a> | <a href=/delete/${student.roll}>Delete</a></td>
                </tr>
            </c:forEach>
        </table>
        <a href="/add">Add a new student</a>
    </body>
</html>