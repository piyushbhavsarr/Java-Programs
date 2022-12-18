import java.io.*;
import java.util.*;

class Copy 
{
      public static void main(String args[])throws IOException
      {
             Scanner sc=new Scanner(System.in);
             System.out.println("Source file name :\n");
             String file1=sc.next();
             System.out.println("Destination file name :\n");
             String file2=sc.next();
             FileReader fin=new FileReader(file1);
             FileWriter fout=new FileWriter(file2,true);
             
             int c;
             while((c=fin.read())!=-1)
             {
                   fout.write(c);
             }
             System.out.println("End of file...");
             fin.close();
             fout.close();
      }
}
