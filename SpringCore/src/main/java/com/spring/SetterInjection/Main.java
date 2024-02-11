package com.spring.SetterInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main 
{
	public static void main(String[] args) 
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/SetterInjection/SIConfig.xml");
		Employee e1 = (Employee) context.getBean("e1");
		System.out.println("Name:- " + e1.getName());
		System.out.println("Phone:- " + e1.getPhone());
		System.out.println("Address:- " + e1.getAddress());
		System.out.println("Projects:- " + e1.getProjects());
		System.out.println("LoginDetails:- " + e1.getLoginDetails());
		System.out.println("EmployeeDetails:- " + "Id->" + e1.getEmpdet().getId()+ " , Branch->" + 
		e1.getEmpdet().getBranch()+ " , Salary->" + e1.getEmpdet().getSalary());
	}

}
