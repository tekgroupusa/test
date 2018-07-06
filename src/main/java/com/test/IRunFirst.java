package com.test;

import org.aspectj.lang.annotation.Before;

public class IRunFirst {

	@Before("execution(* com.test.MyBusiness.getCustomers(..))")
	public void saySomeThing()
	{
		System.out.println("hello");
	}
}
