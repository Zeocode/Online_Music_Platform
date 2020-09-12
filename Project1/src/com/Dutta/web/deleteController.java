package com.Dutta.web;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.Dutta.web.dao.userDAO;


public class deleteController extends HttpServlet {
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String id = request.getParameter("id");
		//System.out.println(id);
		userDAO dao = new userDAO();
		dao.delUser(id);
		RequestDispatcher rd=request.getRequestDispatcher("getuserController");  
        rd.forward(request, response); 
	}


}
