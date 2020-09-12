<!DOCTYPE html>
<html lang="en">
<head>
  <title>Admin Login</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js"></script>
</head>
<body>

<div class="jumbotron text-center" style="background-color:#ff5722;">
  <h1>Admin Login</h1>
</div>
  
<div class="container">
<br>
<div class="col-sm-4">
  <form action="getadminLoginController" method="post">
    <div class="form-group">
      <label for="usr">Username:</label>
      <input type="text" class="form-control" id="usr" name="userName">
    </div>
    <div class="form-group">
      <label for="pass">Password:</label>
      <input type="password" class="form-control" id="pass" name="password">
    </div>
    <button type="submit" class="btn btn-primary">Login</button>
    <button type="reset" class="btn btn-primary">Reset</button>
  </form>
</div>
</div>

</body>
</html>
