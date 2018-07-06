package com.test;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.context.support.SpringBeanAutowiringSupport;

/**
 * Servlet implementation class MySessionServlet
 */
public class MySessionServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	@Autowired
	MyBusiness mb;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public MySessionServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	
	
	
	/* (non-Javadoc)
	 * @see javax.servlet.GenericServlet#init(javax.servlet.ServletConfig)
	 */
	@Override
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		super.init(config);
		SpringBeanAutowiringSupport.processInjectionBasedOnCurrentContext(this);
		
		
	}





	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		
		
//		System.out.println("dopost................................");
//		HttpSession session = request.getSession();
//
//		if (session.isNew()) {
//			session.setAttribute("count", 1);
//			System.out.println("session is new");
//		} else {
//			System.out.println("existing session....");
//			int count = (Integer) session.getAttribute("count");
//			System.out.println(count);
//			session.setAttribute("count", ++count);
//		}
//		System.out.println("forwarding......");
		
		
		
		request.setAttribute("mycust", mb.getCustomers());
		
		request.getRequestDispatcher("/output.jsp").forward(request, response);

	}

}
