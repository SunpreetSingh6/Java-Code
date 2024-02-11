import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//import java.util.Scanner;

public class ExceptionDemo 
{

	public static void main(String[] args) throws Exception
	{
		
		//Scanner sc = new Scanner(System.in);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int i=5,j=0,k;
		int a[] = new int[4];
		System.out.println("Enter the no. ");
		try
		{	
			j=Integer.parseInt(br.readLine());
			k = i/j;
			if(k<2)
			{
				throw new SunpreetException("Result should be greater than 2 ") ;
			}
			System.out.println(k);
			a[3]=5;
		}
		catch(SunpreetException e)
		{
			System.out.println("Error : SunpreetException  " + e);
		}
		catch(IOException e)
		{
			System.out.println("Error : IOException  " + e);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Error : Arithmetic  " + e);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Error : You are using array out of limit  " + e);
		}
		catch(Exception e)
		{
			System.out.println("Error : " + e);
		}
		finally
		{
			System.out.println("Bye");
		}
		
		/*  Throwable 
		 * 		-Exception(we can handle)
		 * 			-Checked(If the user can handle the exception OR also known as Compile Time Exceptions) 
		 * 				- IOException,SQLException,FileNotFoundException,...
		 * 			-Unchecked(If the user can't handle the exception OR also known as Runtime Exceptions) 
		 * 				- RuntimeException -> ArithmeticException,ArrayIndexOutOfBoundsException,IllegalArgumentException,NullPointerException...
		 * 		-Error (we can't handle i.e CPU not responding, not enough RAM ,JVM problems or issues related hardware)
		 * 	RuntimeException extends Exception class
		 * 	Exception and Error extends Throwable class 
		 * 
		 * Remember the biggest difference between checked and unchecked exceptions is that checked exceptions 
		 * are forced by the compiler and used to indicate exceptional conditions that are out of the control of 
		 * the program, while unchecked exceptions are occurred during runtime and used to indicate programming
		 * errors.
		 * 
		 *  2 things -> either we can handle Exceptions(by using try,catch,finally) or we can suppress them(using Throws keyword)
		 * 	
		 * 	Throw keyword is used to intentionally throw an Exceptions 
		 * 
		 * 	We can also create user define Exception by creating a class that extends Exceptions class 
		 * 	and if we want to send message along with Exception we need to create a constructor which should accept string 
		 * 	and using super method we can call constructor of Exception class which will print the string. 
		 * 
		 */
		
	}

}

class SunpreetException extends Exception
{
	public SunpreetException(String msg)
	{
		super(msg);
	}
}
