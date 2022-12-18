import java.io.*;
import java.util.*;

class test
{
      public static void main(String args[]) throws IOException
      {
             FileReader f=new FileReader("sample.txt");
             Scanner sc=new Scanner(f);
             String s1="";
             String s2="";
             while(sc.hasNext())
             {
                   
                   s1=s1+sc.next()+" ";
                   s2=s1.toUpperCase();
             }
             char[] ch=new char[s2.length()];
             s2.getChars(0,s2.length(),ch,0);
             System.out.print("Reverse is : ");
             for(int i=(s2.length()-1); i>=0; i--)
             System.out.print(ch[i]);
             f.close();
      }
}
