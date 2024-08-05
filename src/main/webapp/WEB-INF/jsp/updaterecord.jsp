<!DOCTYPE html>
<html>
<head>
    <meta charset='utf-8'>
    <title>Update Existing Student Details</title>
    <link rel='stylesheet' type='text/css' media='screen' href='style.css'>
</head>
<body>
    <h2>Update Student Details</h2>
    <h4>You can update Name or Grade for valid Roll Number</h4>
    <h4>Enter your details even if there is no change</h4>
    
    <form action="/updateStudent" method="post">
        <label for="rollNum">Roll Number:</label>
        <input type="text" placeholder="Roll Number" id="rollNum"  name="rollNum" required><br><br>
        
        <label for="name">Name:</label>
        <input type="text" placeholder="Full Name" id="name" name="name" required><br><br>
        
        <label for="grade">Grade:</label>
        <input type="text" placeholder="Grade in Decimal" id="grade" name="grade" required><br><br>
        
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