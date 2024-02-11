package com.springORM.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="student_details")
public class Student 
{	
	@Id
	@Column(name="student_id")
	private int id;
	@Column(name="student_name")
	private String name;
	@Column(name="student_city")
	private String city;
	
	public void setId(int id)
	{
		this.id = id;
	}
	public int getId()
	{
		return id;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public String getName()
	{
		return name;
	}
	public void setCity(String city)
	{
		this.city = city;
	}
	public String getCity()
	{
		return city;
	}
	
	public Student()
	{
		super();
	}
	public Student(int id , String name , String city)
	{
		super();
		this.id = id;
		this.name = name;
		this.city = city;
	}
	@Override
	public String toString() 
	{
		return "Student [id=" + id + ", name=" + name + ", city=" + city + "]";
	}
	
	
	
	
}

