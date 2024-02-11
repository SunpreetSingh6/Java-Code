
class Emp{
	int eid ;
	double salary ;
	static String ceo ;
	
	static {
		ceo ="Sunpreet";		// when you load a class
	}
	public Emp() {			// when you create a object	
		eid = 1; 
		salary = 1000000;
	}
	public void show() {
		System.out.println(eid + " : " + salary + " : " + ceo);
	}
}
public class StaticPractice {

	public static void main(String[] args) {
		
		Emp A = new Emp();
		Emp B = new Emp();
		/*
		A.eid=5;
		A.salary= 1500000;
		Emp.ceo="Sunpreet";
		B.eid=6;
		B.salary= 2000000;
		Emp.ceo="Sunpreet";
		Emp.ceo="Sun";
		*/
		A.show();
		B.show();
	}

}

//	We can use any static variable in non static method because static variable is same for all the objects.
//	We can't use non static variable in static method because changing the value of non static variable 
//	depends upon the object, and for different objects it will be difficult to identify which object is changing.

//	https://www.youtube.com/watch?v=msXJVIecGp0&list=PLGwb7xZHg-oMv1pOlTHAqAEjw0EPALzlL&index=68&ab_channel=Telusko
