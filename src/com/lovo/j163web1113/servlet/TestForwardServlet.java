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
		
		//requesst������Ϊ�ֿⱣ�����ݣ��������͵����ݣ�
		request.setAttribute("username", "����");
		this.getServletContext().setAttribute("username","����");
		//����ת��
//		RequestDispatcher rd = request.getRequestDispatcher("/TestForwardServlet2");
//		rd.forward(request, response);
		
		//�ض���
		response.sendRedirect("TestForwardServlet2");
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
