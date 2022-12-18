//Assignment 1 SetA1

import java.io.*;
 
 class Continent
 {
      String con;
      BufferedReader r=new BufferedReader(new InputStreamReader(System.in));
      void con() throws IOException
      {
           System.out.println("Enter name of Continent :");
           con=r.readLine();
      }
}

class Country extends Continent
{
      String cou;
      
      void cou() throws IOException
      {
           System.out.println("Enter name of Country :");
           cou=r.readLine();
      }
}

class State extends Country
{
      String sta;
      
      void sta() throws IOException
      {
           System.out.println("Enter name of State :");
           sta=r.readLine();
      }
 
      public static void main(String [] args) throws IOException
      {
           State s=new State();
           s.con();
           s.cou();
           s.sta();
          
           System.out.println("\n\nContinent :"+s.con);
           System.out.println("Country :"+s.cou);
           System.out.println("State :"+s.sta);
      }
}


/*OUTPUT
ty28@pc22:~/Java/Assignment3$ javac State.java
ty28@pc22:~/Java/Assignment3$ java State
Enter name of Continent :
Asia
Enter name of Country :
India
Enter name of State :
Maharashtra


Continent :Asia
Country :India
State :Maharashtra
*/ 
