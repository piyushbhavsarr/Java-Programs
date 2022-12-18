//Assignment 2 SetA2

import java.io.*;

class Student
{
     int roll_no;
     String name;
     float per;
     static int count=0;
     
     public Student()
     {
         roll_no=0;
         name="";
         per=0.0f;
     }
     public Student(int roll_no, String name, float per)
     {
         this.roll_no=roll_no;
         this.name=name;
         this.per=per;
         count++;
     }
     public static void count()
     {
          System.out.println("Object" + (count) + "created");
     }
     public void display()
     {
          System.out.println("Roll Number :"+ roll_no);
          System.out.println("Name :"+ name);
          System.out.println("Percentage :"+ per);
     }
}
 public class StudentMain
 {
      public static void main(String [] args) throws IOException
      {
           Student s1=new Student(1," Sakshi ",67.56f);
           Student.count();
           Student s2=new Student(2," Shruti ",88.34f);
           Student.count();
           Student s3=new Student(3," Pallavi ",70.52f);
           Student.count();
           s1.display();
           s2.display();
           s3.display();
       }
 }
