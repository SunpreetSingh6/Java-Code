package com.spring.ConstructorInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main 
{
	public static void main(String[] args) 
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/ConstructorInjection/CIConfig.xml");
		Employee e1 = (Employee) context.getBean("e1");
		System.out.println(e1);
		
		Add a = (Add)context.getBean("add");
		System.out.println(a);
	}

}
