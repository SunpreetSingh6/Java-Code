
class Object
{
	static int i=0;
	public Object()
	{
		i++;
	}
	public void counter()
	{
		System.out.println(i);
	}
}

public class NumberOfObjects {

	public static void main(String[] args) {
		
		Object obj1 = new Object();
		Object obj2 = new Object();
		Object obj3 = new Object();
		Object obj4 = new Object();
		obj1.counter();
		

	}

}
