import java.util.Scanner;

public class PrimeNumber {

	static boolean isPrime(int num)
	{
		boolean b=true;
		for(int i=2 ; i<(num/2) ; i++)
		{
			if(num%i==0)
			{
				b=false;
			}
		}
		if(b)
			return true;
		else
			return false;
	}
	
	public static void main(String[] args) {

		int n=0;
		boolean b;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a no. to check wheather it's a prime no. or not :- ");
		n = s.nextInt();
		b = isPrime(n);
		if(b)
			System.out.println("It's a prime no. ");
		else
			System.out.println("It's not a prime no. ");
	}

}
