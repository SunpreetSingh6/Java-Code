package Lab5;

import java.util.Scanner;

public class MinAndMax {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Sorting an array");
		System.out.println("Enter no of elements you want to enter:- ");
		int size = sc.nextInt();
		int arr[] = new int[size];
		System.out.println("Enter elements:- ");
		for (int i = 0; i < size ; i++) {
			int ele = sc.nextInt();
			arr[i] = ele;
		}
		System.out.println("Entered array is:- ");
		for (int i = 0; i < size ; i++) {
			System.out.print(arr[i] + " "); 
		}
		
		int min = arr[0];
		int max = arr[0];
		for(int i = 0; i < size ; i++){
			if(arr[i]<min)
			{
				min=arr[i];
			}
		}
		for(int i = 0; i < size ; i++){
			if(arr[i]>max)
			{
				max=arr[i];
			}
		}
		System.out.println("\nMinimum is :- " + min );
		System.out.println("Maximum is :- " + max );

	}

}
