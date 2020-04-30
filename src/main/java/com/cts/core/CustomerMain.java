package com.cts.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CustomerMain {

	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("springcore.xml");
		Customer c1 = (Customer) ac.getBean("cust1");
		System.out.println(c1);


	}

}
