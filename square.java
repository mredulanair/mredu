package graphics;
 interface figures
  {
    void area(float x,float y);

   }

public class square implements figures
{
 
public void area(float x,float y)
  {
  System.out.println("The area of a square:"+(x*x));
  }
}