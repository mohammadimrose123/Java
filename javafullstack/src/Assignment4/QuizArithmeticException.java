package Assignment4;
import java.util.*;

public class QuizArithmeticException {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Enter the value of 'a': ");
            int a = sc.nextInt();

            System.out.println("Enter the value of 'b': ");
            int b = sc.nextInt();

            int result = a / b;
            System.out.println("Result of a/b: " + result);

        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception: " + e.getMessage());
        } catch (InputMismatchException e) {
            System.out.println("Input Mismatch Exception: Please enter valid integer values.");
        } finally {
            sc.close();
        }
    }
}
