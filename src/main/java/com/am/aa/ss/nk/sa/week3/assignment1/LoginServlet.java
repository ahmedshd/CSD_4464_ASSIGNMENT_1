package com.am.aa.ss.nk.sa.week3.assignment1;

/***
 * 
 * @author Abhinav
 * Date 27-01-2022
 * 
 * This will authenticate the user's credentials.
 * 
 */

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet(description = "This will authenticate the user's credentials.", urlPatterns = { "/login" })
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.sendRedirect("Login.jsp");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		HttpSession session = request.getSession(false);
		if(email == null || password == null || email.strip().equals("") || password.strip().equals("")) {
			//save message in session
			session.setAttribute("message", "<p style=\"color:red;\">Please enter all the values.</p>");
			response.sendRedirect("Login.jsp");
		} else if("admin".equalsIgnoreCase(email) && "admin".equals(password)) {
			
		} else {
			session.setAttribute("message", "<p style=\"color:red;\">Email or Password is wrong!</p>");
			response.sendRedirect("Login.jsp");
		}
	}
}
