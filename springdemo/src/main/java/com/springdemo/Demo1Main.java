package com.springdemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo1Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("/com/springdemo/spring-config.xml");
		Employee employee = (Employee) context.getBean("employee");
		Employee employee1 = (Employee) context.getBean("employee");
		employee.setEmpName("Welcome to SpringDemo");
		employee.setEmpId(51886550);
		System.out.println(employee.getEmpName());
		System.out.println(employee.getEmpId());
		employee1.setEmpName("Thanks for watching SpringDemo");
		employee1.setEmpId(100);
		System.out.println(employee1.getEmpName());
		System.out.println(employee1.getEmpId());
		System.out.println("BYE");
	}

}
