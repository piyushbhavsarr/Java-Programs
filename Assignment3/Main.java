//Assignment 1 SetA2

import java.io.*;
import java.util.*;

abstract class Staff
{
      String name;
      int id;
}

class OfficeStaff extends Staff
{
      String dept;
      
      public void accept() throws IOException
      {
           Scanner sc =new Scanner(System.in);
           System.out.println("Enter name, id and department :");
           name=sc.nextLine();
           id=sc.nextInt();
           dept=sc.next();
      }
      
      public void display() throws IOException
      {
           System.out.println("Name : "+name);
           System.out.println("id : "+id);
           System.out.println("Department : "+dept);
           System.out.println("-------------------------------------");
      }
}

public class Main
{
      public static void main(String [] args) throws IOException
      {
           int i;
           Scanner s=new Scanner(System.in);
           System.out.println("Enter no. of Office Staff : ");
           int n=s.nextInt();
           OfficeStaff[] l=new OfficeStaff[n];
           
           for (i=0; i<n; i++)
           {
                l[i]=new OfficeStaff();
                l[i].accept();
           }
           
           for (i=0; i<n; i++)
           {
               l[i].display();
           }
      }
}


/*OUTPUT
ty28@pc22:~/Java/Assignment3$ javac Main.java
ty28@pc22:~/Java/Assignment3$ java Main
Enter no. of Office Staff : 
3
Enter name, id and department :
Siddhi
43
Developer
Enter name, id and department :
Sneha
33
Analytics            
Enter name, id and department :
Shruti
23
Security
Name : Siddhi
id : 43
Department : Developer
-------------------------------------
Name : Sneha
id : 33
Department : Analytics
-------------------------------------
Name : Shruti
id : 23
Department : Security
-------------------------------------
*/
