package Day_2;

import java.util.Scanner;

public class Demo4 {
	public static void main(String[]args) {
	Scanner s=new Scanner(System.in);
	int age=s.nextInt();
	if(age>=18) {
		System.out.println("major and he/she are eligible for vote");
	}
	else
		 {
			System.out.println("minor and he/she are not eligible for vote");
		}
	}
}
