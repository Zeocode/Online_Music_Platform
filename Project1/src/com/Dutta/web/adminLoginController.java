package com.Dutta.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.Dutta.web.dao.adminDAO;
import com.Dutta.web.models.admin;

/**
 * Servlet implementation class adminLoginController
 */
public class adminLoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public adminLoginController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		admin ad = new admin();
		adminDAO dao =new adminDAO();
		String username = request.getParameter("userName");
		String password = request.getParameter("password");
		ad.setUsername(username);
		ad.setPassword(password);
		boolean flag = dao.validate(ad);
		if(flag)
		{
			response.sendRedirect("adminChoice.jsp");
		}
		else
		{
			response.sendRedirect("adminlogin.jsp");
		}
		
		
		
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
