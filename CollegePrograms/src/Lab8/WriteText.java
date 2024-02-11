import java.util.Scanner;  

 

import java.io.FileWriter;    

 

public class writeText  

 

{    

 

    public static void main(String args[])  

 

    {      

 

         try  

 

         {  

 

           Scanner sc = new Scanner(System.in);  

           System.out.println("Enter the path of the file in which you want to      add content");  

           String path = sc.next();      

           FileWriter fw=new FileWriter(path);      

           fw.write("Hello my name is Abhishek Rawat");      

           fw.close();      

 

          }  

 

          catch(Exception e){System.out.println(e);}      

 

          System.out.println("Content added to file successfully");      

 

     }      

 

}    