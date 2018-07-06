package com.test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class MyServlet extends GenericServlet{

	
	public MyServlet()
	{
		System.out.println("s1 const called...");
	}
	
	
	public void init(ServletConfig cfg)
	{
		System.out.println("s1 init called....");
		String val = cfg.getServletContext().getInitParameter("abc");
		System.out.println(val);
	}
	
	
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException
	{
		System.out.println("service called...");
		String s1 = req.getParameter("stdname");
		String s2 = req.getParameter("stdcity");
		
		res.setContentType("text/html");
        PrintWriter pw =  res.getWriter();
		pw.println("<html>");
		pw.println("<body>");
		pw.println("<h2>"+s1+"  -   "+s2+ "</h2>");
		pw.println("</body></html>");
		
	}
		
	
	public void destroy()
	{
		System.out.println("destroy called....");
	}
	
}
