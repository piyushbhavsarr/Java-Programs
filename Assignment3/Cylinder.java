//Assignment 1 SetA3

import java.util.*; 
import java.io.*;

interface Operation
{
      void area();
      void volume();
      void accept();
}

class Cylinder implements Operation
{
      double r,h;
      double PI=3.142;
      double area,vol;
      
      public void accept()
      {
           Scanner sc=new Scanner(System.in);
           System.out.println("Enter Radius :");
           r=sc.nextFloat();
           System.out.println("Enter Height :");
           h=sc.nextFloat();
      }
      
      public void area()
      {
           area=2*PI*r*(r+h);
           System.out.println("Area : "+area);
      }
      
      public void volume()
      {
           vol=PI*r*r*h;
           System.out.println("Volume : "+vol);
      }
      
      public static void main(String args[])
      {
           float r,h;
           Scanner sc=new Scanner (System.in);
           Cylinder obj=new Cylinder();
           
           obj.accept();
           obj.area();
           obj.volume();
      }
}


/*OUTPUT
ty28@pc22:~/Java/Assignment3$ javac Cylinder.java
ty28@pc22:~/Java/Assignment3$ java Cylinder
Enter Radius :
3
Enter Height :
5
Area : 150.816
Volume : 141.39
*/
