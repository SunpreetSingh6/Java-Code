
public class Percentage {

	public static void main(String[] args) {

		float phy=90 , chem=94 , math=95 , eng=98 , comp=96;
		double total = phy+chem+math+eng+comp;
		double outof = 500;
		double percentage = (total/outof)*100;
		System.out.println("Percentage is :- " + percentage + "%");
	}

}
