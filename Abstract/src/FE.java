import java.io.FileWriter;
import java.io.IOException;
public class FE {

	public static void main(String[] args) {
		
		try {
			
			FileWriter obj = new FileWriter("a.txt");
			obj.write("Hello my name is Sunpreet Singh :) .....");
			obj.close();
			System.out.println("Successfully wrote to file.");
			
		}catch(IOException e){
			System.out.println("An error occured.");
			e.printStackTrace();
			
		}

	}

}
