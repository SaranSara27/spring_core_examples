package com.cts.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class GreetMain {

	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("springcore.xml");
		Greet gt =    (Greet) ac.getBean("g1");
		System.out.println(gt.getMessage());

	}

}
