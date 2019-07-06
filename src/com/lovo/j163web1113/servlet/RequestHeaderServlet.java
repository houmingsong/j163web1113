package com.lovo.j163web1113.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/RequestHeaderServlet")
public class RequestHeaderServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");

		PrintWriter out = response.getWriter();

		// 获取请求头的信息
//		String host = request.getHeader("Host");
//		String accept = request.getHeader("ACCEPT");
//		String userAgent = request.getHeader("User-Agent");
//		
//		if(userAgent.contains("Chrome")) {
//			out.println("发送请求的的浏览器为：Chrome浏览器<br>");
//		}else {
//			out.println("发送请求的的浏览器为：IE浏览器<br>");
//		}
		
		Enumeration<String> headers = request.getHeaderNames();
		while(headers.hasMoreElements()) {//判断是否还有请求头
			String headersName = headers.nextElement();//便利每一个请求头的名字，获取请求头的名字
			String headerValue = request.getHeader(headersName);//通过请求头名字获取相应的值
			out.println(headersName + ": " + headerValue + "<br>");
		}

//		out.println("Host: " + host + "<br>");
//		out.println("ACCEPT: " + accept + "<br>");
//		out.println("User-Agent: " + userAgent);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
