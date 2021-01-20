package com.newlec.app.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class CharacterEncodingFilter implements Filter {

	@Override
	public void doFilter(ServletRequest req
			, ServletResponse resp
			, FilterChain chain)
			throws IOException, ServletException {
		// TODO Auto-generated method stub
		req.setCharacterEncoding("UTF-8");
		System.out.println("서블릿이 실행되기 전 출력");
		chain.doFilter(req, resp);
		System.out.println("서블릿 실행이후 다음 서블릿 실행전 출력");
		
	}

}
