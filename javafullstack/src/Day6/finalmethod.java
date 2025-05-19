package Day6;
class Test1{
	final void show() {
		System.out.println("hi");
	}
}
public class finalmethod extends Test1 {
	void show() {
	int a=23;
	System.out.println(a);
	a=23;
	System.out.println(a);
	}
	public static void main(String[] args) {
		finalmethod f1=new finalmethod();
		f1.show();
	}
	
}
