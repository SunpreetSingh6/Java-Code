package Lab5;

import java.util.Scanner;

public class RemoveArray {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Rmoving an array from an array");
		System.out.println("Enter no of rows you want:- ");
		int rows = sc.nextInt();
		System.out.println("Enter no of column you want:- ");
		int columns = sc.nextInt();
		int arr[][] = new int[rows][columns];
		
		System.out.println("Enter elements:- ");
		for (int i = 0; i < rows ; i++) {
			for (int j = 0; j < columns ; j++) {
				int ele = sc.nextInt();
				arr[i][j] = ele;	
			}
			System.out.println();
		}
		
		System.out.println("Entered array is:- ");
		for (int i = 0; i < rows ; i++) {
			for (int j = 0; j < columns ; j++) {
				System.out.print(arr[i][j] + " ");	
			}
			System.out.println();
		}
		
		int new_arr[][] = new int[rows-1][columns];
		System.out.println("\nEnter index of array you want to remove from array:- "); 
		int index = sc.nextInt(); 
		
		for (int i = 0; i < rows ; i++) {
			for (int j = 0; j < columns ; j++) {
				if(rows == index)
				{
					continue;
				}
				else {
					new_arr[i][j] = arr[i][j]; 
				}
			}
		}
		
		System.out.println("Updated array is:- ");
		for (int i = 0; i < rows-1 ; i++) {
			for (int j = 0; j < columns ; j++) {
				System.out.print(arr[i][j] + " ");	
			}
			System.out.println();
		}
		

	}

}
