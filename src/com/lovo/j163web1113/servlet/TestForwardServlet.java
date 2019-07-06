package com.lovo.j163web1113.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/TestForwardServlet")
public class TestForwardServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//requesst对象作为仓库保存数据（任意类型的数据）
		request.setAttribute("username", "张三");
		this.getServletContext().setAttribute("username","李四");
		//请求转发
//		RequestDispatcher rd = request.getRequestDispatcher("/TestForwardServlet2");
//		rd.forward(request, response);
		
		//重定向
		response.sendRedirect("TestForwardServlet2");
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
