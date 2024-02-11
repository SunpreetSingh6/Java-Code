class A
{	
	/*final int i=0;
	public A()
	{
		i=10;
	}
	*/
	public void show() 
	{
		System.out.println("in A show");
	}
}
class B extends A
{
	public void show() 
	{
		System.out.println("in B show");
	}
}

public class FinalDemo {

	public static void main(String[] args) {
		
		A obj = new B();
		//System.out.println(obj.i);
		obj.show();
	}

}
//  Final keyword can be use with class,variable and methods 
//  with variables to make them constant.
//  with class so that no one can extends/inherit the class.
//  with method so that no one can override the method. 
//  To initialize a blank final variable we must use constructor.
//	To initialize a blank static final variable we must use static block.
