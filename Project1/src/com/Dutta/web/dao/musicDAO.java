package com.Dutta.web.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import com.Dutta.web.models.music;

public class musicDAO {
	public ResultSet data()
	{
		ResultSet rs;
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/details",
		            "root", "");


			Statement st = con.createStatement();
			rs=st.executeQuery("Select *from MUSIC");
			return(rs);
		}
		catch(Exception e)
		{
			System.out.println("Exception:"+e);
		}
		return(null);
	}
	public void addMusic(music obj)
	{
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/details","root", "");
			Statement st = con.createStatement();
			String SQL = "INSERT INTO MUSIC(music_name,category,language,path) VALUES('"+obj.getSongname()+"','"+obj.getCat()+"','"+obj.getLang()+"','"+obj.getPath()+"')";
			st.executeUpdate(SQL);
		}
		catch(Exception e) {
		   System.out.println("Error: unable to load driver class!"+e);
		   System.exit(1);
		}
	}
	public void delMusic(music obj)
	{
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/details","root", "");
			Statement st = con.createStatement();
			String SQL="delete from MUSIC where id='" + obj.getId() + "'";
			st.executeUpdate(SQL);
		}
		catch(Exception e) {
		   System.out.println("Error: unable to load driver class!"+e);
		   System.exit(1);
		}
	}
	

	

}
