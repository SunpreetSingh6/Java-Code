package Lab5;

import java.util.Scanner;

public class Merge {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Sorting an array");
		
		System.out.println("Enter no of elements you want to enter for 1st array:- ");
		int size1 = sc.nextInt();
		int arr1[] = new int[size1];
		System.out.println("Enter 1st array elements:- ");
		for (int i = 0; i < size1 ; i++) {
			int ele = sc.nextInt();
			arr1[i] = ele;
		}
		
		System.out.println("Enter no of elements you want to enter for 2nd array:- ");
		int size2 = sc.nextInt();
		int arr2[] = new int[size2];
		System.out.println("Enter 2nd array elements:- ");
		for (int i = 0; i < size2 ; i++) {
			int ele = sc.nextInt();
			arr2[i] = ele;
		}
		System.out.print("1st Entered array is:- ");
		for (int i = 0; i < size1 ; i++) {
			System.out.print(arr1[i] + " "); 
		}
		System.out.print("\n2nd Entered array is:- ");
		for (int i = 0; i < size2 ; i++) {
			System.out.print(arr2[i] + " "); 
		}
		
		int count=0;
		int arr3[] = new int[size1+size2];
		for (int i = 0; i < size1; i++) {
			arr3[i]=arr1[i];
			count++;
		}
		for (int i = 0; i < size2 ; i++) {
			arr3[count++]=arr2[i];
		}
		
		System.out.println("Merged array is:- ");
		for (int i = 0; i < size1+size2 ; i++) {
			System.out.print(arr3[i] + " "); 
		}
	}

}
