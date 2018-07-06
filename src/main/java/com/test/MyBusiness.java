package com.test;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class MyBusiness {

	
	public List<Customer> getCustomers()
	{
		System.out.println("inside getConstomers method");
	List<Customer> lst = new ArrayList<Customer>();
		
		lst.add(new Customer("1","alph"));
		lst.add(new Customer("2","duluth"));
		lst.add(new Customer("3","roswell"));
		lst.add(new Customer("4","cumming"));
		
		return lst;
	}
	
}
