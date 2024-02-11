import java.lang.reflect.Method; 

class Private
{
	private void show()
	{
		System.out.println("In private SHOW method");
	}
}

public class CallingPrivateMethod 
{
	public static void main(String[] args) throws Exception
	{
	
		Class c = Class.forName("Private");
		Private p = (Private)c.newInstance();
		
		//							MethodName ParameterType
		//								 |		|
		Method m = c.getDeclaredMethod("show", null);
		m.setAccessible(true);
		m.invoke(p, null);
		
		
	/*	Private p = new Private();		
		p.show();						// Will generate ERROR
	*/	
	}

}
//	We can access private methods using reflection API just for debugging purpose.
//	Video No. 121
//	https://www.youtube.com/watch?v=0vO0XVN3H-s&list=PLGwb7xZHg-oMv1pOlTHAqAEjw0EPALzlL&index=121&ab_channel=Telusko