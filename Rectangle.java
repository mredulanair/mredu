package graphics;
 interface figures
  {
    public void area(float x,float y);

   }

public class Rectangle implements figures
{ 

 public void area(float x,float y)
  {
  System.out.println("The area of a rectangle:"+(x*y));
  }
}
