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

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
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
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		HttpSession session = request.getSession(true);
		session.setAttribute("isLoggedIn", false);
		if(username == null || password == null || username.isBlank() || password.isBlank()) {
			//save message in session
			session.setAttribute("message", "<p style=\"color:red;\">Please enter all the values.</p>");
			response.sendRedirect("Login.jsp");
		} else if("admin".equalsIgnoreCase(username) && "admin".equals(password)) {
			
			// Adding a cookie with the username info
			Cookie userNameCookie = new Cookie("loggedInUser", username);
			userNameCookie.setMaxAge(30*60);
			response.addCookie(userNameCookie);
			
			// Adding username and logIn status in session
			session.setAttribute("isLoggedIn", true);
			session.setAttribute("loggedInUser", username);
			
			RequestDispatcher rd= request.getRequestDispatcher("StudentDetails");
			rd.forward(request,response);
		} else {
			session.setAttribute("message", "<p style=\"color:red;\">Email or Password is wrong!</p>");
			response.sendRedirect("Login.jsp");
		}
	}
}
