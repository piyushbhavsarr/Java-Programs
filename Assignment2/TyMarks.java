//TyMarks.java
package TY;
import java.io.BufferedReader;
import java.io.*;


public class TyMarks
{
      public int tm,pm;
      public void get() throws IOException
      {
          System.out.println("Enter marks of the theory out of 400 and practicals out of 200");
          BufferedReader br = new BufferedReader(new InputSystemReader(System.in));
          tm=Integer.parseInt(br.readLine());
          pm=Integer.parseInt(br.readLine());
      }
}  
