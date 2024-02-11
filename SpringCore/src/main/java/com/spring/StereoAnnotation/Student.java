package com.spring.StereoAnnotation;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//@Component("st")
@Component
@Scope("prototype")
public class Student 
{
	/*
	 	StereoAnnotation(@Component) is used to create the object of the class without using bean in xml.
	 	StereoAnnotation(@Value) is used to set the values of that object.
	 	
	 	To set the values of the collections by using @Value annotation we just need to create a
	 	StandAlone Collection in xml and provide the id name in @Value like this -> @Value("#{id}").
	 	
	 	We can have desired reference name just by doing this -> @Component("st"). 
	 	
	 	But we have to use below tag in xml.
	 	<context:component-scan base-package="com.spring.StereoAnnotation" />
	*/
	
	/*
	 	StereoAnnotation(@Scope) is used to set the scope of the object.
	 	Scope can be of singleton(default),prototype.
	 	
	 	In Singleton scope , spring container will only create 1 object and give the same object to 
	 	us multiple time(i.e 1 object will store into mutliple references).
	 	We can verify this by using hashcode() method , if we are getting same hashcode for 2 references 
	 	then it is singleton.
	 	
	 	In Prototype scope , spring container will always create new object for every new reference.
	 	We can verify this by using hashcode() method , if we are getting different hashcode then 
	 	it is prototype scope.
	 	
	 	 We can define the scope using  1) Annotation{@Scope("singleton(default)/prototype")} , 
	 	 								2) Xml <bean class="" name="" scope="singleton(def)/prototype" />
	 	 
	 	 @Scope will always used along with @Component.
	*/
	
	@Value("Sunpreet Singh")
	private String name;
	
	@Value("101")
	private int id;
	
	@Value("New Delhi")
	private String city;
	
	@Value("#{phn}")
	private List<String> phone;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public List<String> getPhone() {
		return phone;
	}
	public void setPhone(List<String> phone) {
		this.phone = phone;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", id=" + id + ", city=" + city + ", phone=" + phone + "]";
	}
	
	
	
}
