package org.charan.spring;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;


@SuppressWarnings("deprecation")
public class EmployeeApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BeanFactory factory=new XmlBeanFactory(new FileSystemResource("spring.xml"));
		Employee employee=(Employee) factory.getBean("employee");
		employee.salary();
	}

}
