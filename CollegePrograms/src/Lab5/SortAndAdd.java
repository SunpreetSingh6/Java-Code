package Lab5;
import java.util.Scanner;

public class SortAndAdd {

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
			System.out.print(arr[i] + " "); 
		}
		
		
		System.out.println("\nEnter an element to add:- ");
		int ele = sc.nextInt();
		int new_arr[] = new int[size+1];
		int len = new_arr.length;
		for (int i = 0; i < size ; i++){
			new_arr[i] = arr[i];
		}
		System.out.println("Adding new element:- " + ele);
		new_arr[len-1]=ele;
		
		System.out.println("New array is:- ");
		for (int i = 0; i < len ; i++) {
			System.out.print(new_arr[i] + " "); 
		}
		
		for (int i = 0; i < len ; i++) {
			for (int j = i+1; j < len ; j++) {
				int temp = 0;
				if(new_arr[i]>new_arr[j])
				{
					temp = new_arr[i];
					new_arr[i] = new_arr[j];
					new_arr[j] = temp;
				}
			}
		}
		
		System.out.println("\nNew Sorted array is:- ");
		for (int i = 0; i < len ; i++) {
			System.out.print(new_arr[i] + " "); 
		}
		
	}

}
