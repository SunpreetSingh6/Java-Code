class calc{
	public int add(int a, int b) {						//Java does'nt support multiple inheritance   
		return a+b;
	}
}

class calcAdv extends calc{
	public int sub(int a, int b) {
		return a-b;
	}
}
class calcMoreAdv extends calcAdv {
	public int multiply(int a, int b) {
		return a*b;
	}
}
public class InheritanceDemo {

	public static void main(String[] args) {
		
		calcMoreAdv c = new calcMoreAdv();
		System.out.println(c.add(3,4)+ " " + c.sub(5, 3) + " " + c.multiply(2, 4));

	}

}
