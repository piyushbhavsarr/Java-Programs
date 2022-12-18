public class prg4
{
   int num;
   public prg4()
   {
       num=0;
   }
   public prg4(int num)
   {
       this.num=num;
   }
   public static void main(String[] args)
   {
       prg4 m1=new prg4();
       if(args.length>0)
       {
           int n=Integer.parseInt(args[0]);
           prg4 m2=new prg4(n);
           System.out.println(m1.num);
           System.out.println(m2.num);
       }
       else
           System.out.println("Insufficient arguments");
   }
}
