
public class Array {

	public static void main(String[] args) {
		
		int a[][] = {
				{1,2,3},
				{4,5,6,7},
				{8,9,0,1,2,3},
				{4,5}
		};
		
		for(int i=0; i<a.length ; i++)	{					// Method 1 
			for(int j=0 ; j<a[i].length ; j++) {
			System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
		
		for(int k[] : a) {									// Method 2 ( Enhanced for loop/ For each loop )
			for(int l : k) {
				System.out.print(l + " ");
			}
			System.out.println();
		}
		

	}

}
