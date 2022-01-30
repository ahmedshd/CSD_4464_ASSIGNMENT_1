package com.ss.assignment1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Results
 */
@WebServlet("/Results")
public class Results extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Results() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String marks1=request.getParameter("m1");
		int m1= Integer.parseInt(marks1);

		String marks2=request.getParameter("m2");
		int m2= Integer.parseInt(marks2);

		String marks3=request.getParameter("m3");
		int m3= Integer.parseInt(marks3);

		String marks4=request.getParameter("m4");
		int m4= Integer.parseInt(marks4);

		String marks5=request.getParameter("m5");
		int m5= Integer.parseInt(marks5);

		double avg= ((m1+m2+m3+m4+m5)/5);
		
		response.setContentType("text/html");  
	    PrintWriter out = response.getWriter();
	    
		String n=request.getParameter("studentname");
		 
		request.setAttribute("Name",n);
		request.setAttribute("average", avg);
		request.getRequestDispatcher("Webpage.jsp").forward(request, response);
		 String redirectURL = "Webpage.jsp";
	     response.sendRedirect(redirectURL);
	     
		
		 // add code for minimum,maximum and grade scheme
		 
		 
		 
		 
		 out.flush();
	}

}
