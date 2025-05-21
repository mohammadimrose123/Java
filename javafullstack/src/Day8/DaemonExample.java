package Day8;

public class DaemonExample  extends Thread{
	String s;
	public DaemonExample(String name) {
		s=name;
	}
	public void run() {
		if(Thread.currentThread().isDaemon()) {
			System.out.println(s +" is Daemon Thread");
		}
		else {
			System.out.println(s+" is User Thread");
		}
	}


public static void main(String[] args) {
	DaemonExample de=new DaemonExample("de");
	DaemonExample de1=new DaemonExample("de1");
	DaemonExample de2= new DaemonExample("de2");
	de.setDaemon(true);
	de.start();
	de1.start();
	de2.setDaemon(false);
	de2.start();
}
}
