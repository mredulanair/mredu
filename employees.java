import java.util.Scanner;
class employees
{
 public static void main(String arg[])
 {

  Scanner sc=new Scanner(System.in);
  System.out.println("how many employee detais you want:");
  int n=sc.nextInt();
  employee em[]=new employee[n];
  for(int i=0;i<n;i++)
   {
    em[i]=new employee();
    em[i].details();
   }
  Scanner st=new Scanner(System.in);
  System.out.println("enter the eNo of the employee you want to search:");
  int m=st.nextInt();
   for(int i=0;i<n;i++)
   { 
    if(m==(em[i].eNo))
     {
        em[i].display();
     }
   }
  }
}
class employee
{
  int eNo;
  String eName;
  int esalary;
  void details()
  { 
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the number:");
      eNo=sc.nextInt();
      sc.nextLine();
      System.out.println("enter the name:");
      eName=sc.nextLine();
      System.out.println("enter the salary:");
      esalary=sc.nextInt();
  }
  void display()
  {
    System.out.println("the employee number is :"+eNo);
    System.out.println("the employee name is :"+eName);
    System.out.println("the employee salary is :"+esalary);

  }

}