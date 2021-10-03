class overload
{
 public static void main(String arg[])
  {
    void calculate(int n,char ch)
     {
       if(ch=='s')
        {
          int a=n*n;
          System.out.println("the area of sqare is:"+a);
        }
        else
         {
           int a=6*n*n;
            System.out.println("the area of cube is:"+a);
         }
       }
     void calculate(int n,int m,char ch)
     { 
     if(ch=='p')
        {
          System.out.println("the product of 2 number  is:"+(n*m));
        }
     else
      System.out.println("sum of the number  is:"+(n+m));
    }
   void calculate(String str1, String str2)
  {
   if(str1.equals(str2))
      System.out.println("the 2 srting is equal");
   else
    System.out.println("the 2 srting is not equal");
   }

 }
}





