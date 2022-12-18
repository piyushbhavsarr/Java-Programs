//Assignment 1 SetA4

import java.util.*;

interface Number
{
     public void print(int n);
}
public class Cube
{
     public static void main(String[] ar)
     {
          int a;
          Scanner sc=new Scanner(System.in);
          System.out.println("Enter number : ");
          a=sc.nextInt();
          
          Number p=n-> System.out.println("Cube is : "+n*n*n);
          p.print(a);
     }
}


/*OUTPUT
ty28@pc22:~/Java/Assignment3$ javac Cube.java
ty28@pc22:~/Java/Assignment3$ java Cube
Enter number : 
5
Cube is : 125
*/
