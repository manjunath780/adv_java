<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page  isELIgnored="false" %>
<%@ taglib prefix="c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <title>User Information Form</title>
  <style>
    body {
      font-family: Arial, sans-serif;
      margin: 20px;
    }
    form {
      max-width: 500px;
      margin: auto;
    }
    label {
      display: block;
      margin-top: 10px;
    }
    input, textarea {
      width: 100%;
      padding: 8px;
      margin-top: 5px;
      box-sizing: border-box;
    }
    button {
      margin-top: 15px;
      padding: 10px 15px;
    }
  </style>
</head>
<body>
  <h2>User Information Form</h2>
  <form action="submit" method="post">


    <label for="name">Name:</label>
    <input type="text" id="name" name="givenName" required>

    <label for="gmail">Email:</label>
    <input type="email" id="gmail" name="gmail" required>

    <label for="phoneNo">Phone Number:</label>
    <input type="tel" id="phoneNo" name="phoneNo" pattern="[0-9]{10}" required>

    <label for="age">Age:</label>
    <input type="number" id="age" name="age" min="0" required>

    <label for="address">Address:</label>
    <textarea id="address" name="address" rows="4" required></textarea>

    <button type="submit">Submit</button>
  </form>
</body>
</html>
