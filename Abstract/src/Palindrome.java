import java.util.Scanner;

public class Palindrome {
	
	static void palindrome(String input) {
		int length = input.length();
		System.out.println(length);
		boolean b = true ;
		input = input.toLowerCase();	// Converting it to lower case .
		for(int i=0 ; i<(length/2) ; i++ ) {
			if( input.charAt(i) != input.charAt(length-i-1) ) {
				b = false ;
				break;
			}
		}
		if(b) {
			System.out.println(input + " is a palindrome.");
		}else {
			System.out.println(input + " is not a palindrome.");
		}
	}
	
	static void palindrome(int input)
	{
		int n = input,s=0,r=0;
		while(n>0)
		{
			r = n%10;
			n = n/10;
			s = s*10 + r;
		}
		if(input==s)
			System.out.println(input + " is a palindrome.");
		else
			System.out.println(input + " is not a palindrome.");
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Please enter text to check wheather it's palindrome or not... ");
		String st = s.nextLine();		// For Strings
		//int st = s.nextInt();			// For Numbers
		palindrome(st);

	}

}
