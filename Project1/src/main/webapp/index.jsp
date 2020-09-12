<!DOCTYPE html>
<html lang="en">
<head>
  <title>HiveMusic</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css">
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js"></script>
  <style>
  #right-panel-link {
  position: absolute;
  bottom: 0;
  right: 0;
}
  </style>
</head>
<body>

<div class="container">
	<br>
	<br>
  <h1>HiveMusic</h1>
  <p>An Online Music Streaming Platform</p>
  <div class="row">
    <div class="col-sm-7" >
    	<img src="home_pic.jpg"  alt="Pic is not loaded">
	</div>
    <div class="col-sm-4" style="background-color:lavenderblush;"><br>
    <form action="getuserLoginController"method="post">
    <div class="form-group">
      <label for="usr">Username:</label>
      <input type="text" class="form-control" id="usr" name="userName">
    </div>
    <div class="form-group">
      <label for="pwd">Password:</label>
      <input type="password" class="form-control" id="pwd" name="password">
    </div>
    <button type="submit" class="btn btn-primary">Login</button>
    <button type="reset" class="btn btn-primary">Reset</button>
  </form><br><br>
  <a id ="right-panel-link" class="btn btn-link" href="register.jsp">Register</a> 
   </div>
   
</div>
<a  class="btn btn-link" href="adminlogin.jsp">Admin Login</a> 
</div>

</body>
</html>
