import java.util.*;
import java.io.*;

class MyException extends Exception
{
      MyException()
      {
            System.out.println("Patient is covid positive");
      }
}

class Patient
{
      String name;
      int age;
      int oxylevel;
      int HRCTreport;
      
      Patient(String name, int age, int oxylevel, int HRCTreport)
      {
              this.name=name;
              this.age=age;
              this.oxylevel=oxylevel;
              this.HRCTreport=HRCTreport;
      }
}

public class Main 
{
       public static void main(String []args)
       {
              int j;
              Scanner sc=new Scanner(System.in);
              System.out.println("Enter number of patients :");
              int number=sc.nextInt();
              Patient[]ob=new Patient[number];
              for (j=0; j<number; j++)
              {
                   System.out.println("Enter name :" );
                   String name=sc.next();
                   System.out.println("Enter age : ");
                   int age=sc.nextInt();
                   System.out.println("Enter oxygen level : ");
                   int oxylevel=sc.nextInt();
                   System.out.println("Enter HRCT report : ");
                   int HRCTreport=sc.nextInt();
                   ob[j]=new Patient(name,age,oxylevel,HRCTreport);
              }
              for (j=0; j<number; j++)
              {
                   if (ob[j].oxylevel<95 && ob[j].HRCTreport>10)
                   {
                   try 
                   {
                         throw new MyException();
                   }
                   catch(MyException e)
                   {
                         System.out.println("Need to be hospitalized");
                   }
                   }
                   else
                   {
                          System.out.println("Name : "+ob[j].name);
                          System.out.println("Age : "+ob[j].age);
                          System.out.println("Oxygen level : "+ob[j].oxylevel);
                          System.out.println("HRCT report : "+ob[j].HRCTreport);
                   }
              }
       }
}
