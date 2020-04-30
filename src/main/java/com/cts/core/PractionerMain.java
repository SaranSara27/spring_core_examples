package com.cts.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PractionerMain {

	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("springcore.xml");
		Practioners p1 = (Practioners) ac.getBean("prac");
		//System.out.println(p1);
		p1.show();

	}

}
