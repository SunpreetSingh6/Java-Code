
public class Pattern {

	public static void main(String[] args) {
		
	/*	for(int j=1 ; j<=6 ; j++)
	 	{											
			for (int i = 1; i <= j; i++) 
			{
				System.out.print(i + " ");
			}
			System.out.println();		
	    }
				1 
				1 2 
				1 2 3 
				1 2 3 4 
				1 2 3 4 5 
				1 2 3 4 5 6 

    */
		
		
		
	/*	for(char c=65 ; c<=67 ; c++) 
	 * {
			for(char ch=65 ; ch<=c ; ch++ ) 
			{
				System.out.print(ch + " ");
			}
			System.out.println();
         }
				A 
				A B 
				A B C 
 
         
     */    
		
	/*	for(int j=1 ; j<=4 ; j++) 
	 * {
			for(int i=1; i<=4 ; i++) 
			{
				if( (i==2 && (j==2 || j==3)) || (i==3 && (j==2 || j==3)) ) {
					System.out.print("  ");
				}
				else {
					System.out.print("$ ");
				}
			}
		  System.out.println();
		}
				$ $ $ $ 
				$     $ 
				$     $ 
				$ $ $ $ 
				
				
				OR 
				
		import java.util.Scanner;
		public class Pattern1 {

		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter row and col");
			int row = sc.nextInt();
			int col = sc.nextInt();
			for (int i = 1; i <=row; i++) {
				for (int j = 1; j <= col; j++) 
					if((i==1 || i==col) || (j==1 || j==col))
						System.out.print("*");
					else
						System.out.print(" ");
				
				System.out.println();
				
		}
	}
}

       */  
		
	/*	for(int j=1 ; j<=5 ; j++)
	 	{
														
			for (int i=1; i<=j; i++) 
			{
				System.out.print(j + " ");
			}
			System.out.println();		
	    }
	    1 
		2 2 
		3 3 3 
		4 4 4 4 
		5 5 5 5 5 
	*/	
		
	}

}
