package com.charan.springintro;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mainapp {
	
	public static void main(String[] args) {
	      ApplicationContext context = 
	             new ClassPathXmlApplicationContext("Beans.xml");

	      HelloJava obj = (HelloJava) context.getBean("helloWorld");

	      obj.getMessage();
	   }

}
