<!DOCTYPE html>
<html>
<head>
  <title>Facebook User Registration</title>
  <style>
    body {
      font-family: Arial, sans-serif;
      background-color: #e9ebee;
      display: flex;
      justify-content: center;
      align-items: center;
      height: 100vh;
    }
    .register-form {
      background-color: white;
      padding: 30px;
      border-radius: 10px;
      width: 300px;
      box-shadow: 0 2px 8px rgba(0,0,0,0.2);
    }
    .register-form h2 {
      text-align: center;
      color: #1877f2;
    }
    .register-form input, select {
      width: 100%;
      padding: 10px;
      margin: 8px 0;
      border: 1px solid #ccc;
      border-radius: 6px;
    }
    .gender {
      display: flex;
      justify-content: space-between;
    }
    .gender label {
      margin-right: 10px;
    }
    .register-form button {
      background-color: #1877f2;
      color: white;
      padding: 10px;
      width: 100%;
      border: none;
      border-radius: 6px;
      cursor: pointer;
    }
    .register-form button:hover {
      background-color: #145dbf;
    }
  </style>
</head>
<body>

  <form class="register-form" action="registerUser" method="post">
    <h2>Create Account</h2>

        <input type="text"  name="userId"  placeholder="User ID" required>
    <input type="text" name="firstName" placeholder="First Name" required>
    <input type="text" name="lastName" placeholder="Last Name" required>
    <input type="email"  name="email" placeholder="Email address" required>
    <input type="password" name="newPassword" placeholder="New password" required>

    <label>Date of Birth:</label>
    <input type="date" name="date" required>

    <label>Gender:</label>
    <div class="gender">
      <label><input type="radio" name="gender" value="female"> Female</label>
      <label><input type="radio" name="gender" value="male"> Male</label>
      <label><input type="radio" name="gender" value="custom"> Custom</label>
    </div>

    <button type="submit">Sign Up</button>
  </form>

</body>
</html>
