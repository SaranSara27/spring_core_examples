package com.cts.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PersonMain {

	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("springcore.xml");
		Person pr1 = (Person) ac.getBean("p1");
		System.out.println(pr1);
		

	}

}
