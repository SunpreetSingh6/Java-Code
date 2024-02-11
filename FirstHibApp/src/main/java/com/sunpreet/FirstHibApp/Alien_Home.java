package com.sunpreet.FirstHibApp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Alien_Home")
public class Alien_Home
{
	@Id
	@Column(name="alien_id")
	private int aid;
	
	@Column(name="alien_name")
	private String aname;
	
	@Column(name="alien_color")							//@Column(name="alien_color" , length=30)
	private String color;
	
	private Alien_Specs as;
	
	public Alien_Specs getAs() {
		return as;
	}
	public void setAs(Alien_Specs as) {
		this.as = as;
	}
	public void setAid(int aid)
	{
		this.aid = aid;
	}
	public int getAid()
	{
		return aid;
	}
	
	public void setAname(String aname)
	{
		this.aname = aname;
	}
	public String getAname()
	{
		return aname;
	}
	public void setColor(String color)
	{
		this.color = color;
	}
	public String getColor()
	{
		return color;
	}
	@Override
	public String toString() {
		return aid + "  :  " + aname + "  :  " + color;
	}
	

}
