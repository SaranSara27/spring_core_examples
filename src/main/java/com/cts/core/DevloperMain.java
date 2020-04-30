package com.cts.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DevloperMain {

	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("springcore.xml");
		Developer d1 = (Developer) ac.getBean("dev1");
		System.out.println(d1);
	}

}
