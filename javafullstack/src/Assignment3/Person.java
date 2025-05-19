
package Assignment3;
import java.util.Scanner;
public class Person {
    private String name;
    private int age;

    public void setName(String n) {
        name = n;
    }

    public void setAge(int a) {
        age = a;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public static void main(String[] args) {
        Person p = new Person();
        Scanner in = new Scanner(System.in);

        System.out.print("Enter Name: ");
        String name = in.nextLine();
        System.out.print("Enter Age: ");
        int age = in.nextInt();
        p.setName(name);
        p.setAge(age);

        // Print the person details
        System.out.println("Person Details:");
        System.out.println("Name: " + p.getName());
        System.out.println("Age: " + p.getAge());

        in.close(); // Close the scanner to prevent resource leaks
    }
}