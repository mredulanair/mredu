package graphics;
import java.util.Scanner;
interface figures
  {
   // public void read();
    public void area();

   }

public class Circle implements figures
{
 int r;
 Circle()
{
 Scanner sc=new Scanner(System.in);
 System.out.print("Enter the radios of a circle:");
  r=sc.nextInt();
}
public void area()
  {
  System.out.println("The area of a circle:"+(3.14*r*r));
  }
}
public class Rectangle implements figures
{
int l,b;
 Rectangle()
 {
 System.out.println("Enter the length of a rectangle:");
 Scanner sc=new Scanner(System.in);
  l=sc.nextInt();
 System.out.println("Enter the breadth of a rectangle:");
  b=sc.nextInt();
 }
 public void area()
  {
  System.out.println("The area of a rectangle:"+(l*b));
  }
}

public class Triangle implements figures
{
int h,b;
 Triangle()
 {
 System.out.println("Enter the hieght of a triangle:");
 Scanner sc=new Scanner(System.in);
  h=sc.nextInt();
 System.out.println("Enter the breadth of a rectangle:");
  b=sc.nextInt();
 }
 public void area()
  {
  System.out.println("The area of a rectangle:"+(0.5*h*b));
  }
}
public class square implements figures
{
 int a;
 square()
{
 Scanner sc=new Scanner(System.in);
 System.out.print("Enter the side of a square:");
  a=sc.nextInt();
}
public void area()
  {
  System.out.println("The area of a square:"+(a*a));
  }
}