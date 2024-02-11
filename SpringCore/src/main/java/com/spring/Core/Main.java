package com.spring.Core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/Core/Config.xml");
        Student st1 = (Student)context.getBean("st1");
        Student st2 = (Student)context.getBean("st2");
        Student st3 = (Student)context.getBean("st3");
        System.out.println(st1);
        System.out.println(st2);
        System.out.println(st3);
    }
}
