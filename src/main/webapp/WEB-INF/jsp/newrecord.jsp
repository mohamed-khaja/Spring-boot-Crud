<!DOCTYPE html>
<html>
<head>
    <meta charset='utf-8'>
    <title>New Student Entry</title>
    <link rel='stylesheet' type='text/css' media='screen' href='style.css'>
</head>
<body>
    <h2>Enter the Student Details</h2>     
    <form action="/submitStudentInfo" method="post">
        <label for="rollNum">Roll Number:</label>
        <input type="text" placeholder="Roll Number" id="rollNum"  name="rollNum" required><br>
        
        <label for="name">Name:</label>
        <input type="text" placeholder="Full Name" id="name" name="name" required><br>
        
        <label for="grade">Grade:</label>
        <input type="text" placeholder="Grade in Decimal" id="grade" name="grade" required><br>
        
        <button type="submit">Submit</button>
    </form>
    <c:if test="${not empty message}">
        <h2> ${message}</h2>
        <form action="/" method="get">
            <button type="submit" name="action" value="index">Return to Homepage</button>
        </form>
    </c:if>
</body>
</html>