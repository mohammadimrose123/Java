package Day_2;
//import java.util.Scanner;
public class switchcase {
	public static void main(String[] args) {
//Scanner sc=new Scanner(System.in);
//
System.out.println("choose the color and  celebrate festival:");
		
//System.out.println(color+" is the symbolic color for festival ");
		System.out.println(args[0]);

	switch(args[0]) {
		case "red":
			System.out.println("celebrate holi");
			break;
		case "green":
			System.out.println("celebrate ramzan");
			break;
		case "white":
			System.out.println("celebrate cristmas");
			break;
			default:
				System.out.println("no festival celebrated");
				
		}
	}

}
