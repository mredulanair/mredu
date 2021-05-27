import java.util.Scanner;
class sum
{
public static void main(String arg[])
 {
   int n;
   int sum=0;
   Scanner sc=new Scanner(System.in);
   System.out.println("enter the numbers:");
   n=sc.nextInt();
   for(int i=0; i<=n;i++)
    {
     sum=sum+i;
     
    }
   System.out.println("sum of  numbers is:"+sum);
  }
}
   