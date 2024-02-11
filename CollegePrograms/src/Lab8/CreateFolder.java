package Lab8;

import java.io.*;

import java.util.Scanner;

public class CreateFolder {
	public static void main(String args[]) { 
	System.out.println("Enter the path to create a directory: "); 
	Scanner sc = new Scanner(System.in); 
	String path = sc.next(); 
	System.out.println("Enter the name of the desired directory: "); 
	path = path+sc.next(); 
	//Creating a File object 
	File file = new File(path); 
	//Creating the directory 
	boolean bool = file.mkdir(); 
	if(bool){ 
		System.out.println("Directory created successfully"); 
	}
	else{ 
		System.out.println("Sorry could not create specified directory");
      } 
   }
}