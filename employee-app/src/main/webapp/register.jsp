<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>Employee Registration Form</title>
</head>
<body>
    <h2>Employee Registration Form</h2>
    <form action="registerUser" method="post">

        <label for="employeeName">Employee Name:</label><br>
        <input type="text" id="employeeName" name="employeeName" required><br><br>

        <label for="salary">Salary:</label><br>
        <input type="text" id="salary" name="salary" required><br><br>

        <input type="submit" value="Submit">
    </form>
</body>
</html>
