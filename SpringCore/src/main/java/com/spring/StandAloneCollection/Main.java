package com.spring.StandAloneCollection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main 
{
	public static void main(String[] args) 
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/StandAloneCollection/StandAlone.xml");
		Person p1 = context.getBean("p1", Person.class);
		System.out.println(p1);
		System.out.println(p1.getFriends().getClass().getName());
		System.out.println(p1.getFeestructure());
		System.out.println(p1.getFeestructure().getClass().getName());
		System.out.println("--------------------------------------------------");
		Person p2 = context.getBean("p2", Person.class);
		System.out.println(p2);
		System.out.println(p2.getFriends().getClass().getName());
		System.out.println(p2.getFeestructure());
		System.out.println(p2.getFeestructure().getClass().getName());
		
	}

}
