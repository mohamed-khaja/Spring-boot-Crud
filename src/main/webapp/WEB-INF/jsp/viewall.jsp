<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>All Students</title>
    <link rel="stylesheet" type="text/css" href="style.css">
</head>
<body>
    <h2>All Students</h2>
    <h2>${students}</h2>

    <!-- Unable to display the Student object in a table, may try afterwards     -->
    <table border="1">
        <thead>
            <tr>
                <th>Roll Number</th>
                <th>Name</th>
                <th>Grade</th>
            </tr>
        </thead>
        <tbody>
            <c:forEach items="${students}" var="student">
                <tr>
                    <td>${student.rollNum}</td>
                    <td>${student.name}</td>
                    <td>${student.grade}</td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
</body>
</html>
