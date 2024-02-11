package com.spring.Collection;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Employee 
{
	private String ename;
	private List<String> ephoneno;
	private Set<String>	eaddress;
	private Map<String, String> eprojects;

	public void setEname(String ename)
	{
		this.ename = ename;	
	}
	public String getEname()
	{
		return ename;
	}
	public List<String> getEphoneno() {
		return ephoneno;
	}
	public void setEphoneno(List<String> ephoneno) {
		this.ephoneno = ephoneno;
	}
	public Set<String> getEaddress() {
		return eaddress;
	}
	public void setEaddress(Set<String> eaddress) {
		this.eaddress = eaddress;
	}
	public Map<String, String> getEprojects() {
		return eprojects;
	}
	public void setEprojects(Map<String, String> eprojects) {
		this.eprojects = eprojects;
	}
	@Override
	public String toString() {
		return "Employee [ename=" + ename + ", ephoneno=" + ephoneno + ", eaddress=" + eaddress + ", eprojects="
				+ eprojects + "]";
	}
	
}
