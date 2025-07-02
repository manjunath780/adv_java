<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>User Registration Form</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f2f2f2;
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
        }
        .registration-form {
            background-color: #fff;
            padding: 20px 40px;
            border-radius: 8px;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
            width: 400px;
        }
        .registration-form h2 {
            text-align: center;
            margin-bottom: 20px;
        }
        .registration-form label {
            display: block;
            margin-top: 10px;
        }
        .registration-form input[type="text"],
        .registration-form input[type="email"],
        .registration-form input[type="password"] {
            width: 100%;
            padding: 8px;
            margin-top: 5px;
            border: 1px solid #ccc;
            border-radius: 4px;
        }
        .registration-form input[type="submit"] {
            margin-top: 20px;
            width: 100%;
            padding: 10px;
            background-color: #4CAF50;
            border: none;
            color: white;
            font-size: 16px;
            border-radius: 4px;
            cursor: pointer;
        }
        .registration-form input[type="submit"]:hover {
            background-color: #45a049;
        }
    </style>
</head>
<body>
    <form class="registration-form" action="registerUser" method="post">
        <h2>User Registration</h2>

        <input type="text"  name="userId"  placeholder="User ID" required>


        <input type="text" name="givenName" placeholder="Given Name" required>


        <input type="text" name="surName" placeholder="Surname" required>


        <input type="email" name="emailId" placeholder="Email ID" required>


        <input type="password"  name="password" placeholder="Password" required>


        <input type="password"  name="confirmPassword" placeholder="Confirm Password" required>

        <input type="submit" value="Register">
    </form>
</body>
</html>
