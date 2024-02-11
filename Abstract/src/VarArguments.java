class Example{
	static double sum =0;
	static void add(double ... n) {				//With VarArgument We doesn't require method overloading 
													//we can pass any no. of argument
		for(double x : n) {
			sum= sum + x;
		}
		System.out.println(sum);
	}
	
} 


public class VarArguments {

	public static void main(String[] args) {
		 
		//Example e = new Example();
		Example.add(2,3,4,5,6,7,8,9,0);

	}

}
