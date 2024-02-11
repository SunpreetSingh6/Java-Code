package com.spring.ConstructorInjection;

public class EmpDetails 
{
	private int id;
	private String branch;
	private double salary;
	
	public EmpDetails(int id, String branch, double salary) {
		super();
		this.id = id;
		this.branch = branch;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "EmpDetails [id=" + id + ", branch=" + branch + ", salary=" + salary + "]";
	}
	
	
}
