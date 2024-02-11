package com.sunpreet.HQL;

import javax.persistence.Cacheable;
import javax.persistence.Entity;
import javax.persistence.Id;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

@Entity
@Cacheable
@Cache(usage=CacheConcurrencyStrategy.READ_ONLY)
public class Teacher 
{
	@Id
	private int id;
	private int salary;
	private String name;
	private String city;
	
	public void setId(int id){
		this.id = id;
	}
	public int getId(){
		return id;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "Teacher [id=" + id + ", salary=" + salary + ", name=" + name + ", city=" + city + "]";
	}
	
	
}
