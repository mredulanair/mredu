import java.io.*;
import java.util.Scanner;
 class UserException  extends Exception  
{  
    public void show()  
    {  
      
      System.out.println("Exception Catched: " );
       System.out.println("some typographic error has occured"); 
       System.out.println("Please enter the mark below 25 or more than 0"); 
          
    }  
}  

interface calculator
 {
  public void totelMark();
  public void grade();
  }
class student
{
 String name;
 int m1,m2,m3,m4;
 int totel;
 float percentage;
 student()
 {
  name=" ";
  m1=0;
  m2=0;
   m3=0;
    m4=0;
   totel=0;
   percentage=0;

  }
  void read()
{
  
  System.out.println("Enter the name:");
   name=sc.nextLine();
  
}
 void display()
{
  System.out.println("name :"+name);
  System.out.println("totel mark is :"+totel);
  System.out.println("percentage of totel mark is :"+percentage);
}
Scanner sc= new Scanner(System.in);
 void totelMark()
 {
  try{

   System.out.println("Enter the 4 subject mark :");
    m1=sc.nextInt();
    if(m1>25 || m1<0)
       throw new UserException();
    m2=sc.nextInt();
     if(m2>25 || m2<0)
       throw new UserException();
    m3=sc.nextInt();
      if(m3>25 || m3<0)
       throw new UserException();
    m4=sc.nextInt();
      if(m4>25 || m4<0)
       throw new UserException();
    totel=m1+m2+m3+m4;
    percentage=(totel*100)/100;
   }
  catch(UserException e)
      {
        e.show();  
      } 
 }


void grade()
   {
           System.out.println("totel mark is :"+totel);
           if(totel<35)
             System.out.println("Grade=F");
           if(totel > 35 && totel< 50)
             System.out.println("Grade=C"); 
           if(totel > 50 && totel < 60)
            System.out.println("Grade=B");
           if(totel > 60 && totel < 70)
             System.out.println("Grade=A");
           if(totel > 70)
              System.out.println("Grade=S");
  
    }
  
}
class studentDetails
{
 public static void main(String arg[])
  {
   Scanner sc=new Scanner(System.in);
   System.out.println("enter the number ofstudents details you want enter:");
   int n=sc.nextInt();
   student s[]=new student[n];

   for (int i=0; i<n; i++)
   {
    s[i]=new student();
    s[i].read();
    s[i].totelMark();
 
    }
  
 
    System.out.println("the student details:");
   for (int i=0; i<n; i++)
   {
        s[i].display();
        s[i].grade();

  }
}
}
