<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css">
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js"></script>
<style>

</style>
<title>Choice</title>
</head>
<body>
<div class="jumbotron text-center" style="background-color:#ff5722;">
<h1>Admin Login</h1>
</div>
<div class="container">
<div class="row">
<div class="col-sm-12">
	<form action="getuserController" method="get">
		<button id="btn1" type="submit" class="btn btn-primary btn-block">User Database</button>
	</form>
	</div>
	
</div>
<br>

<br>
<div class="row">
<div class="col-sm-12">
	<form action="getmusicController" method="get">
		<button type="submit" class="btn btn-primary btn-block">Music Database</button>
	</form>
	</div>
	
</div>
</div>
	

</body>
</html>