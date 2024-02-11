import java.io.*;

public class Createfile {

	public static void main(String args[]) throws IOException

	{

		File f = new File("C:\\Users\\abhis\\OneDrive\\Desktop\\abc.txt");

		if (f.createNewFile())

		{

			System.out.println("File created successfully.....");

		}

		else

		{

			System.out.println("File already exist!!!!!");

		}

	}

}