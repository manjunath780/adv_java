<!DOCTYPE html>
<html>
<head>
  <title>Customer Form</title>
  <style>
    body {
      font-family: Arial, sans-serif;
      background-color: #f4f4f4;
      padding: 20px;
    }
    .form-container {
      background-color: #fff;
      padding: 20px;
      border-radius: 10px;
      max-width: 500px;
      margin: auto;
      box-shadow: 0 0 10px rgba(0,0,0,0.1);
    }
    .form-group {
      margin-bottom: 15px;
    }
    label {
      display: block;
      font-weight: bold;
    }
    input[type="text"],
    input[type="email"],
    input[type="tel"],
    input[type="date"],
    select {
      width: 100%;
      padding: 8px;
      margin-top: 5px;
      border-radius: 5px;
      border: 1px solid #ccc;
    }
    .checkbox-group {
      display: flex;
      align-items: center;
    }
    .checkbox-group input {
      margin-right: 10px;
    }
    button {
      background-color: #28a745;
      color: white;
      padding: 10px 15px;
      border: none;
      border-radius: 5px;
      cursor: pointer;
    }
    button:hover {
      background-color: #218838;
    }
  </style>
</head>
<body>

  <div class="form-container">
    <h2>Customer Form</h2>
    <form action="registerUser" method="post">


      <div class="form-group">
        <label for="fullName">Full Name</label>
        <input type="text" id="fullName" name="fullName">
      </div>

      <div class="form-group">
        <label for="email">Email</label>
        <input type="email" id="email" name="email">
      </div>

      <div class="form-group">
        <label for="phoneNumber">Phone Number</label>
        <input type="tel" id="phoneNumber" name="phoneNumber">
      </div>

      <div class="form-group">
        <label for="gender">Gender</label>
        <select id="gender" name="gender">
          <option value="">--Select--</option>
          <option value="male">Male</option>
          <option value="female">Female</option>
          <option value="other">Other</option>
        </select>
      </div>

      <div class="form-group">
        <label for="dateOfBirth">Date of Birth</label>
        <input type="date" id="dateOfBirth" name="dateOfBirth">
      </div>

      <div class="form-group">
        <label for="address">Address</label>
        <input type="text" id="address" name="address">
      </div>

      <div class="form-group">
        <label for="city">City</label>
        <input type="text" id="city" name="city">
      </div>

      <div class="form-group">
        <label for="state">State</label>
        <input type="text" id="state" name="state">
      </div>

      <div class="form-group">
        <label for="pincode">Pincode</label>
        <input type="text" id="pincode" name="pincode">
      </div>


      <button type="submit">Submit</button>

    </form>
  </div>

</body>
</html>

