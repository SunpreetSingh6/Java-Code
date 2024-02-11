package Lab3;

import java.util.Scanner;

public class MenuCalculator {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 2 numbers to perform calculation ");
		System.out.println("Enter 1st number:- ");
		double n1 = sc.nextDouble();
		System.out.println("Enter 2nd number:- ");
		double n2 = sc.nextDouble();
		System.out.println("---------------------------------------------------------------- ");
		System.out.println("Menu Based Application ");
		System.out.println("Press 1 for Addition");
		System.out.println("Press 2 for Subtraction");
		System.out.println("Press 3 for Multiplication");
		System.out.println("Press 4 for Division");
		int choice = sc.nextInt();
		switch(choice)
		{
		case 1: System.out.println("Addition of " + n1 + " and " + n2 + " is " + (n1+n2));
			break;
		case 2: System.out.println("Subtraction of " + n1 + " and " + n2 + " is " + (n1-n2));
			break;
		case 3: System.out.println("Multiplication of " + n1 + " and " + n2 + " is " + (n1*n2));
			break;
		case 4: if(n2==0)
			{	
				System.out.println("You are dividing by 0");
			}
		else
			{
				System.out.println("Division of " + n1 + " and " + n2 + " is " + (n1/n2));
			}
			break;
		default: System.out.println("Wrong Input");
		}
	}

}
