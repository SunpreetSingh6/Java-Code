import java.util.Scanner;
public class Calculator {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		double x,y,result;
		char c;
		System.out.println("This is a simple calculator:-");
		System.out.println("Enter the value of x = ");
		x= s.nextDouble();
		System.out.println("Enter the value of y = ");
		y= s.nextDouble();
		System.out.println("Enter the operator{ + ,- ,* ,/ } ");
		c= s.next().charAt(0);
		switch(c) {
		case '+' : result = x + y ;
			break;
		case '-' : result = x - y ;
			break;
		case '*' : result = x * y ;
			break;
		case '/' : result = x / y ;
			break;
		default : System.out.println("Please enter the correct operator... ");
		return ;
		}
		System.out.println(x + " " + c + " " + y + " = " + result) ;

	}

}
