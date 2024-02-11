package com.sunpreet.FirstHibApp;

import javax.persistence.Embeddable;

/*  Example of @Embeddable annotation :- This class won't make a new table as we didn't use 
	@Entity annotation instead it will embedd fields of this class with Alien_Home class(means these 
	fields will be stored in the table of alien_home).  
*/
@Embeddable
public class Alien_Specs 
{
	private int num_heads;
	private int num_eyes;
	private int num_hands;
	private int num_legs;
	private String planet_name;
	
	public int getNum_heads() {
		return num_heads;
	}
	public void setNum_heads(int num_heads) {
		this.num_heads = num_heads;
	}
	public int getNum_eyes() {
		return num_eyes;
	}
	public void setNum_eyes(int num_eyes) {
		this.num_eyes = num_eyes;
	}
	public int getNum_hands() {
		return num_hands;
	}
	public void setNum_hands(int num_hands) {
		this.num_hands = num_hands;
	}
	public int getNum_legs() {
		return num_legs;
	}
	public void setNum_legs(int num_legs) {
		this.num_legs = num_legs;
	}
	public String getPlanet_name() {
		return planet_name;
	}
	public void setPlanet_name(String planet_name) {
		this.planet_name = planet_name;
	}
	@Override
	public String toString() {
		return  num_heads + "  :  " + num_eyes + "  :  " + num_hands
				+ "  :  " + num_legs + "  :  " + planet_name ;
	}
	
	
}
