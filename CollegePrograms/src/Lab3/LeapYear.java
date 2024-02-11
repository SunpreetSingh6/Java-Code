
package Lab3;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {

		
		System.out.println("Enter any year to check wheather it is a leap year or not:- ");
		Scanner sc = new Scanner(System.in);
		int year = sc.nextInt();
		boolean flag = false;
		if( year%4 == 0)
		{
			flag = true;
		}
		else if( year%400 == 0)
		{
			flag = true;
		}
		else if( year%100 == 0 )
		{
			flag = false;
		}
		
		
	if(flag)
	{
		System.out.println(year + " is a leap year");
	}
	else
	{
		System.out.println(year + " is not a leap year");
	}
}
	
}
