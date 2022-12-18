//Assignment 1 SetB1

import java.io.*;

abstract class Order
{
     String description;
     int id;
}

class PurchaseOrder extends Order
{
     String customername,vendorname;
     
     public void accept() throws IOException
     {
           System.out.println("Enter description, customername and vendorname,id :");
           BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
           
           description=br.readLine();
           customername=br.readLine();
           vendorname=br.readLine();
           id=br.read();
     }
     
     public void display()
     {
           System.out.println("id : "+id);
           System.out.println("Description : "+description);
           System.out.println("Customer name : "+customername);
           System.out.println("Vendor name : "+vendorname);
           System.out.println("-----------------------------------");
     }
}

class SaleOrder extends Order
{
     String customername,vendorname;
     
     public void accept() throws IOException
     {
           System.out.println("Enter description, customername and vendorname,id :");
           BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
           
           description=br.readLine();
           customername=br.readLine();
           vendorname=br.readLine();
           id=br.read();
     } 
     
     public void display()
     {
           System.out.println("id : "+id);
           System.out.println("Decription : "+description);
           System.out.println("Customer name : "+customername);
           System.out.println("Vendor name : "+vendorname);
           System.out.println("-----------------------------------");
     }
}

public class Mains
{
      public static void main(String [] args) throws IOException
      {
           int i;
           System.out.println("Select any one : ");
           BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
           System.out.println("1. Purchase Order");
           System.out.println("2. Sales Order");
           int ch=Integer.parseInt(br.readLine());
           
           switch(ch)
           {
               case 1 : System.out.println("Enter no. of purchase orders : ");
                        int n=Integer.parseInt(br.readLine());
                        PurchaseOrder [] l=new PurchaseOrder [n];
                        
                        for (i=0; i<n; i++)
                        {
                            l[i]=new PurchaseOrder();
                            l[i].accept();
                        }
                        
                        for (i=0; i<n; i++)
                        {
                            l[i].display();
                            System.out.println("Object is created");
                        }
                        break;
                        
                case 2 : System.out.println("Enter no. of sale orders : ");
                        int m=Integer.parseInt(br.readLine());
                        SaleOrder [] h=new SaleOrder [m];
                        
                        for (i=0; i<m; i++)
                        {
                            h[i]=new SaleOrder();
                            h[i].accept();
                        }
                        
                        for (i=0; i<m; i++)
                        {
                            h[i].display();
                            System.out.println("Object is created");
                        }
                        break;
           }
      }
}
