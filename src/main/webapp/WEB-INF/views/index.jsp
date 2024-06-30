<!DOCTYPE html>
<html>

<head>
    <meta charset='utf-8'>
    <title>Student Database</title>
    <link rel="stylesheet" type="text/css" href="style.css">

</head>

<body>
    <div class="container">
        <h2>Students Grade</h2>
        <form action="/view" method="get">
            <button type="submit" name="action" value="view">View all Students Grade</button>
        </form>
        <form action="/add" method="get">
            <button type="submit" name="action" value="add">Add record</button>
        </form>
        <form action="/update" method="get">
            <button type="submit" name="action" value="update">Update record</button>
        </form>
        <form action="/delete" method="get">
            <button type="submit" name="action" value="delete">Delete a record</button>
        </form>
    </div>
</body>

</html>