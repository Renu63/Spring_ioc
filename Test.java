package com.tech;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		System.out.println("main called ");
		ApplicationContext ap= new ClassPathXmlApplicationContext("Spring.xml");
		System.out.println("Xml file pass");
		Welcome bean = (Welcome)ap.getBean("w");
		bean.test(); 
	}
} 
