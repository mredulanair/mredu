public class BubleSortGeneric
{
 public static <S> void Sorts(S a[])
 {
  for(int i = 0;i< a.length; i++)
      {
         for(int j = 0; j < i - 1; j++)
         {
           if(a[j] > a[j+1])
            {
              S temp = a[j];
              a[j] = a[j+1];
              a[j+1] = temp;
            }
         }
      }
    for(S i : a)
    {
     System.out.println("After sorting the array:"+i+"->");
    }
  }
 public static void main(String arg[])
  {
    Integer inta[]={2,10,3,9,15,1,6,8};
    String stra[]={"zana","madu","midu","anu"};
    Sorts(inta);
   
  }
 }
