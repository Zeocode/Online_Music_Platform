<!DOCTYPE html>
<html lang="en">
<head>
  <title>Music</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css">
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js"></script>
</head>
<body>

<div class="container">
<br>
<br>
  <h2>Enter Song Details</h2>
  <br>
  <form action="getaddMusicController">
    <div class="form-group">
      <label for="fname">Song Name:</label>
      <input type="text" class="form-control" id="sname" name="songname">
    </div>
    <div class="form-group">
      <label for="lname">Category :</label>
      <input type="text" class="form-control" id="cat" name="category">
    </div>
    <div class="form-group">
      <label for="eml">Language:</label>
      <input type="text" class="form-control" id="lang" name="language">
    </div>
    <div class="form-group">
      <label for="usr">Path:</label>
      <input type="text" class="form-control" id="path" name="path">
    </div>
    <button type="submit" class="btn btn-primary">Submit</button>
    <button type="reset" class="btn btn-primary">Reset</button>
  </form>
</div>

</body>
</html>
