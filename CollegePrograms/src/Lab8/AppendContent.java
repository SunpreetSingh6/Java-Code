import java.util.*;

import java.io.*;

class appendContent {

public static void main(String[] args)  

 

{  

 

      Scanner sc = new Scanner(System.in);  

 

      System.out.println("Enter the path where you want to add the content: ");      

 

      String path = sc.next();  

 

try{      

 

      FileWriter f = new FileWriter(path,true);  

 

       f.write("THIS IS APPENDED CONTENT IN JAVA FILE!");  

 

       f.close();     

 

}  

 

catch(Exception e)  

 

{  

 

System.out.println(e);  

 

}  

 

System.out.println("Content added to the file.");     

 

  }

}