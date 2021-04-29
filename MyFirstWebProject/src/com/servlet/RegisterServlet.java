package com.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RegisterServlet extends HttpServlet{
	public void doPost(HttpServletRequest request, HttpServletResponse response)  
            throws ServletException, IOException {
		System.out.println("do post");
		String name=(String) request.getAttribute("userName");
		name=request.getParameter("userName");
		System.out.println(name);
		RequestDispatcher view = request.getRequestDispatcher("/success.html");
		view.forward(request, response);
		
	}
}
