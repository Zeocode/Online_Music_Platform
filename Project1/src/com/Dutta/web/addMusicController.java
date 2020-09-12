package com.Dutta.web;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import com.Dutta.web.dao.musicDAO;
import com.Dutta.web.models.music;

public class addMusicController extends HttpServlet {
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		music obj = new music();
		obj.setSongname(request.getParameter("songname"));
		obj.setCat(request.getParameter("category"));
		obj.setLang(request.getParameter("language"));
		obj.setPath(request.getParameter("path"));
		
		musicDAO dao = new musicDAO();
		dao.addMusic(obj);
		response.sendRedirect("getmusicController"); 
	}


}