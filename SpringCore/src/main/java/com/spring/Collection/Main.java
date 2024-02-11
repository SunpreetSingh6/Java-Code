package com.spring.Collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main 
{
	public static void main(String[] args) 
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("com/spring//Collection/Config.xml");
		Employee emp = (Employee)context.getBean("employee");
		System.out.println(emp.getEname());
		System.out.println(emp.getEphoneno());
		System.out.println(emp.getEaddress());
		System.out.println(emp.getEprojects());
	}
}
