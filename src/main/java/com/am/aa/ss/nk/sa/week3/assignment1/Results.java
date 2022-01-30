package com.am.aa.ss.nk.sa.week3.assignment1;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

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
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	/**
	 * Date -28/01/22 Author - Samridhi method to gather marks from final.jsp
	 * computing marks and forwarding the results to results.jsp
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String marks1 = request.getParameter("m1");
		double m1 = Double.valueOf(marks1);

		String marks2 = request.getParameter("m2");
		double m2 = Double.valueOf(marks2);

		String marks3 = request.getParameter("m3");
		double m3 = Double.valueOf(marks3);

		String marks4 = request.getParameter("m4");
		double m4 = Double.valueOf(marks4);

		String marks5 = request.getParameter("m5");
		double m5 = Double.valueOf(marks5);

		double avg = ((m1 + m2 + m3 + m4 + m5) / 5);

		// code for minimum,maximum and grade scheme
		String grade = "Something went wrong!";
		double gradePoint = 0.0;

		if (avg <= 49) {
			grade = "F";
			gradePoint = 0.0;
		} else if (avg > 49 && avg <= 59) {
			grade = "D";
			gradePoint = 1.0;
		} else if (avg > 59 && avg <= 62) {
			grade = "C-";
			gradePoint = 1.7;
		} else if (avg > 62 && avg <= 66) {
			grade = "C";
			gradePoint = 2.0;
		} else if (avg > 66 && avg <= 69) {
			grade = "C+";
			gradePoint = 2.3;
		} else if (avg > 69 && avg <= 72) {
			grade = "B-";
			gradePoint = 2.7;
		} else if (avg > 72 && avg <= 76) {
			grade = "B";
			gradePoint = 3.0;
		} else if (avg > 76 && avg <= 79) {
			grade = "B+";
			gradePoint = 3.2;
		} else if (avg > 79 && avg <= 86) {
			grade = "A-";
			gradePoint = 3.5;
		} else if (avg > 86 && avg <= 93) {
			grade = "A";
			gradePoint = 3.7;
		} else if (avg > 93 && avg <= 100) {
			grade = "A+";
			gradePoint = 4.0;
		}

		Double[] scores = { m1, m2, m3, m4, m5 };

		double maxScore = findMaxScore(scores);
		double minScore = findMinScore(scores);

		String studentName = request.getParameter("studentname");

		HttpSession session = request.getSession(false);
		// save information in session
		session.setAttribute("studentName", studentName);
		session.setAttribute("average", avg);
		session.setAttribute("grade", grade);
		session.setAttribute("gradePoint", gradePoint);
		session.setAttribute("minScore", minScore);
		session.setAttribute("maxScore", maxScore);
		response.sendRedirect("Result.jsp");
	}

	private double findMaxScore(Double[] scores) {
		Double maxScore = 0.0;
		if (scores.length > 0) {
			maxScore = scores[0];
			for (int i = 1; i < scores.length; i++) {
				if (scores[i] > maxScore) {
					maxScore = scores[i];
				}
			}
		}
		return maxScore;
	}

	private double findMinScore(Double[] scores) {
		Double minScore = 0.0;
		if (scores.length > 0) {
			minScore = scores[0];
			for (int i = 1; i < scores.length; i++) {
				if (scores[i] < minScore) {
					minScore = scores[i];
				}
			}
		}
		return minScore;
	}

}
