import Arithmetic.*;
import java.util.Scanner;
class TestArithmetic
 {
  public static void main(String agr[])
  {
   int a,b;
   System.out.print("Enter the 2 numbers:");
   Scanner sc=new Scanner(System.in);
   a=sc.nextInt();
   b=sc.nextInt();
   Action A=new Action();
   A.add(a,b);
   A.sub(a,b);
   A.mul(a,b);
   A.div(a,b);
 }
}