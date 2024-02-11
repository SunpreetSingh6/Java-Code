package Lab4;

import java.util.Scanner;

abstract class Bank
{
	abstract double deposite(double amount);
	abstract double withdraw(double amount);
	abstract int change_pin(int pin);
}

class ATM extends Bank
{
	private String name;
	private int account_num , pin;
	private double account_bal;
	
	public ATM()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your account details:- ");
		System.out.println("Enter your name:- ");
		this.name = sc.nextLine();
		System.out.println("Enter your account number:- ");
		this.account_num = sc.nextInt();
		System.out.println("Enter your account balance:- ");
		this.account_bal = sc.nextDouble();
		System.out.println("Enter your 4 digit account pin:- ");
		this.pin = sc.nextInt();
	}
	
	public void service()
	{	
		int flag;
		do
		{
			System.out.println("---------------------------------------------------------------- ");
			System.out.println("Menu Based Application ");
			System.out.println("Press 1 for Deposite");
			System.out.println("Press 2 for Withdraw");
			System.out.println("Press 3 for Check Balance");
			System.out.println("Press 4 for Account Details");
			System.out.println("Press 5 for Pin Change");
			System.out.println("Press 6 for Others");
			Scanner sc = new Scanner(System.in);
			int choice = sc.nextInt();
			switch(choice)
			{
			case 1: 
				System.out.println("Enter the amount:- ");
				double d_amount = sc.nextDouble();
				System.out.println("Your current balance is :-" + deposite(d_amount));
				break;
			case 2: 
				System.out.println("Enter the amount:- ");
				double w_amount = sc.nextDouble();
				System.out.println("Your current balance is :-" + withdraw(w_amount));
				break;
			case 3: System.out.println("Your current balance is :-" + account_bal);
				break;
			case 4: 
				System.out.println("Account details:- ");
				System.out.println("Account holder name:- " + name);
				System.out.println("Account number:- " + account_num);
				System.out.println("Account balance:- " + account_bal);
				System.out.println("Account pin:- " + pin);
				break;
			case 5:
				System.out.println("Enter your old pin:- ");
				int oldpin = sc.nextInt();
				if(pin == oldpin)
				{
					System.out.println("Enter your new pin:- ");
					int newpin = sc.nextInt();
					change_pin(newpin);
				}
				else
				{
					System.out.println("Please enter a valid old pin");
				}
				break;
			case 6: System.out.println("Other services are not available right now:- SERVER DOWN");
				break;
			default: System.out.println("Wrong Input");
			}
			
		System.out.println("Press 1 to continue:-");
		flag = sc.nextInt();
		
		}while(flag==1);
		
	}

	double deposite(double amount)
	{
		this.account_bal = account_bal+amount;
		return account_bal;
	}

	double withdraw(double amount) 
	{
		this.account_bal = account_bal-amount;
		return account_bal;
	}

	int change_pin(int newpin) 
	{
		this.pin = newpin; 
		return pin;
	}
	
}

public class MenuATM {

	public static void main(String[] args) {

		ATM atm = new ATM();
		atm.service();
		
	}

}
