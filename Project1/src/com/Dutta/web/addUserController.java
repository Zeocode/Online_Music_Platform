package com.Dutta.web;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.Dutta.web.dao.userDAO;
import com.Dutta.web.models.user;

/**
 * Servlet implementation class addUserController
 */
public class addUserController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public addUserController() {
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
		obj.setFname(request.getParameter("firstName"));
		obj.setLname(request.getParameter("lastName"));
		obj.setEmail(request.getParameter("email"));
		obj.setUsername(request.getParameter("userName"));
		obj.setPassword(request.getParameter("password"));
		//String SQL="INSERT INTO MUSIC(music_name,category,language,path) VALUES('"+sname+"','"+cat+"','"+lang+"','"+path+"')";
		
		userDAO dao = new userDAO();
		dao.addUser(obj);
		response.sendRedirect("getuserController"); 
	}
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
