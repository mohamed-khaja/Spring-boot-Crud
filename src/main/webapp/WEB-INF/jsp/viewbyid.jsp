<!DOCTYPE html>
<html>
<head>
    <meta charset='utf-8'>
    <title>Update Existing Student Details</title>
    <link rel='stylesheet' type='text/css' media='screen' href='style.css'>
</head>
<body>
    <h2>View Student Details</h2>
    <h4>Enter the student Roll number</h4>
    
    <form action="/viewstudent" method="post">
        <label for="rollNum">Roll Number:</label>
        <input type="text" placeholder="Roll Number" id="rollNum"  name="rollNum" required><br><br>

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