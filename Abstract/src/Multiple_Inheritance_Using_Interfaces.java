interface ABC
{	
	void read();
	default void write()
	{
		System.out.println("Just writing from ABC");
	}
}
interface XYZ
{
	void read();
	default void write()
	{
		System.out.println("Just writing from XYZ");
	}
}

class Example1 implements ABC,XYZ 
{
	public void read()								// Case 1
	{
		System.out.println("Just Reading");
	}
	public void write()								// Case 2
	{
		XYZ.super.write();			
	}
}
public class Multiple_Inheritance_Using_Interfaces 
{
	public static void main(String args[])
	{
		Example1 e = new Example1();
		e.read();
		e.write();
	}

}

//	Multiple inheritance is not allowed in java but we can achieve this using interfaces.
//	$->  There will be same ambiguity problem when we try to implement multiple inheritance using interfaces 
//		 which arises in multiple inheritance using classes.
//			We can overcome this situation by following methods.
//			1) We provide implementation of the 2 same abstract method in class.
//			2) We provide a method from which we can call the desired method present in any of the interfaces