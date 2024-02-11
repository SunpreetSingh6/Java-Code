import java.util.Scanner;

class Perfectcheck
{
	public boolean isPerfect(int num)			// Perfect no. 
	{											// Ex.   28-> 1+2+4+7+14=28 (where 1,2,4,7,14 are factors of 28)
		int sum=0;								// Ex.   6-> 1+2+3=6 (where 1,2,3 are factors of 6)
		for(int i=1; i<num ;i++)
		{
			if(num%i==0)
			{
				sum += i ;  
				System.out.print(i + " ");
			}
		}
		if(num==sum)
			return true;
		else
			return false;
	}
}

public class PerfectNumber 
{

	public static void main(String[] args) 
	{
		
		int n=0;
		boolean b;
		Scanner s = new Scanner(System.in);
		Perfectcheck pc = new Perfectcheck();
		System.out.print("Enter a no. to check wheather it's a perfect no. or not :- ");
		n = s.nextInt();
		b = pc.isPerfect(n);
		if(b)
			System.out.println("Is a perfect no.");
		else
			System.out.println("It's not a perfect no.");

	}

}
