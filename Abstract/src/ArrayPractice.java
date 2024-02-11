import java.util.Scanner;

public class ArrayPractice {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no. of rows:-");
		int rows = sc.nextInt();
		int ar[] = new int[rows];
		System.out.println("Enter array elements:- ");
		for(int i=0 ; i<rows ; i++)
		{
			ar[i] = sc.nextInt();
		}
		System.out.println("Array elements are:- ");
		for(int a : ar)
		{
			System.out.println(a);
		}
	}

}
