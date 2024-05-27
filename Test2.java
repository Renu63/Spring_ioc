package com.tech;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Test2 {
	public static void main(String[] args) {
		System.out.println("main start ");
		
		Resource r= new ClassPathResource("Spring.xml");
		BeanFactory b = new XmlBeanFactory(r);
		System.out.println("Xml called ");
		Welcome bean = (Welcome) b.getBean("w");
		bean.test();
	}

}
