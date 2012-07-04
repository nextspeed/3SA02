package com.example.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.example.model.*;

@WebServlet("/TcpServlet")
public class Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		String cmd = (String) request.getParameter("command");
			
		System.out.println("==>" + cmd);
		
		Processor process = new Processor();
		String result = process.runProcess(cmd);
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		out.println(result+"<br/>");
		out.println("End the program");
	}

}
