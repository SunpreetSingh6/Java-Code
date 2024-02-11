package com.spring.SetterInjection;

import java.util.List;

import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Employee 
{
	// Properties/Setter injection using 1)Primitive Datatype , 2)Collections , 3) Reference
	private String name;							 
	private List<String> phone;
	private Set<String>	address;
	private Map<Integer,String> projects;
	private Properties LoginDetails;
	private EmpDetails empdet;
	
	public void setName(String name)
	{
		this.name = name;
	}
	public String getName()
	{
		return name;
	}
	public void setPhone(List<String> phone)
	{
		this.phone = phone;
	}
	public List<String> getPhone()
	{
		return phone;
	}
	public void setAddress(Set<String> address)
	{
		this.address = address;
	}
	public Set<String> getAddress()
	{
		return address;
	}
	public void setProjects(Map<Integer,String> projects)
	{
		this.projects = projects;
	}
	public Map<Integer,String> getProjects()
	{
		return projects;
	}
	public Properties getLoginDetails() 
	{
		return LoginDetails;
	}
	public void setLoginDetails(Properties loginDetails) 
	{
		LoginDetails = loginDetails;
	}
	public EmpDetails getEmpdet() {
		return empdet;
	}
	public void setEmpdet(EmpDetails empdet) {
		this.empdet = empdet;
	}
	
	/* No need to create constructors bcz we are using property/setter Injection

	public Employee(String name, List<String> phone, Set<String> address, Map<Integer, String> projects,
			Properties loginDetails, EmpDetails empdet) {
		super();
		this.name = name;
		this.phone = phone;
		this.address = address;
		this.projects = projects;
		LoginDetails = loginDetails;
		this.empdet = empdet;
	}
	public Employee()
	{
		super();
	}
	*/
	
}
