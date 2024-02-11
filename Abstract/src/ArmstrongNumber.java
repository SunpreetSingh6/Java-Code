import java.util.Scanner;

class ArmstrongCheck
{
	public boolean isArmstrong(int num)
	{
		int sum=0,n=0,cube=0;				// Ex. 153-> 1*1*1 + 5*5*5 + 3*3*3 => 1+125+27 = 153
		int temp=num;						// Ex. 370-> 3*3*3 + 7*7*7 + 0*0*0 => 27+343+0 = 370
		while(num>0)
		{
			n=(num%10);
			cube=(n*n*n);
			sum = (sum+cube);
			num=(num/10);
		}
		if(sum==temp)
			return true;
		else
			return false;
	}
}
public class ArmstrongNumber {

	public static void main(String[] args) {
		
		int n=0;
		boolean b;
		Scanner s = new Scanner(System.in);
		ArmstrongCheck ac = new ArmstrongCheck();
		System.out.print("Enter a no. to check wheather a it's an armstrong no. or not :- ");
		n = s.nextInt();
		b = ac.isArmstrong(n);
		if(b)
			System.out.println("It is an armstrong no. ");
		else
			System.out.println("It's not an armstrong no. ");
		
	}

}
