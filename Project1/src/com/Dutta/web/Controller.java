package com.Dutta.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class Controller extends HttpServlet {
	
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int i = Integer.parseInt(request.getParameter("id"));
		PrintWriter out  = response.getWriter();
		out.println("ID = "+i);
		
	}

}
