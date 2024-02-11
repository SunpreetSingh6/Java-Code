import java.util.Scanner;
public class Factorial {
	
	static int fact (int n) {
		int result ;
		if (n==1) {
			return 1;
		}else {
			result = n * fact(n-1);
			return result ;
		}
	}

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a no. to find factoiral: ");
		int num = s.nextInt() ;
		int f = fact(num);
		System.out.println("Factorial of " + num + " is :-   " + f);

	}

}
