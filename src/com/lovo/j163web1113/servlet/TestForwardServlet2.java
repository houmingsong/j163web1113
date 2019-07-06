package com.lovo.j163web1113.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/TestForwardServlet2")
public class TestForwardServlet2 extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String usernameInservletConntext = (String)this.getServletContext().getAttribute("username");
		String usernameInRequest = (String)request.getAttribute("username");
		
		//请求转发
//		RequestDispatcher rd = request.getRequestDispatcher("/fail.html");
//		rd.forward(request, response);
		
		response.setContentType("text/html;charset=utf-8");
		
		PrintWriter out = response.getWriter();
		
		out.print("ServletContext作用域的Username: " + usernameInservletConntext + "<br>");
		out.print("Request作用域的Username: " + usernameInRequest + "<br>");
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
