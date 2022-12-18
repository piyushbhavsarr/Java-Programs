import java.util.*;
class SetA4
{
       public static void main(String args[])
       {
            Scanner s = new Scanner(System.in);
            System.out.println("Enter array size : ");
            int size = s.nextInt();
            System.out.println("Enter elements in array : ");
            int arr[] = new int[size];
            
            for(int i=0;i<size;i++)
            {
                arr[i]=s.nextInt();   
            }
            System.out.println("Reverse array : ");      
            for(int i=size-1; i>=0;i--)     
                System.out.println(arr[i]+"");
       }
}



/*OUTPUt
ty28@pc16:~/Documents/ty28/Java/Asssignment1$ javac SetA4.java
ty28@pc16:~/Documents/ty28/Java/Asssignment1$ java SetA4
Enter array size : 
4
Enter elements in array : 
11
22
33
44
Reverse array : 
44
33
22
11    */

