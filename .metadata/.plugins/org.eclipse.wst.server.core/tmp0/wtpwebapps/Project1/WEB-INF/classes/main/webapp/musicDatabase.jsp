<%@ page import="java.sql.*" %>
<%
	ResultSet rs = (ResultSet)request.getAttribute("table");
%>
<!DOCTYPE html>
<html lang="en">
<head>
<title>
AdminDatabase
</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
  <style>
  </style>
  </head>
  
  <body>
  <nav class="navbar navbar-inverse">
  <div class="container-fluid">
    <div class="navbar-header">
      <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#myNavbar">
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>                        
      </button>
      
      <a class="navbar-brand" href="#">HiveMusic</a>
     
    </div>
      <ul class="nav navbar-nav">
        <li><a href="adminChoice.jsp">Databses</a></li>
        <li><a href="getuserController">User Database</a></li>
      </ul>
      <ul class="nav navbar-nav navbar-right">
        <li><a href="logout.jsp"><span class="glyphicon glyphicon-log-in"></span> Logout</a></li>
      </ul>
    </div>
 
</nav>
  <div class="container">
  
  <br>
  <h2>Music List</h2>
  <br>
   <div class="row">
  <div class="col-sm-10" >
   <input class="form-control" id="myInput" type="text" placeholder="Search..">
   </div>
  
   <div class="col-sm-2" >
  <a href="addMusic.jsp" id="add" type="button" class="btn btn-primary">Add Songs</a>   
  </div>
   </div>  
  <br>   
  <br> 
  <table class="table table-hover">
    <thead>
      <tr>
        <th>Song</th>
        <th>Category</th>
        <th>Language</th>
        <th>Track</th>
        <th>Tool</th>
      </tr>
    </thead>
    
    <tbody id="myTable">
    <%while(rs.next()) { 
    %>
      <tr>
        <td><%=rs.getString("music_name") %></td>
        <td><%=rs.getString("category") %></td>
        <td><%=rs.getString("language") %></td>
        <td>
        <audio controls>
  			<source src="<%=rs.getString("path") %>" type="audio/mpeg">
		</audio>
        
        </td>
        <td>
        <a href='getdelMusicController?id=<%=rs.getString("id") %>' class="btn-btn-primary">Delete</a>
        <td>
        
      </tr>
     <%} %>
    </tbody>
  </table>
</div>

 <script>
	$(document).ready(function(){
  	$("#myInput").on("keyup", function() {
    var value = $(this).val().toLowerCase();
    $("#myTable tr").filter(function() {
     $(this).toggle($(this).text().toLowerCase().indexOf(value) > -1)
    		});
  		});
	});
	</script>

</body>
</html>