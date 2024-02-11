package Lab3;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to check factorial:- ");		
		int fact = sc.nextInt();
		for(int i=(fact-1) ; i>0 ; i--)
		{
			 fact = fact*i;
		}
		System.out.println("Factorial of given is :- " + fact);
	}

}
