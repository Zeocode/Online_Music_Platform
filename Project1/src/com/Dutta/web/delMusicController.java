package com.Dutta.web;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.Dutta.web.dao.musicDAO;
import com.Dutta.web.models.music;


public class delMusicController extends HttpServlet {
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		music obj = new music();
		obj.setId(request.getParameter("id"));
		musicDAO dao = new musicDAO();
		dao.delMusic(obj);
		RequestDispatcher rd=request.getRequestDispatcher("getmusicController");  
        rd.forward(request, response); 
	}


}