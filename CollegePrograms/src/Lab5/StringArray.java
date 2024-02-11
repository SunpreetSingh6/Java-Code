package Lab5;

import java.util.Scanner;

public class StringArray {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Sorting an array");
		System.out.println("Enter no of elements you want to enter:- ");
		int size = sc.nextInt();
		String arr[] = new String[size];
		System.out.println("Enter elements:- ");
		for (int i = 0; i < size ; i++) {
			String ele = sc.nextLine();
			arr[i] = ele;
		}
		System.out.println("Entered array is:- ");
		for (int i = 0; i < size ; i++) {
			System.out.print(arr[i] + " "); 
		}

	}

}
