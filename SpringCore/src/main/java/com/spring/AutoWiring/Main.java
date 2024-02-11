package com.spring.AutoWiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main 
{
	public static void main(String[] args) 
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/AutoWiring/AutowireConfig.xml");
		System.out.println("Example of Autowiring using Empclass and Addressclass with Xml.");
		Emp e1 = context.getBean("e", Emp.class);
		// No need to typecast when passing 2nd parameter as class name(to whom we want to typecast).
		System.out.println(e1);							
		
		System.out.println("---------------------------------------------------------------------------------");
		
		System.out.println("Example of Autowiring using Studentclass and Addressclass with Annotation.");
		Student s1 = context.getBean("s", Student.class);
		System.out.println(s1);
	}
}
