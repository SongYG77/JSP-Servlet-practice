package com.newlec.app;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.catalina.connector.Response;

@WebServlet("/notice_reg")
public class notice extends HttpServlet {
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setCharacterEncoding("UTF-8");
		resp.setContentType("text/html; charset = UTF-8");
		//req.setCharacterEncoding("UTF-8");
		
		PrintWriter out = resp.getWriter();
		String title = req.getParameter("title");
		String cont = req.getParameter("content");
		
		out.println(title);
		out.println(cont);
	}

}