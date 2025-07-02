<html>
<body>
<h2>Registration Form</h2>
  <form action="/submit_registration" method="POST">
    <label for="fullname">Full Name</label>
    <input type="text" id="fullname" name="fullname" required>
<br>
    <label for="email">Email</label>
    <input type="email" id="email" name="email" required>
<br>
    <label for="phone">Phone Number</label>
    <input type="tel" id="phone" name="phone" required>
<br>
    <label for="username">Username</label>
    <input type="text" id="username" name="username" required>
<br>
    <label for="password">Password</label>
    <input type="password" id="password" name="password" required>
<br>
    <label for="confirm">Confirm Password</label>
    <input type="password" id="confirm" name="confirm" required>
<br>
    <input type="submit" value="Register">
  </form>


</body>
</html>
