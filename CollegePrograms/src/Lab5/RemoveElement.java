package Lab5;

import java.util.Scanner;

public class RemoveElement {

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
		
		int new_arr[] = new int[size-1];
		System.out.println("\nEnter element you want to remove from array:- "); 
		int ele = sc.nextInt(); 
		for (int i = 0 , k=0; i < size ; i++) 
		{ 
			if(ele == arr[i])
			{
				continue; 
			}
			else{
				new_arr[k++] = arr[i];
			}
		}
		
		System.out.println("Array after removing element " + ele + " is :-" );
		for (int i = 0; i < new_arr.length ; i++) {
			System.out.print(new_arr[i] + " "); 
		}
		
	}

}
