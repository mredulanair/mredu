package graphics;
interface figures
  {
        void area(float x,float y);

   }

public class Triangle implements figures
{

 public void area(float x,float y)
  {
  System.out.println("The area of a rectangle:"+(0.5*x*y));
  }
}
