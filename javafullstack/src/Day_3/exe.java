package Day_3;

abstract class calculate {
	abstract void sum();
	static void sub() {
		int a=10,b=5;
		System.out.println(a-b);
	}
	static void mul() {
		int d=10,e=5;
		System.out.println(d*e);
	}
	void div() {
		int a=10,b=5;
		System.out.println(a/b);
	}
	void mod() {
		int a=10,b=5;
		System.out.println(a%b);
	}
}
class exe extends calculate{
	void sum() {
		int a=10,b=5;
		System.out.println(a+b);
	}
    void square() {
    	int a=5;
    	System.out.println(a*a);
	}
	public static void main(String args[]) {
		exe t1=new exe();
		t1.sum();
	    t1.sub();
		t1.mul();
		t1.div();
		t1.mod();
		t1.square();
	}
}
