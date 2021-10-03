package graphics;
 interface figures
  {
     void area(float x,float y);

   }

public class Circle implements figures
{
public void area(float x,float y)
  {
  System.out.println("The area of a circle:"+(3.14f*x*x));
  }
}