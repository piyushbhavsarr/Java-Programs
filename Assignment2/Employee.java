//Assignment 2 SetA1

import java.util.*;

class Employee
{
     int id;
     String name,dept;
     float salary;
     static int NumberOfObject=0;
     
     Employee()
     {
        id=0;
        name="";
        dept="";
        salary=0;
     }
     Employee(int id, String name, String dept, float salary)
     {
        this.id=id;
        this.name=name;
        this.dept=dept;
        this.salary=salary;
        NumberOfObject++;
     }
     public void display()
     {
        System.out.println("Employee id :"+id);
        System.out.println("Employee name :"+name);
        System.out.println("Employee department :"+dept);
        System.out.println("Employee salary :"+salary);
     }
     public static void main(String [] args)
     {
         int n=0;
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter number of employee :");
         n=sc.nextInt();
         Employee[] ob=new Employee[n];
         for (int i=0; i<n; i++)
         {
             sc=new Scanner(System.in);
             System.out.println("Enter id of Employee :"+ (i+1) + ":");
             int id=sc.nextInt();
             System.out.println("Enter name of Employee : "+ (i+1) + ":");
             sc.nextLine();
             String name=sc.nextLine();
             System.out.println("Enter dept name of Employee : "+ (i+1) + ":");
             String deptname=sc.nextLine();
             System.out.println("Enter salary of Employee : "+ (i+1) + ":");
             float salary =sc.nextFloat();
             ob[i]=new Employee(id,name,deptname,salary);
             System.out.println("\n Number of object :"+NumberOfObject);
         }
         for (int i=0; i<n;i++)
         {
              ob[i].display();
         }
      }
}
