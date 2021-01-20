package com.newlec.app;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;

import java.io.*;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/add")
public class add extends HttpServlet{
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		resp.setCharacterEncoding("UTF-8");
		resp.setContentType("text/html; charset = UTF-8");
		PrintWriter out = resp.getWriter();
		String x_ = req.getParameter("x");
		String y_ = req.getParameter("y");
		int x = 0;
		int y = 0;
		if(x_ != null && y_!=null && !x_.equals("") && !y_.equals("") ) {
			x = Integer.parseInt(x_);
			y = Integer.parseInt(y_);
		}
	
		int xysum = x+y;
		out.println("°á°ú : " + xysum);
	}
}
