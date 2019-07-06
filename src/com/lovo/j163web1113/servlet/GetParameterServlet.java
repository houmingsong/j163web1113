package com.lovo.j163web1113.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/getParameterServlet")
public class GetParameterServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		request.setCharacterEncoding("utf-8");
		// 获取请求参数
		/*
		 * request.getParameter（）获取单个值 
		 * request.getParameterValues（）获取多个值
		 */
		String username = request.getParameter("username");
		System.out.println(username);
		String password = request.getParameter("password");
		System.out.println(password);
		String sex = request.getParameter("sex");
		System.out.println(sex);
		String[] hobbylist = request.getParameterValues("hobby");
		for (String hobby : hobbylist) {
			System.out.println(hobby);
		}

		String city = request.getParameter("city");
		System.out.println(city);
		String[] idleList = request.getParameterValues("idle");
		for (String idle : idleList) {
			System.out.println(idle);
		}

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
