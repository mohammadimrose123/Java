package Day_1;

public class logicaloperators {
	boolean a=true,b=false;
	static boolean x=true,y=false;
	void and() {
		System.out.println(a&b);
	}
	void or() {
		System.out.println(x|y);
	}
	void not() {
		boolean a=true;
		System.out.println(!a);
	}
	public static void main(String[] args) {
		logicaloperators l1=new logicaloperators(); 
		l1.and();
		l1.or();
		l1.not();
	}

}