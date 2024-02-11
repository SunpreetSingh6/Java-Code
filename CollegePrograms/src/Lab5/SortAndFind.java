package Lab5;
import java.util.Scanner;

public class SortAndFind {

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
			System.out.print(arr[i] + " , "); 
		}
		
		for (int i = 0; i < size ; i++) {
			for (int j = i+1; j < size ; j++) {
				int temp = 0;
				if(arr[i]>arr[j])
				{
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
				 
		System.out.println("\nSorted array is:- ");
		for (int i = 0; i < size ; i++) {
			System.out.print(arr[i] + " , "); 
		}
		
		
		System.out.println("\nEnter element you want to search in sorted array:- "); 
		int ele = sc.nextInt(); 
		for (int i = 0; i < size ; i++) 
		{ 
			if(ele == arr[i])
			{
				System.out.println("Element found at index :- " + i); 
				break; 
			}
		}
		 
		
	}

}
