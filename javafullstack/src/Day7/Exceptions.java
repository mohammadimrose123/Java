package Day7;
//import java.util.InputMismatchException;//io Exception 
//import java.io.*;
//import java.util.Scanner;
//class Exceptions {
//	public  static void main(String args[]) {
//	Scanner sc=new Scanner(System.in);
//	System.out.println("Enter a ,b values:");
//	try {
//	int a=sc.nextInt();
//	int b=sc.nextInt();
//	int c=a/b;
//	System.out.println(c);
//	}
//	//pip is used to handle multiple exceptions in a single catch block
//	catch(ArithmeticException | InputMismatchException e){
//		System.out.println(e.getMessage());
////	}catch(InputMismatchException e) {
////		System.out.println(e.getMessage());
//	}
//		
//	}
//
//}
// with using throws on unchecked exception
//import java.util.*;
//class Exceptions {
//	public  static void main(String args[])throws ArithmeticException {
//	Scanner sc=new Scanner(System.in);
//	System.out.println("Enter a ,b values:");
////	try {
//	int a=sc.nextInt();
//	int b=sc.nextInt();
//	int c=a/b;
//	System.out.println(c);
//	}
//}
//with using throws and try-catch- block on unchecked Exception
//import java.util.*;
//class Exceptions {
//	public  static void main(String args[])throws  ArithmeticException {
//	Scanner sc=new Scanner(System.in);
//	System.out.println("Enter a ,b values:");
//	try {
//	int a=sc.nextInt();
//	int b=sc.nextInt();
//	int c=a/b;
//	System.out.println(c);
//	}
//
//	
//	//pip is used to handle multiple exceptions in a single catch block
//	catch(ArithmeticException | InputMismatchException e){
//		System.out.println(e.getMessage());
////	}catch(InputMismatchException e) {
//		System.out.println(e.getMessage());
//	}
//	}
//}
		
//	}
//
//}
//-------------------------------------------------------------------------------

//FileNotFoundException of checkedException
//import java.io.*;
//import java.util.*;
// public class Exceptions {
//	public  static void main(String args[])throws FileNotFoundException  {
//
//	File obj =new File("C:\\Users\\Welcome\\OneDrive\\Desktop");
//	 Scanner Reader=new Scanner(obj);
//	while(Reader.hasNextLine()) {
//		String data=Reader.nextLine();
//		System.out.println(data);
//		 
//	}
//	Reader.close();
//	
//
//	
//	}
//	}
		// using multiple exceptions by throws keyword
//	public static void main(String[] args)throws  InputMismatchException, FileNotFoundException {
//				File obj =new File("C:\\Users\\Welcome\\OneDrive\\Desktop");
//		 Scanner Reader=new Scanner(obj);
//	while(Reader.hasNextLine()) {
//			String data=Reader.nextLine();
//			System.out.println(data);
//			 
//		}
//		Reader.close()	;
//	
//		
//		}		
//}
//
	 //----------------------------------------------------------------------
	 
	//throws on created method
//	void add()throws ArithmeticException,InputMismatchException {
//		Scanner sc=new Scanner(System.in);
//		int a=sc.nextInt();
//		int b=sc.nextInt();
//		int c=a/b;
//	System.out.println(c);
//		
//	}
//	public static void main(String[] args) {
//		Exceptions e1=new Exceptions();
//		e1.add();
//	}
//		
//	}
// user defined try-catch block
//	 static void add(int a,int b) {
//		 int c=a/b;
//		 System.out.println(c);
//	 }
// 
//	 public static void main(String[] args) {
//		 try {
//			 add(10,0);
//		 }
//		 catch(ArithmeticException e) {
//			 System.out.println(e);
//		 }
//	 }
// }
// -------------------------------------------------------------------------
	 
 // using all keywords
//	 static void add(int a,int b) {
//		 if(b==0) {
//			 throw new ArithmeticException("maths radha niku");
//		 }
//		 int c=a/b;
//		 System.out.println(c);
//	 }
//	 public static void main(String[] args) {
//		 try {
//			 add(10,0);
//		 }
//		 catch(ArithmeticException e) {
//			 System.out.println(e.getMessage());
//		 }
//		 finally {
//			 System.out.println("coverd all keywords");
//		 }
//	 }
// }

//_________________________________________________________________________________

 //user defined Exceptions
//import java.io.*;
//import java.util.*;
//class CheppanuException extends Exception{
//	public CheppanuException(String message) { 
//		super(message);
//	}
//}
//public class Exceptions{
//	public static void ageCheck(int age)throws CheppanuException{
//		   if(age>18) {
//			   System.out.println("nenu Cheppanu");
//		   }
//		   else {
//			   System.out.println("na age 18 below");
//		   }
//		}
//		public static void main(String[] args) {
//			try {
//				ageCheck(24);
//
//		}
//			catch(CheppanuException e) {
//				System.out.println(e.getMessage());
//			}
//		finally {
//			System.out.println("happy coding");
//		}
//	}
//}
//-------------------------------------------------------------------
//Example
//import java.io.*;
//import java.util.*;
//class Imrose extends Exception{
//	public Imrose(String message) { 
//		super(message);
//	}
//}
//public class Exceptions{
//	public static void evenCheck(int even)throws Imrose{
//		   if(even%2==0) {
//			   System.out.println("naku maths vachu");
//		   }
//		   else {
//			   System.out.println("na maths vachina ranaatu");
//		   }
//		}
//		public static void main(String[] args) {
//			try {
//				evenCheck(24);
//
//		}
//			catch(Imrose e) {
//				System.out.println(e.getMessage());
//			}
//		finally {
//			System.out.println("maths oka confusion");
//		}
//	}
//}

//________________________________________________________

//classNotFoundException
import java.util.*;
public class Exceptions{
public static void main(String[] args) {
		Scanner s1=new Scanner(System.in);
		try {
			System.out.println("Enter the class name:");
			String className=s1.next();
			Class.forName(className);
			System.out.println("The class was found:");
			
		}
		catch(ClassNotFoundException e) {
			System.out.println("Class not found: "+e.getMessage());
		}
		finally {
			s1.close();
		}
	}
}

//*****************************Succussfully Completed*************************************

 
	 
