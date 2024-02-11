package com.spring.AutoWiring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Student 
{
	// Example of Autowiring using Studentclass and Addressclass with Annotation.
	
	/* @Autowired annotation will be used at 3 places:- 1)Variable/properties , 2)Setter , 3)Constructor.
	   @Autowired is disabled by default so we need to add <context:annotation-config> in Xml to 
	   make it enable.
	*/
	
	// @Qualifier(" bean's name ") annotation is used to tell which bean's objects we want 
	// to inject during autowiring. This is useful when we have multiple beans .
	
	private int id;
	private String name;
	@Autowired
	@Qualifier("address1")
	private Address address;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Address getAddress() {
		return address;
	}
	//@Autowired
	public void setAddress(Address address) {
		this.address = address;
	}
	
	//@Autowired
	public Student(int id, String name, Address address) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
	}
	//@Autowired
	public Student(Address address) {
		super();
		this.address = address;
	}
	public Student() {
		super();
	}
	
	
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", address=" + address + "]";
	}

	
}
