package com.jspiders.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/MyServlet7")
public class MyServlet7 extends HttpServlet {

	
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		resp.setContentType("html/text");
		PrintWriter printWriter = resp.getWriter();
		printWriter.println("<H1 Response from MyServlet7 </h1>");
		
		RequestDispatcher dispatcher = req.getRequestDispatcher("MyServlet6");
		dispatcher.include(req, resp);
	}
	
}
