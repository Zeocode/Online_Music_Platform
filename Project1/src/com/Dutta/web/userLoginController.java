package com.Dutta.web;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.Dutta.web.dao.userDAO;
import com.Dutta.web.models.user;
/**
 * Servlet implementation class userLoginController
 */
public class userLoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public userLoginController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		user obj = new user();
		userDAO dao =new userDAO();
		String username = request.getParameter("userName");
		String password = request.getParameter("password");
		obj.setUsername(username);
		obj.setPassword(password);
		
		boolean flag = dao.validate(obj);
		if(flag)
		{
			response.sendRedirect("getmusicUController");
		}
		else
		{
			response.sendRedirect("invalid.jsp");
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
