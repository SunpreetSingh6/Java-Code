package com.spring.StereoAnnotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main 
{
	public static void main(String[] args) 
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/StereoAnnotation/StereoAnnotation.xml") ;
		
		/*  We have to pass the reference(present in bean's 'name' attribute) of the object to get 
		 	the object, but since we are not using bean so what spring will do it will automatically
		 	create the object(i.e  Student student = new Student() ) with reference 'student' by
		 	using camelcase.
		 	
		 	 In this scenario we have to pass Student's reference i.e 'student' to get the object.
		 	 									Or 
		 	 We can have desired reference name just by doing this -> @Component("st"). 
		*/
		
		Student s1 = context.getBean("student", Student.class);
		System.out.println(s1.hashCode());
		System.out.println(s1);
	//	System.out.println(s1.getPhone());
	//	System.out.println(s1.getPhone().getClass().getName());
		
		Student s2 = context.getBean("student", Student.class);
		System.out.println(s2.hashCode());
		System.out.println(s2);
		
	}
}
