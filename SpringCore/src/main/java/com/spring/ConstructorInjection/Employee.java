package com.spring.ConstructorInjection;

import java.util.List;

public class Employee 
{
	// Constructor injection using 1)Primitive Datatype , 2)Collections , 3) Reference
	
	private String name;							 
	private List<String> phone;
	private EmpDetails empdet;
	
	public Employee(String name, List<String> phone, EmpDetails empdet) 
	{
		//super();
		this.name = name;
		this.phone = phone;
		this.empdet = empdet;
	}

	@Override
	public String toString() {
		return "Name:-" + name + "\nPhones:-" + phone + "\nEmployeeDetails:-" + empdet;
	}
	
	
}
