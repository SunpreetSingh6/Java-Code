package Lab5;
import java.util.Scanner;

public class ReverseArray {

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
		
		reverse(arr,size);
		
	}
		
		
		static void reverse(int a[] , int size) 
		{
			int arr[] = new int[size];
			int n = size;
			for (int i = 0; i < size ; i++) {
				arr[i] = a[n-1];
				n--;
			}
			
			System.out.println("\nReverse array is:- ");
			for (int i = 0; i < size ; i++) {
				System.out.print(arr[i] + " "); 
			}
		}
	
}