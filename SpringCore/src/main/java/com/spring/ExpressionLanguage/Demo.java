package com.spring.ExpressionLanguage;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Demo 
{
	// using simple expressions
	
	@Value("#{11+22}")
	private int x;
	@Value("#{8>6?88:66}")
	private int y;
	
	/*  To use static methods we need to follow a specific syntax -> T(class).method(parameters)
	 *  To use static variables we need to follow a specific syntax -> T(class).variable
	 *  To create an object we have to use specific syntax -> new Object(value)
	*/
	
	@Value("#{ T(java.lang.Math).sqrt(125) }")				// static method
	private double sqrt;
	@Value("#{ T(java.lang.Math).PI }")						// static variable
	private double pi;
	@Value("#{ new String('Sunpreet Singh') }")				// creating new object
	private String name;
	
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public double getSqrt() {
		return sqrt;
	}
	public void setSqrt(double sqrt) {
		this.sqrt = sqrt;
	}
	public double getPi() {
		return pi;
	}
	public void setPi(double pi) {
		this.pi = pi;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	@Override
	public String toString() {
		return "Demo [x=" + x + ", y=" + y + ", sqrt=" + sqrt + ", pi=" + pi + ", name=" + name + "]";
	}
	
	
	
	
}
