package com.sunpreet.Mapping;

import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

	@Entity
public class Student 
{
	@Id
	private int sid;
	private String sname;
	@OneToMany(mappedBy = "stud"/*,fetch = FetchType.EAGER,cascade = CascadeType.ALL*/)
	private List<Laptop> laptop;
	
	public List<Laptop> getLaptop() {
		return laptop;
	}
	public void setLaptop(List<Laptop> laptop) {
		this.laptop = laptop;
	}
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", laptop=" + laptop + "]";
	}
	
	
}
