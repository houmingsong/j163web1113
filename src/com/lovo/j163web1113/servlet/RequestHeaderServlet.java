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

		// ��ȡ����ͷ����Ϣ
//		String host = request.getHeader("Host");
//		String accept = request.getHeader("ACCEPT");
//		String userAgent = request.getHeader("User-Agent");
//		
//		if(userAgent.contains("Chrome")) {
//			out.println("��������ĵ������Ϊ��Chrome�����<br>");
//		}else {
//			out.println("��������ĵ������Ϊ��IE�����<br>");
//		}
		
		Enumeration<String> headers = request.getHeaderNames();
		while(headers.hasMoreElements()) {//�ж��Ƿ�������ͷ
			String headersName = headers.nextElement();//����ÿһ������ͷ�����֣���ȡ����ͷ������
			String headerValue = request.getHeader(headersName);//ͨ������ͷ���ֻ�ȡ��Ӧ��ֵ
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
