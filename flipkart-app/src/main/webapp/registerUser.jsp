
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <title>Flipkart User Registration</title>
  <style>
    body {
      font-family: Arial, sans-serif;
      background-color: #f1f3f6;
      display: flex;
      justify-content: center;
      align-items: center;
      height: 100vh;
    }
    .register-container {
      background-color: white;
      padding: 30px;
      border-radius: 8px;
      box-shadow: 0 0 15px rgba(0, 0, 0, 0.1);
      width: 350px;
    }
    h2 {
      text-align: center;
      margin-bottom: 20px;
    }
    input[type="text"],
    input[type="email"],
    input[type="password"],
    input[type="tel"] {
      width: 100%;
      padding: 10px;
      margin: 10px 0;
      border: 1px solid #ccc;
      border-radius: 4px;
    }
    button {
      width: 100%;
      padding: 12px;
      background-color: #2874f0;
      color: white;
      border: none;
      border-radius: 4px;
      cursor: pointer;
      font-weight: bold;
    }
    button:hover {
    background-color: #0b61d8;
    }
    .login-link {
      text-align: center;
      margin-top: 15px;
    }
  </style>
</head>
<body>
  <div class="register-container">
    <h2>Flipkart Register</h2>
    <form action="registerUser" method="post">
      <input type="text" name="fullName" placeholder="Full Name" required>
      <input type="tel" name="phone" placeholder="Mobile Number" required>
      <input type="email" name="email" placeholder="Email ID" required>
      <input type="password" name="password" placeholder="Password" required>
      <input type="password" name="confirm_password" placeholder="Confirm Password" required>
      <button type="submit">Register</button>
    </form>
    <div class="login-link">
      Already have an account? <a href="/login">Login</a>
    </div>
  </div>
</body>
</html>

