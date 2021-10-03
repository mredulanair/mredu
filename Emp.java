import java.io.*;
import java.util.Scanner;
class InvalidAgeException extends Exception{
    public void show(){
        System.out.println("Invalid Age");
    }
}
class InvalidNameExceptionException extends Exception{
    public void show(){
        System.out.println("Invalid Name");
    }
}
class EmployeeGet{
    int empcode;
    String name;
    int age;
    int experiance;
    EmployeeGet(){
        empcode=0;
        name="";
        age=0;
        experiance=0;
    }
    void read() throws IOException,InvalidAgeException,InvalidNameException{
        Scanner sc = new Scanner(System.in);
        try{
        System.out.println("Enter the Name:");
        name = sc.nextLine();
        System.out.println("Enter Age:");
        age = sc.nextInt();
        if (name.length()>15)
             throw new InvalidNameException();
        if (age > 58 || age <18) 
            throw new InvalidAgeException();
        }
        catch(InvalidNameException abc){
            abc.show();
           
        }
        catch(InvalidAgeException cde)
        {
           cde.show();
        }
        System.out.println("Enter the Code:");
        empcode = sc.nextInt();

        System.out.println("Enter Experiance:");
        experiance = sc.nextInt();
        
    }
    void display(){
        System.out.println(empcode);
        System.out.println(name);
        System.out.println(age);
        System.out.println(experiance);
    }
}
class Salary extends EmployeeGet{
    int DA;
    int TA;
    int HRA;
    int PF;
    int LIC;
    int Gross;
    
    Salary(){
        DA=0;
        TA=0;
        HRA=0;
        PF=0;
        LIC=0;
        Gross=0;
    }
    void read(){
        super.read();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter DA:");
        DA = sc.nextInt();
        System.out.println("Enter TA:");
        TA = sc.nextInt();
        System.out.println("Enter HRA:");
        HRA = sc.nextInt();
        System.out.println("Enter PF:");
        PF = sc.nextInt();
        System.out.println("Enter LIC:");
        LIC = sc.nextInt();
    }
    void calculate(){
        Gross=DA+TA+HRA+PF+LIC;
    }
    void display(){
        super.display();
        calculate();
        System.out.println("Gross Salary " + Gross );
    }
}
class Emp {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number of employees: ");
        int n = s.nextInt();
        Salary obj[] = new Salary[n];
        for (int i = 0; i < n; i++) {
            obj[i] = new Salary();
            obj[i].read();
        }
        for (int j = 0; j < n; j++) {
            obj[j].display();
        }
    }
}