abstract class Human					// Abstract method must be defined in abstract class and abstract method must have body in subclass/derivedClass. 
{ 										// Cannot create object of abstract class. 
	public abstract void eat();			// Abstraction is a process of hiding the implementation details and showing only functionality to the user.
	public void sleep()					// Another way, it shows only essential things to the user and hides the internal details, 
	{									// for example, sending SMS where you type the text and send the message. You don't know the internal processing about the message delivery.	
		
		System.out.println("ZZZzzzzz.....");
	}
	public Human()
	{
		System.out.println("Hello from Human");
	}
}
class Men extends Human
{
	public Men()
	{
		System.out.println("Hello from men");
	}
	public void eat()
	{
		System.out.println("Yummy Yummy");
	}
	public void speak()
	{
		System.out.println("Hehehehehe");
	}
}

public class AbstractDemo 
{
	public static void main(String[] args) 
	{
		Men obj = new Men();
		obj.eat();
		obj.speak();
		obj.sleep();
	}

}
