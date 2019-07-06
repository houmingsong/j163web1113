package com.lovo.j163web1113.servlet;

import java.io.IOException;
import java.util.Collection;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

@WebServlet("/upload")
@MultipartConfig // ��Servlet3.0�ϴ��������
public class UploadServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		String username = request.getParameter("username");
		System.out.println(username);

		// ͨ���ļ��ϴ������name���Եõ�part�����ļ��ϴ����֣�
		// Part part = request.getPart("uploadFile");
		Collection<Part> partList = request.getParts();
		for (Part part : partList) {
			String fileInfo = part.getHeader("Content-Disposition");
			if (fileInfo.contains("filename")) {
			String fileName = this.getFileName(fileInfo);
			String uploadDir = this.getServletContext().getRealPath("upload");
			String filePath = uploadDir + "\\" + fileName;
			// ���ϴ����ļ�д���ƶ�·��
			part.write(filePath);
			}
		}

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

	private String getFileName(String fileInfo) {
		String[] s = fileInfo.split("\"");
		String fileName = s[s.length - 1];
		// System.out.println(fileName);
		return fileName;

	}
}
