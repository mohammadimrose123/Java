package Assignment;
import java.util.Scanner;
public class password_validation {
	public static String validPassword(String password) {
		if(password.length()<8) {
			return "password must be at least 8 characters long";
		}
		boolean hasUpper=false;
		boolean hasLower=false;
		boolean hasDigit=false;
		boolean hasSpecial=false;
		String SpecialChars="!@#$%^&*()_=[]{}|;,.<>?";
		for(char c:password.toCharArray()) {
			if(Character.isUpperCase(c)) {
				hasUpper=true;
			}else if(Character.isLowerCase(c)) {
				hasLower=true;
			}
			else if(Character.isDigit(c)) {
				hasDigit=true;
			}
			else if(SpecialChars.indexOf(c)!=-1) {
				hasSpecial=true;
			}
		}
		   if (!hasUpper) {
	            return "Password must contain at least one uppercase letter";
	        }
	        if (!hasLower) {
	            return "Password must contain at least one lowercase letter";
	        }
	        if (!hasDigit) {
	            return "Password must contain at least one digit";
	        }
	        if (!hasSpecial) {
	            return "Password must contain at least one special character";
	        }

	        return "Password is valid!";
	    }
public static void main(String[]args) {
	Scanner scanner=new Scanner(System.in);
	String continueTesting;
	do {
		System.out.println("Enter a password to validate: ");
        String password = scanner.nextLine();

        System.out.println(validPassword(password));

        System.out.println("Do you want to test another password? (yes/no): ");
        continueTesting = scanner.nextLine().trim().toLowerCase();
    } while (continueTesting.equals("yes"));

    scanner.close();
    System.out.println("Thank you for using the password validator!");
}
}
