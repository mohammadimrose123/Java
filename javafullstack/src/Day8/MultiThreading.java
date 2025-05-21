package Day8;
//
//public class MultiThreading extends Thread{
	
// example1
	
//	public void  run() {
//	System.out.println("Hello");
//	}
//	public static void main(String[] args) {
//		MultiThreading mt=new MultiThreading();
//		mt.start();
//		System.out.println("virat kohli");
//		
//	}
//
//}
//---------------------------------------------------|
//public void run() {
//	System.out.println("Hi");
//	
//}
//public static void main(String[] args) {
//	MultiThreading mt=new MultiThreading();
//	Thread t1=new Thread(mt);
//	System.out.println("Virat");
//	t1.start();
//}
//}
	//---------------------------------------------------
	// another method 
// public void run()=>{
//		
//	}
//	public static void main(String[] args) {
//		MultiThreading mt=new MultiThreading();
//		Thread t1=new Thread(mt);
//		System.out.println("Virat");
//		t1.start();
//	}
//	}
	//__________________________________________________
	// creating two threads calling one method
//	public void run() {
//		System.out.println("hi");
//	}
//	public static void main(String[] args) {
//		MultiThreading mt=new MultiThreading();
//		MultiThreading mt1=new MultiThreading();
//		Thread t1=new Thread(mt);
//		Thread t2=new Thread(mt1);
//		System.out.println("hello virat");
//		mt.start();
//		mt1.start();
//		
//	}
//	}
//----------------------------------------------------
	// creating two class 
//class Test2 extends Thread{
//	public void run() {
//		System.out.println("Hi");
//	}
//}
//class Test3 implements Runnable{
//	public void run() {
//		System.out.println("Good Morning virat");
//	}
//}
//class Test1{
//	public static void main(String[] args) {
//		Test2 t1=new Test2();
//		Test3 t2=new Test3();
//		t1.start();
//		Thread t3=new Thread(t2);
//		t3.start();
//			}
//	}
//____________________________________________________
// Example program
//class Test1 extends Thread{
//	public void run() {
//		System.out.println("Hello Java");
//	}
//}
//class Test2 extends Test1{
//	public void run() {
//		System.out.println("Hello Users");
//	}
//}
//class Test3 implements Runnable{
//	public void run() {
//		System.out.println("What is your new Version?");
//	}
//	
//}
//class Test4 extends Test3{
//	public void run() {
//		System.out.println("Java 24");
//		
//	}
//}
//class MultiThreading{
//	public static void main(String[] args) {
//		Test1 t1=new Test1();
//		Test2 t2=new Test2();
//		Test3 t3=new Test3();
//		Test4 t4=new Test4();
//		t1.start();
//		t2.start();
//	Thread t5=new Thread(t3);
//	t5.start();
//	Thread t6=new Thread(t4);
//	t6.start();
//	
//	}
//}
//---------------------------------------------------------
//class MultiThreading{
//	public static void main(String[] args) {
//		// creating Anyonmous class
//		Runnable r1=new Runnable() {
//			public void run() {
//				System.out.println("Task One");
//			}
//			};
//			Runnable r2=new Runnable() {
//				public void run() {
//					System.out.println("Task Two");
//				}
//			};
//			Thread t1=new Thread(r1);
//			Thread t2=new Thread(r2);
//			t1.start();
//			t2.start();
//			
//}
//	}
//--------------------------------------------------------
//public class MultiThreading extends Thread{
//	public void run() {
//		for(int i=0;i<=10;i++) {
//			System.out.println(i);
//			if(i==5) {
//				try {
//					Thread.sleep(2000);
//				}
//				catch(InterruptedException e) {
//					e.printStackTrace();
//				}
//			}
//		}   
//	}
//		
//	public static void main(String[] args) {
//		MultiThreading t1=new MultiThreading();
//		
//		for(int i=0;i<=10;i++) {
//			System.out.println(i);
//		
//				}
//		t1.start();
//			}
//}
 //------------------------------------------------
//Directly classing the class in Thread
//public class MultiThreading implements Runnable{
//	public void  run() {
//		System.out.println("Hi");
//	}
//	public static void main(String[] args) {
//		
//	      Thread t1=new Thread(new MultiThreading());
//	      t1.start();
//	}
//}
//**************** Scussfully completed******************
 
	
	


