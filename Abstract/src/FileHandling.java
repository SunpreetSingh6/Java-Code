import java.io.*;

public class FileHandling 
{

	public static void main(String[] args) throws IOException,FileNotFoundException  
	{ 
	
	/*
		FileInputStream and FileOutputStream are byte streams that read and write data in byte format
		  
		write() method used to write byte data in a file.
		write(b) / write(b[] , starting index , no. of bytes)
		   
		read() method used to read byte data from a file and it returns data in int datatype.
	*/	
		
	/*
	  	File f = new File("pqr.txt");
		FileOutputStream fos = new FileOutputStream(f);
		byte b[] = {'A','B','C','D'};
		fos.write(b);
		fos.close();
		FileInputStream fis = new FileInputStream(f);
		int a;
		while((a=fis.read())!= -1)
		{
			System.out.println((char)a);
		}
		fis.close();
	*/	
		
	/*  
	   			Reading data form file abc and writing it to xyz.
	 
	  	FileOutputStream fos = new FileOutputStream("xyz.txt");
		FileInputStream fis = new  FileInputStream("abc.txt");
		FileInputStream fis1 = new  FileInputStream("xyz.txt");
		//fos.write(5);			  // will store no. from 0-255 as write() method writes only 1 byte
		//int a = fis.read();     // will read only 1 byte 
		int a;
		while((a=fis.read())!= -1)		// to read till last and writing to a file
		{
			fos.write(a);
		}
		while((a=fis1.read())!= -1)		// to read till last
		{
			System.out.print((char)a);
		}
		fis.close();
		fos.close();
	*/
		
	/*		USING BUFFEREDINPUTSTREAM AND BUFFEREDOUTPUTSTREAM
	 * 
	 * 	File f = new File("mno.txt");
		FileOutputStream fos = new FileOutputStream(f);
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		String s = "Learning FileHandling";
		byte b[] = s.getBytes();
		bos.write(b);
		bos.close();
		fos.close();
		FileInputStream fis = new FileInputStream(f);
		BufferedInputStream bis = new BufferedInputStream(fis);
		int a;
		while((a=bis.read())!= -1)
		{
			System.out.print((char)a);
		}
		bis.close();
		fis.close();
	*/
		
	/*   FileReader and FileWriter are belongs to character oriented class that means we can write data to a 
	  *  file directly in string means no need to convert data into bytes first.
		
		File f = new File("a1.txt");
		FileWriter fw = new FileWriter(f);
		String s = "Learning FileHandling";
		fw.write(s);
		fw.close();
		FileReader fr = new FileReader(f);
		int a;
		while((a=fr.read())!= -1)
		{
			System.out.print((char)a);
		}
		fr.close();
	*/
		
		
		
	}

}
