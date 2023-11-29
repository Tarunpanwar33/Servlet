package com.jspiders.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/MyServlet6")
public class MyServlet6 extends HttpServlet {

	
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
	 resp.setContentType("text/html");
	 PrintWriter writer = resp.getWriter();
	 writer.println("<h1> Response from MyServlet6 </h1>");
	 
	 RequestDispatcher dispatcher = req.getRequestDispatcher("MyServlet7");
	 dispatcher.include(req, resp);
	}
	
	
	
}
