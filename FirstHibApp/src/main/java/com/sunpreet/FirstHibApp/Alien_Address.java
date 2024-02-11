package com.sunpreet.FirstHibApp;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

@Entity
@Table(name="Alien_Address")
public class Alien_Address 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="Add_id")
	private int addressid;
	
	@Column(name="Add_house_no")
	private String house_no;

	@Column(name="Add_street")
	private int street;
	
	@Column(name="Add_city")
	private String city;
	
	@Column(name="Add_landmark" , length = 100)
	private String landmark;
	
	@Column(name="Add_added_date")
	@Temporal(TemporalType.DATE)		// @Temporal is used to set the format of the date.
	private Date added_date;
	
	@Transient							// @Transient is used so that this field is not able to generate column in db . 
	private double x ;

	public int getAddressid() {
		return addressid;
	}

	public void setAddressid(int addressid) {
		this.addressid = addressid;
	}

	public String getHouse_no() {
		return house_no;
	}

	public void setHouse_no(String house_no) {
		this.house_no = house_no;
	}

	public int getStreet() {
		return street;
	}

	public void setStreet(int street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getLandmark() {
		return landmark;
	}

	public void setLandmark(String landmark) {
		this.landmark = landmark;
	}

	public Date getAdded_date() {
		return added_date;
	}

	public void setAdded_date(Date added_date) {
		this.added_date = added_date;
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	@Override
	public String toString() {
		return addressid + "  :  " + house_no + "  :  " + street + "  :  " 
				+ city + "  :  " + landmark + "  :  " + added_date;
	}
	
	

}
