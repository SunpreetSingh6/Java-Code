package com.spring.SetterInjection;

public class EmpDetails 
{
	private int id;
	private String branch;
	private double salary;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	/* No need to create constructors bcz we are using property/setter Injection

	public EmpDetails(int id, String branch, double salary) {
		super();
		this.id = id;
		this.branch = branch;
		this.salary = salary;
	}
	public EmpDetails() {
		super();
		// TODO Auto-generated constructor stub
	}
	*/
	
}
