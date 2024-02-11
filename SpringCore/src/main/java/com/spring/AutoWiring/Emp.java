package com.spring.AutoWiring;

public class Emp 
{	
	// Example of Autowiring using Empclass and Addressclass with Xml.
	
	private int id;
	private String name;
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
	public void setAddress(Address address) {
		this.address = address;
	}
	
	/*		This constructor will not be used bcz we are using <property> tag which will set the values using 	
	  		setter's . Hence single parameterized constructor will be called to set address. 
	  
	public Emp(int id, String name, Address address) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		System.out.println("In multiple parameterized constructor");
	}
	*/
	public Emp(Address address) {
		super();
		this.address = address;
		System.out.println("In single parameterized constructor");
	}
	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Emp [id=" + id + ", name=" + name + ", address=" + address + "]";
	}
	
	
}
