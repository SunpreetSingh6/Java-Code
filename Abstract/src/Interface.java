interface Writer
{
	void write();
	default void read()									// Default method in interface.
	{
		System.out.println("Just Reading");	
	}
	static void listen()								// Static method in interface.
	{
		System.out.println("Just Listning");
	}
 }

class Pen implements Writer
{
	public void write()
	{
		System.out.println("I'am pen");
	}
}

class Pencil implements Writer
{
	public void write()
	{
		System.out.println("I'am pencil");
	}
}

public class Interface 
{
	public static void main(String[] args) 
	{
		Writer w1 = new Pen();
		w1.write();
		w1.read();
		Writer w2 = new Pencil();
		w2.write();
		w2.read();
		
		Writer.listen(); 							// Calling static method 
	}
}


//	With the help of interfaces we can achieve abstraction and multiple inheritance in java.
//	There can be abstract,default,static,private methods in interfaces.
//	In interfaces the variables are public,static and final by default.
//	In interfaces the methods are public and abstract by default.
//	In interfaces we can define only default and static methods.
//	We can't create the object of interfaces.


// 	Interfaces can be of 3 types:- Normal(>1 abstract methods) , Functional(1 abstract method) , Marker(0 abstract methods)
