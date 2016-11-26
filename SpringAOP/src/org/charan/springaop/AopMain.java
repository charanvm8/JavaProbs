package org.charan.springaop;

import org.charan.service.Shape;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AopMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stu
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
			  Shape shape = context.getBean("shape",Shape.class);
			  System.out.println(shape.getCircle().getName());
			
		
		
		

	}

}
