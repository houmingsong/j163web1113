package com.lovo.j163web1113.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/AnalyseRequestServlet")
public class AnalyseRequestServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");

		PrintWriter out = response.getWriter();

		out.print("请求的方法为：" + request.getMethod() + "<br>");
		out.print("请求的URL为：" + request.getRequestURL() + "<br>");
		out.print("请求的URI为：" + request.getRequestURI() + "<br>");
		out.print("请求的协议为：" + request.getProtocol() + "<br>");
		out.print("请求的上下文为：" + request.getContextPath() + "<br>");
		out.print("请求servlet的映射路径为：" + request.getServletPath() + "<br>");
		out.print("请求servlet的查询参数为：" + request.getQueryString() + "<br>");
		
		out.close();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
