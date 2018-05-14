import java.io.*;
import java.util.*;
class Employee
{
    String name;
    int age;
    double grossSalary;
    float takeHomeSalary;
    String grade;
    public void Input() throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader (System.in));
        System.out.println("Please enter empolyee name ");
        name = br.readLine();
        System.out.println("Please enter empolyee age ");
        age = Integer.parseInt(br.readLine());
        System.out.println("Please enter empolyee Gross Salary ");
        grossSalary = Double.parseDouble(br.readLine());
        System.out.println("Please enter empolyee Take Home Salary ");
        takeHomeSalary = Float.parseFloat(br.readLine());
        System.out.println("Please enter empolyee grade ");
        grade = br.readLine();
    }
    public void Display() throws IOException
    {
        System.out.println("Name : " + name);
        System.out.println("Age :" + age);
        System.out.println("GrossSalary : " + grossSalary);
        System.out.println("TakeHomeSalary : " + takeHomeSalary);
        System.out.println("Employee Grade :" + grade);
    }
}
class TST
{
    public static void main(String args[])throws IOException
    {
        int flag = 0;
        Employee emp1 = new Employee();
        System.out.println("MENU");
        System.out.println("1.Input");
        System.out.println("2.Display");
        System.out.println("3.Exit");
        BufferedReader br = new BufferedReader(new InputStreamReader (System.in));
        flag = Integer.parseInt(br.readLine());
        emp1.Input();
        emp1.Display();
    }
}





