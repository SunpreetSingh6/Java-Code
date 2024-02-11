package Lab3;

import java.util.Scanner;

public class Vote {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your age:- ");
		int age = sc.nextInt();
		if(age>=18)
		{
			System.out.println("You age eligible to vote :)");
		}
		else
		{
			System.out.println("Oops! you are not eligible to vote :(");
		}
	}

}
