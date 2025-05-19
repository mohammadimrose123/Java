package Day6;
//without try-catch block 
//public class ExceptionHandling {
//	public static void main(String[] args) {
//		int a=Integer.parseInt(args[0]);
//		int b=Integer.parseInt(args[1]);
//		int c=a/b; //Runtime Errors
//		System.out.println(c);
//		System.out.println("Hello World");
//	}
//}
//with try-catch block
public class ExceptionHandling{
	public static void main(String[] args) {
		int a=Integer.parseInt(args[0]);
		int b=Integer.parseInt(args[1]);
		System.out.println("hi");
		try {
		int c=a/b;
		System.out.println(c);
		}
		catch(Exception e) {
			//Different ways of printing Exception
			e.printStackTrace();// printStackTrace() method used to Highlight the Exception
			System.out.println(e);// or  System.out.println(e.toString()); used to show Exception with Message
			System.out.println(e.getMessage());//using getMessage() method only print Exception message 
			
		}
		System.out.println("hello");
		
	}
}
