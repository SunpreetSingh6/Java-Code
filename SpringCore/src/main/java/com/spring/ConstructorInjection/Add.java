package com.spring.ConstructorInjection;

public class Add 
{
	// This program is to show ambiguity problem(i.e where compiler is confused to call which method).
	// By default <constructor-arg/> tag gives you String 
	
	
	// To solve the ambiguity problem we can just add type="int/double/float" attribute in bean tag.
	
	// We can add index="0/1" to set the value for a and b respectively.
	
	// If we are not adding any attributes(type/index) then the first constructor will be called .
	
	private int a;
	private int b;
	
	public Add(int a, int b )
	{
		this.a = a;
		this.b = b;
		System.out.println("In int:int constructor");
	}
	
	public Add(double a, double b )
	{
		this.a = (int)a;
		this.b = (int)b;
		System.out.println("In double:double constructor");
	}
	
	public Add(String a, String b )
	{
		this.a = Integer.parseInt(a);
		this.b = Integer.parseInt(b);
		System.out.println("In string:string constructor");
	}
	public String toString()
	{
		return "Addition is:- " + (this.a+this.b);
	}
}
