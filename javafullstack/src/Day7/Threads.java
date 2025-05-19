package Day7;
public class Threads extends Thread {
//creation of Thread
	public static void main(String[] args) {
//		Threads t1=new Threads();
//		Threads t2=new Threads();
//		Threads t3=new Threads();
//		Threads t4=new Threads();
//		Threads t5=new Threads();
//	System.out.println(t1.getName());
//	System.out.println(t2.getName());
//	System.out.println(t3.getName());
//	System.out.println(t4.getName());
//	System.out.println(t5.getName());
//			
//	}
//}
		
//__________________________________________________________
//Thread start 
Threads t1=new Threads();
Thread t=new Thread(t1);
t.start();
System.out.println("hi");
try {
	Thread.sleep(20000);
} catch(InterruptedException e) {
	e.printStackTrace();
	
}
System.out.println("hello");
	}
}




