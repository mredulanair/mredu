
class CommandLineArg
{
  public static void main(String [ ]args)
   {
    int sum=0;
    int len=args.length;
     if(len>0)
     {
       for(int i=1; i<=len; i++)
        {
          sum=sum+i;
          System.out. println("comand line values :"+i);
         } 
        System.out. println("sum of the comand line argumens:"+sum); 
     }
   }




}


