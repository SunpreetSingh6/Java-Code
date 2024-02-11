
public class WrapperDemo {

	public static void main(String[] args) {
		
		int i=5;  //primitive data type
		Integer a = new Integer(i); 		// boxing/wrapping
		int b = a.intValue();            // unboxing/unwrapping
		System.out.println(b);
		Integer c = i;			// autoboxing/autowrapping 
		int d = c;				// autounboxing/autounwrapping
		System.out.println(d);
	    
		//The wrapper class in Java provides the mechanism to convert primitive into object and object into primitive
		// Why we need Wrapper classes? :- because java is oop language which means everything should be object oriented .  
		// primitive datatypes are faster than wrapper classes.
		// why we use wrapper classes?  :- because some frameworks like hibernate and collection api doesn't 
		// support primitive datatype.
		
		String str = "123";
		int x = Integer.parseInt(str);  // parseInt() is method which is used to convert string into integer.
										// now because parseInt() method is a static method so access it we use class name Integer.
		
	}

}
