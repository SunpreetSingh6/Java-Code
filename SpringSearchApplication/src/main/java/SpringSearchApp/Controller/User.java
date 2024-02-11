package SpringSearchApp.Controller;

import java.util.Date;
import java.util.List;

public class User 
{
	private String name;
	private Long id;
	private String email;
	private String password;
	private Date dob;
	private String gender;
	private List<String> courses;
	private String comments;
	private Address address;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public List<String> getCourses() {
		return courses;
	}
	public void setCourses(List<String> courses) {
		this.courses = courses;
	}
	public String getComments() {
		return comments;
	}
	public void setComments(String comments) {
		this.comments = comments;
	}
	
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "User [name=" + name + ", id=" + id + ", email=" + email + ", password=" + password + ", dob=" + dob
				+ ", gender=" + gender + ", courses=" + courses + ", comments=" + comments + ", address=" + address
				+ "]";
	}
	
	
	
}
