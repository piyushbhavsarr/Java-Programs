//Assignment 2 SetA4

import java.util.*;

class Person
{
     String fname,mname,lname;
     int len;
     void accept()
     {
         System.out.println("Enter First Name :");
         Scanner s=new Scanner(System.in);
         fname=s.next();
         System.out.println("Enter Middle Name :");
         mname=s.next();
         System.out.println("Enter Last Name :");
         lname=s.next();
         len=mname.length();
         String f=mname.substring(0,len);
         String l=mname.substring(0,1);
         f=f.toUpperCase();
         mname=f;
     }
     void display()
     {
         System.out.println("Last Name is :"+ lname);
         System.out.println("First Name is :"+ fname);
         System.out.println("Middle Name is :"+ mname);
     }
     public static void main(String a[])
     {
         Person p=new Person();
         p.accept();
         p.display();
     }
}
