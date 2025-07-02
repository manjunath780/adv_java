<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width,initial-scale=1">
  <title>Signup</title>
  <style>
    body { font-family: Arial, sans-serif; background: #f4f4f4; display: flex; justify-content: center; align-items: flex-start; padding: 40px; }
    .signup-container { background: #fff; padding: 20px 30px; border-radius: 8px; box-shadow: 0 2px 10px rgba(0,0,0,0.1); width: 100%; max-width: 400px; }
    .signup-container h2 { text-align: center; margin-bottom: 20px; }
    .form-group { margin-bottom: 15px; }
    .form-group label { display: block; margin-bottom: 5px; font-weight: bold; }
    .form-group input, .form-group select { width: 100%; padding: 8px; border: 1px solid #ccc; border-radius: 4px; }
    .form-group input:focus, .form-group select:focus { border-color: #007BFF; outline: none; }
    .submit-btn { width: 100%; padding: 10px; background: #007BFF; color: white; border: none; border-radius: 4px; cursor: pointer; font-size: 16px; }
    .submit-btn:hover { background: #0056b3; }
  </style>
</head>
<body>
  <div class="signup-container">
    <h2>Create Account</h2>
    <form action="signup" method="post">
      <div class="form-group">
        <label for="username">Username *</label>
        <input type="text" id="username" name="userName" required maxlength="30" placeholder="Choose a username">
      </div>

      <div class="form-group">
        <label for="password">Password *</label>
        <input type="password" id="password" name="password" required minlength="8" placeholder="Enter password">
      </div>

      <div class="form-group">
        <label for="email">Email *</label>
        <input type="email" id="email" name="email" required placeholder="you@example.com">
      </div>

      <div class="form-group">
        <label for="phoneNumber">Phone Number</label>
        <input type="tel" id="phoneNumber" name="phoneNumber" pattern="[0-9]{10,15}" placeholder="1234567890">
      </div>

      <div class="form-group">
        <label for="fullName">Full Name</label>
        <input type="text" id="fullName" name="fullName" placeholder="Your full name">
      </div>

      <div class="form-group">
        <label for="birthday">Birthday *</label>
        <input type="text" id="birthday" name="birthday" required>
      </div>

      <div class="form-group">
        <label for="gender">Gender *</label>
        <select id="gender" name="gender" required>
          <option value="">Select gender</option>
          <option value="male">Male</option>
          <option value="female">Female</option>
          <option value="non_binary">Non‑binary</option>
          <option value="not_specified">Prefer not to say</option>
        </select>
      </div>

      <button type="submit" class="submit-btn">Sign Up</button>
    </form>
  </div>
</body>
</html>
