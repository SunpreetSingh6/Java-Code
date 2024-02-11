package Lab6;

import java.util.Scanner;

class Stack{
	
	int top ;
	int max_size = 10;
	int arr[] = new int[max_size];
	
	void stack()
	{
		top = -1;
	}
	
	boolean isEmpty()
	{
		return (top<0);
	}
	
	boolean push(Scanner sc)
	{
		if(top == max_size-1)
		{
			System.out.println("Overflow");
			return false;
		}
		else
		{
			System.out.print("Enter a number :- ");
			int value = sc.nextInt();
			top++;
			arr[top] = value;
			System.out.println("Item pushed successfully");
			return true;
		}
	}
	
	boolean pop()
	{
		if(isEmpty())
		{
			System.out.println("Underflow");
			return false;
		}
		else
		{
			top--;
			System.out.println("Item popped");
			return true;
		}
	}
	
	boolean display()
	{
		System.out.println("Printing stack elements .....");  
        for(int i = top; i>0;i--)  
        {  
            System.out.println(arr[i]);  
        }  
		return true;
	}
	
}

public class Stack_Implementation {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Stack s = new Stack();
		boolean flag;
		do 
		{
			System.out.println("*****Stack Operations*****");
			System.out.println("Select choice:-");
			System.out.println("1)Push \n2)Pop \n3)Display \n4)Exit");
			int ch = sc.nextInt();
			char choice;

			switch (ch) 
			{
			case 1: 
					s.push(sc);
					break;
			case 2: 
					s.pop();
					break;
			case 3: 
					s.display();
					break;
			case 4: 
					System.exit(0);
					break;
			default:
					System.out.println("Wrong Input !!!");
					break;
			}
			
			System.out.println("Press \n1)Continue \n2)Exit");
			int n = sc.nextInt(); 
			if(n==1)
			{
				flag = true;
			}
			else
			{
				flag = false;
			}
			
		}while(flag);
	}

}
