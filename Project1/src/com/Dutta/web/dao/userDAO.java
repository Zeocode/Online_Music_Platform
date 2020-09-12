package com.Dutta.web.dao;
import java.sql.*;
import com.Dutta.web.models.user;
public class userDAO {
	public boolean validate(user obj)
	{
		String userName = obj.getUsername();
	    String password = obj.getPassword();
	    try
	    {
	    	Class.forName("com.mysql.jdbc.Driver");
	   
		    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/details",
		            "root", "");
		    Statement st = con.createStatement();
		    ResultSet rs;
		    //System.out.println(userName+" "+password);
		    rs = st.executeQuery("select * from USER where username='" + userName + "' and password='" + password + "'");
		    //System.out.println(rs.next());
		    //System.out.println(userName+" "+password);
		    if (rs.next()) {
		        return true;
		    } 
		    else {
		        return false;
		    }	
		    
	    }
	    catch(Exception e)
	    {
	    	System.out.println("Error in userDAO.java"+e);
	    }
	   
	    return false;
	}
	public void delUser(String id)
	{
		//System.out.println("Working"+id);
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/details","root", "");
			Statement st = con.createStatement();
			st.executeUpdate("delete from USER where id='" + id + "'");
		}
		catch(Exception e) {
		   System.out.println("Error: unable to load driver class!"+e);
		   
		}
		
		
	
	}
	public void addUser(user obj)
	{
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/details","root", "");
			Statement st = con.createStatement();
			String SQL = "insert into USER(first_name, last_name, email, username, password, regdate) values ('" + obj.getFname() + "','"
				    + obj.getLname() + "','" + obj.getEmail() + "','" + obj.getUsername()+ "','" + obj.getPassword() + "', CURDATE())";
			st.executeUpdate(SQL);
		}
		catch(Exception e) {
		   System.out.println("Error: unable to load driver class!"+e);
		   
		}
	}
	
	public ResultSet data()
	{
		ResultSet rs;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/details","root", "");
			Statement st = con.createStatement();
			String SQL = "select * from USER";
				    
			rs=st.executeQuery(SQL);
			return(rs);
		}
		catch(Exception e) {
		   System.out.println("Error: unable to load driver class!"+e);
		   
		}
		return(null);
		
	}

}
