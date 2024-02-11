package Lab3;

import java.util.Scanner;

abstract class Calculator
{
	abstract void calculate();
}

class Service extends Calculator

public class MenuATM {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your account details:- ");
		System.out.println("Enter your name:- ");
		String name = sc.nextLine();
		System.out.println("Enter your account number:- ");
		int account_num = sc.nextInt();
		System.out.println("Enter your account balance:- ");
		double account_bal = sc.nextDouble();
		System.out.println("---------------------------------------------------------------- ");
		System.out.println("Menu Based Application ");
		System.out.println("Press 1 for Deposite");
		System.out.println("Press 2 for Withdraw");
		System.out.println("Press 3 for Check Balance");
		System.out.println("Press 4 for Account Details");
		System.out.println("Press 5 for Others");
		int choice = sc.nextInt();
		switch(choice)
		{
		case 1: 
			System.out.println("Enter the amount:- ");
			double d_amount = sc.nextDouble();
			System.out.println("Your current balance is :-" + (account_bal+d_amount));
			break;
		case 2: 
			System.out.println("Enter the amount:- ");
			double w_amount = sc.nextDouble();
			System.out.println("Your current balance is :-" + (account_bal-w_amount));
			break;
		case 3: System.out.println("Your current balance is :-" + account_bal);
			break;
		case 4: 
			System.out.println("Account details:- ");
			System.out.println("Account holder name:- " + name);
			System.out.println("Account number:- " + account_num);
			System.out.println("Account balance:- " + account_bal);
			break;
		case 5: System.out.println("Other services are not available right now:- SERVER DOWN");
			break;
		default: System.out.println("Wrong Input");
		}
	}

}

@Override
void calculate() {
	// TODO Auto-generated method stub
	
}
