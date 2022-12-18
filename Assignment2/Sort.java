//Assignment 2 SetA3

import java.io.*;

public class Sort
{
    public static void main(String [] args) throws IOException 
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter array");
        int [] arr=new int[5];
        for (int i=0; i<5; i++)
        {
            arr[i]=Integer.parseInt(br.readLine());
        }
        int temp=0;
        for (int i=0;i<5;i++)
        { 
             for (int j=i+1;j<5;j++)
             {
                  if (arr[i]>arr[j])
                  {
                      temp=arr[i];
                      arr[i]=arr[j];
                      arr[j]=temp;
                   }
             }
        }
        System.out.println("Element of array sorted in ascending order :");
        for (int i=0; i<5; i++)
        {   
             System.out.println(arr[i]+ " ");
        }
    }
}
