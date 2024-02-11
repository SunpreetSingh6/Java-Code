package com.spring.AnnotationBasedConfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main 
{
	public static void main(String[] args) 
	{
		/*  Now here we can't use ClassPathXmlApplicationContext() because we are not using any xml file,
			Instead we have to look for another implementation class of ApplicationContext that is doing
			annotation based configuration.
		*/
		
		//ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/AnnotationBasedConfig/config.xml"); 
		
		ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
		Demo d = context.getBean("getDemo", Demo.class);
		System.out.println(d);
		d.show();
	}

}
