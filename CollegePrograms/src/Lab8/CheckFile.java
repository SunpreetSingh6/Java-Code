import java.io.File; 

 

public class checkFile { 

   public static void main(String[] args) { 

      File f = new File("C:\\Users\\abhis\\OneDrive\\Desktop\\abc.txt"); 

      if(f.exists()) 

      { 

        System.out.println("File Exists"); 

      } 

      else 

      { 

        System.out.println("File do not exist"); 

      } 

   } 

} 