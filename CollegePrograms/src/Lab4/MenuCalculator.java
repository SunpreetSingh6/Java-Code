package Lab4;

import java.util.Scanner;

abstract class Calculator
{
	abstract double add(double n1 , double n2);
	abstract double subtract(double n1 , double n2);
	abstract double divide(double n1 , double n2);
	abstract double multiply(double n1 , double n2);
}
class Calc_Service extends Calculator
{
	private double n1,n2;
	public Calc_Service()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 2 numbers to perform calculation ");
		System.out.println("Enter 1st number:- ");
		this.n1 = sc.nextDouble();
		System.out.println("Enter 2nd number:- ");
		this.n2 = sc.nextDouble();
	}
	
	public void calculate()
	{
		int flag;
		do 
		{
			System.out.println("---------------------------------------------------------------- ");
			System.out.println("Menu Based Application ");
			System.out.println("Press 1 for Addition");
			System.out.println("Press 2 for Subtraction");
			System.out.println("Press 3 for Multiplication");
			System.out.println("Press 4 for Division");
			Scanner sc = new Scanner(System.in);
			int choice = sc.nextInt();
			switch(choice)
			{
			case 1: System.out.println("Addition of " + n1 + " and " + n2 + " is " + add(n1,n2));
				break;
			case 2: System.out.println("Subtraction of " + n1 + " and " + n2 + " is " + subtract(n1,n2));
				break;
			case 3: System.out.println("Multiplication of " + n1 + " and " + n2 + " is " + multiply(n1,n2));
				break;
			case 4: if(n2==0)
				{	
					System.out.println("You are dividing by 0");
				}
			else
				{
					System.out.println("Division of " + n1 + " and " + n2 + " is " + divide(n1,n2));
				}
				break;
			default: System.out.println("Wrong Input");
			}
			
			System.out.println("Press 1 to continue :- ");
			flag = sc.nextInt();
			
		}while(flag==1);
			
	}
	
	
	public double add(double n1 , double n2)
	{
		return n1+n2;
	}
	public double subtract(double n1 , double n2)
	{
		if(n1>n2)
		{ 
			return n1-n2; 
		}
		else
		{
			return n2-n1;
		}
	}
	public double divide(double n1 , double n2)
	{
		return n1/n2;
	}
	public double multiply(double n1 , double n2)
	{
		return n1*n2;
	}
	
}

public class MenuCalculator{

	public static void main(String[] args) {
	
		Calc_Service calc = new Calc_Service();
		calc.calculate();
		
	}
}

