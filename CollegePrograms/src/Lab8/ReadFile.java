import java.io.*;  

import java.util.Scanner;  

public class readFile {  

 

    public static void main(String[] args) throws Exception  

 

    {  

        // Passing the path to the file as a parameter  

        Scanner sc = new Scanner(System.in);  

        System.out.println("Enter the path of the file");  

        String path = sc.next();  

        FileReader f = new FileReader(path);  

        // Declaring loop variable  

 

        int i;  

 

        // Holds true till there is nothing to read  

        while ((i = f.read())!= -1)  

        {    // Print all the content of a file  

 

            System.out.print((char)i); 

        }  

        f.close(); 

      System.out.println("Reached end");  

 

    }  

 

}  

 