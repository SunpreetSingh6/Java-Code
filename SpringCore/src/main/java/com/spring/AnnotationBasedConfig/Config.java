package com.spring.AnnotationBasedConfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan(basePackages = "com.spring.AnnotationBasedConfig")
public class Config 
{
	/*	
	 	In this we are completely removing Xml file.
	 	
	 	@Configuration is used to tell the java that this java file will provide configuration to this
	 	particular package. 
	 	
	 	Now in xml we used to provide <context:component-scan base-package="com.spring.AnnotationBasedConfig">
	 	to tell the spring container that u have to create the object of the classes with @Component annotation.
	 	
	 	To do the same we have to use @ComponentScan() annotation.
	 */	
	 	
	
	/*	
	 	Now spring container can also create object of our class without using @Component annotation.
	 	By using @Bean annotation spring container will create object of the class which we are returning.
	 	Remember:- bean name is same as of method name , which helps in fetching bean through main. 
	 	We can simply create a method in our config file which must return the object of the class.
	 	
	*/	
		
		@Bean
	 	public Demo getDemo()
	 	{
	 		Demo d = new Demo();
	 		return d;
	 	}
		
	/*
	 	Now we are creating object with @Bean annotation so we remove @ComponentScan annotation
	 	because we are not scanning any package to create objects.
	 	
	 	Note:- @ComponentScan will be used only when we use @Component in any class.
	*/
	
}
