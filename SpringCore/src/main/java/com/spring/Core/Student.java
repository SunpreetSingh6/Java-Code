package com.spring.Core;

public class Student 
{
	private int sid;
	private String sname;
	private String saddress;
	private double sfees;
	
	
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
	public String getSaddress() {
		return saddress;
	}
	public void setSaddress(String saddress) {
		this.saddress = saddress;
	}
	public double getSfees() {
		return sfees;
	}
	public void setSfees(double sfees) {
		this.sfees = sfees;
	}
	
	
	public Student(int sid, String sname, String saddress, double sfees) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.saddress = saddress;
		this.sfees = sfees;
	}
	public Student() {
		super();
	}
	
	
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", saddress=" + saddress + ", sfees=" + sfees + "]";
	}
	
	
	
	
	
}
