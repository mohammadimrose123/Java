package Assignment3;
import java.util.Scanner;

class Employee1 {
    private int empid;
    private String empname;
    private double salary;
    private String mobilenumber;

    public Employee1(int empid, String empname, double salary, String mobilenumber) {
        this.empid = empid;
        this.empname = empname;
        this.salary = salary;
        this.mobilenumber = mobilenumber;
    }

    public void displayDetails() {
        System.out.println("Employee ID: " + empid);
        System.out.println("Name: " + empname);
        System.out.println("Salary: " + salary);
        System.out.println("Mobile Number: " + mobilenumber);
        System.out.println("------------------------");
    }
}

public class Employee {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Employee1[] employees = new Employee1[3];

        for (int i = 0; i < 3; i++) {
            System.out.println("Enter details for Employee " + (i + 1) + ":");
            System.out.print("Employee ID: ");
            int empid = in.nextInt();
            in.nextLine();
            System.out.print("Employee Name: ");
            String empname = in.nextLine();
            System.out.print("Salary: ");
            double salary = in.nextDouble();
            in.nextLine();
            System.out.print("Mobile Number: ");
            String mobilenumber = in.nextLine();

            employees[i] = new Employee1(empid, empname, salary, mobilenumber);
        }

        System.out.println("\nDetails of All Employees:");
        for (Employee1 emp : employees) {
            emp.displayDetails();
        }

        in.close();
    }
}