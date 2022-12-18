//Assignment 1 Set B2

import java.util.*;

public class MyNumber
{
    int x;
    public MyNumber()
    {
         x=0;
    }
    public MyNumber(int x)
    {
         this.x=x;
    }
    public boolean isNegative()
    {
         if (x<0)
            return true;
         else
            return false;
    }
    public boolean isPositive()
    {
         if (x>0)
            return true;
         else
            return false;
    }
    public boolean isZero()
    {
         if (x==0)
            return true;
         else
            return false;
    }
    public boolean isOdd()
    {
         if (x%2!=0)
            return true;
         else 
            return false;
    }
    public boolean isEven()
    {
         if (x%2==0)
            return true;
         else
            return false;
    }
    public static void main(String [] args) throws ArrayIndexOutOfBoundsException
    {
         int x=Integer.parseInt(args[0]);
         MyNumber m=new MyNumber(x);
         if (m.isNegative())
            System.out.println("Number is negative");
         if (m.isPositive())
            System.out.println("Numer is positive");
         if (m.isEven())
            System.out.println("Number is even");
         if (m.isOdd())
            System.out.println("Number is odd");
         if (m.isZero())
            System.out.println("Number is zero");
     }
 }
