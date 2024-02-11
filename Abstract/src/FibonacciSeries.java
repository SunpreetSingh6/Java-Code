import java.util.Scanner;
public class FibonacciSeries {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a no. upto which you want to print fibonacci series...");
		int n = s.nextInt();
		int n1=0 , n2=1;
		while(n1 <= n) {
			System.out.print(n1 + "  ");
			int sum = n1 + n2 ;
			n1 = n2 ;
			n2 = sum;
		}
		

	}

}
