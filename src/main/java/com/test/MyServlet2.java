package com.test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyServlet2 extends HttpServlet{

	
	public MyServlet2()
	{
		System.out.println("s2 const called...");
	}
	
	
	public void init(ServletConfig cfg) throws ServletException
	{
		super.init(cfg);
		System.out.println("s2 init called....");
		String p1value = cfg.getInitParameter("p1");
		System.out.println(p1value);
		
		
		String val = cfg.getServletContext().getInitParameter("abc");
		System.out.println(val);
	}
	
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doPost(req,resp);
	}


	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("method called...");
		
		
		
		String ssss = getServletConfig().getInitParameter("p1");
		System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$  "+ssss);
		
		String s1 = req.getParameter("stdname");
		String s2 = req.getParameter("stdcity");
		
		resp.setContentType("text/html");
        PrintWriter pw =  resp.getWriter();
		pw.println("<html>");
		pw.println("<body>");
		pw.println("<h2>"+s1+" / "+s2+ "</h2>");
		pw.println("</body></html>");
	}

	
	public void destroy()
	{
		System.out.println("destroy called....");
	}
	
}
