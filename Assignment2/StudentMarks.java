//Assignment 2 SetB1
import SY.*;
import TY.*;
import java.io.*;

class StudentInfo
{
     int rollno;
     String name,grade;
     public float gt,tyt,syt;
     public float per;
     public void get() throws IOException
     {
          System.out.println("Enter roll no and name of the student :");
          BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
          rollno=Integer.parseInt(br.readLine());
          name=br.readLine();
     }
}
public class StudentMarks
{
     public static  void main(String [] args) throws IOException
     {
         BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
         System.out.println("Enter the number of students :");
         int n=Integer.parseInt(br.readLine());
         SYMarks sy[]=new SYMarks[n];
         TYMarks ty[]=new TYMarks[n];
         StudentInfo(n);
         
         for (int i=0; i<n; i++)
         {
              si[i]=new StudentInfo();
              sy[i]=new SYMarks();
              ty[i]=new TYMarks();
              
              si[i].get();
              sy[i].get();
              ty[i].get();
              
              si[i].syt=sy[i].ct+sy[i].et+sy[i].mt;
              si[i].tyt=ty[i].pm+ty[i].tm;
              si[i].gt=si[i].syt+si[i].tyt;
              si[i].per=(si[i].gt/1200)*100;
              if (si[i].per>=70)
                 si[i].grade="A";
              else if (si[i].per>=60)
                 si[i].grade="B";   
              else if (si[i].per>=50)
                 si[i].grade="C";
              else if (si[i].per>=40)
                 si[i].grade="Pass";
              else si[i].grade="Fail";
         }
         
         System.out.println("RollNo\t Name\t SyTotal\t Tytotal\t GrandeTotal\t Percentage\t Grade");
         for (int i=0; i<n; i++)
         {
             System.out.println(si[i].rollno + "\t" + si[i].name + "\t" + si[i].syt + "\t" + si[i].tyt + "\t" + si[i].gt + "\t" + si[i].per + "\t" + si[i].grade);
         }
     }
}

