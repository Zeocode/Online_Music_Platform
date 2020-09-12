package com.Dutta.web.dao;

import java.sql.*;
import com.Dutta.web.models.admin;
public class adminDAO {
	public boolean validate(admin a){
		try
		{
			 Class.forName("com.mysql.jdbc.Driver");
			    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/details",
			            "root", "");
			    Statement st = con.createStatement();
			    ResultSet rs;
			    rs = st.executeQuery("select * from ADMIN where username='"+a.getUsername()+"' and password='"+a.getPassword()+"'");
			    if(rs.next()) {
			    	return true;			    	
			    }
			    else
			    {
			    	return false;
			    }
		}
		catch(Exception e)
		{
			System.out.println("Error"+e);
		}
		return(false);
		
		
	}

}
