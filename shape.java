/*Aim:Create an interface having prototypes of functions area()
and perimeter(). Create two classes Circle and Rectangle
which implements the above interface. Create a menu driven
program to find area and perimeter of objects.

Java code: */

import java.util.Scanner;
interface prototypes
{
 public void area();
 public void perimeter();
}

class Circle implements prototypes
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
 public void perimeter()
 { 
   System.out.println("The perimeter of a circle:"+(2*3.14*r));
 }

}
class Rectangle implements prototypes
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
 public void perimeter()
 { 
   System.out.println("The perimeter of a rectangle:"+(2*(l+b)));
 }
}

class shape
{
 public static void main(String arg[])
  {
   Scanner sc=new Scanner(System.in);
   Rectangle r=new Rectangle();
   Circle c=new Circle();
   while(true)
   {
    System.out.println("1->Area of rectangle\n2->Area of circle\n3->perimeter of rectangle\n4->perimeter of circle\n5->exit");
    System.out.println("Enter the option:");
    int op=sc.nextInt();
    switch(op)
    {
     case 1 :r.area();
             break;
     case 2 :c.area();
             break;
     case 3 :r.perimeter();
             break;
     case 4 :c.perimeter();
             break;
    case 5 :System.exit(0);
    }
   }
  }
}